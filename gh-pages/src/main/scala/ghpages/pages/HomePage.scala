package ghpages.pages

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object HomePage {

  private val p =
    <.p(^.margin := "1.3em 0")

  val component = ReactComponentB.static("Home",
    <.div(
      <.h1(
        <.a(
          ^.color := "#000",
          ^.href  := "https://github.com/xsistens/scalajs-react-bootstrap",
          "scalajs-react")),

      <.section(
        ^.marginTop := "2.2em",
        ^.fontSize  := "115%",
        ^.color     := "#333",



      ))
  ).buildU
}