package ghpages.pages

import ghpages.examples._
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra._
import japgolly.scalajs.react.extra.router2.{RouterConfigDsl, RouterCtl}
import japgolly.scalajs.react.vdom.prefix_<^._

import scalaz.Equal
import scalaz.syntax.equal._

sealed abstract class Example(val title: String,
                              val routerPath: String,
                              val render: () => ReactElement)

object Example {
  import ghpages.examples.util._
  implicit private def auto1(v: SideBySide.Content): () => ReactElement = () => v()
  implicit private def auto2(v: SingleSide.Content): () => ReactElement = () => v()

  case object Animation    extends Example("Animation",          "animation",        AnimationExample    .content)

  implicit val equality   : Equal[Example]       = Equal.equalA
  implicit val reusability: Reusability[Example] = Reusability.byEqual

  val values = Vector[Example](Animation)                                 // General usage

  def default: Example =
    values.head

  def routes = RouterConfigDsl[Example].buildRule { dsl =>
    import ExamplesPage._
    import dsl._
    values.map(e =>
      staticRoute(e.routerPath, e) ~> renderR(r => component(Props(e, r)))
    ).reduce(_ | _)
  }
}

// =====================================================================================================================

object ExamplesPage {

  case class Props(current: Example, router: RouterCtl[Example])

  implicit val propsReuse = Reusability.caseClass[Props]

  val menu = ReactComponentB[Props]("Example menu")
    .render { p =>
      def menuItem(e: Example) = {
        val active = e === p.current
        <.li(
          ^.classSet1("list-group-item", "active" -> active),
          p.router setOnClick e,
          e.title)
      }
      <.div(^.cls := "col-md-2",
        <.ul(^.cls := "list-group",
          Example.values map menuItem))
    }
    .configure(Reusability.shouldComponentUpdate)
    .build

  val body = ReactComponentB[Example]("Example body")
    .render(eg =>
      <.div(
        ^.cls := "col-md-10",
        eg.render()))
    .build

  val component = ReactComponentB[Props]("Examples")
    .render(p =>
      <.div(^.cls := "row",
        menu(p),
        body(p.current))
    ).build
}
