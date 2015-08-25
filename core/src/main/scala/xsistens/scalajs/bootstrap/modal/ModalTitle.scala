package xsistens.scalajs.bootstrap.modal

import japgolly.scalajs.react._
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSName

trait ModalTitleProperty extends js.Object {
  val key: js.UndefOr[js.Any] = js.native
  val ref: js.UndefOr[String] = js.native
  val className: js.UndefOr[String] = js.native
  val componentClass: js.UndefOr[js.Any] = js.native

  val modalClassName: js.UndefOr[String] = js.native
}

trait ModalTitleState extends js.Object

@JSName("ReactBootstrap.ModalTitle")
object BootstrapModalTitle extends JsComponentType[ModalTitleProperty, ModalTitleState, HTMLElement]

trait ModalTitleM extends JsComponentM[ModalTitleProperty, ModalTitleState, HTMLElement]

object ModalTitleProperty {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,

            modalClassName: js.UndefOr[String] = js.undefined): ModalTitleProperty = {
    val p = js.Dynamic.literal()

    className.foreach(p.updateDynamic("className")(_))
    modalClassName.foreach(p.updateDynamic("modalClassName")(_))

    p.asInstanceOf[ModalTitleProperty]
  }
}

trait ModalTitle extends ReactComponentU[Unit, Unit, Unit, TopNode]

object ModalTitle {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,

            modalClassName: js.UndefOr[String] = js.undefined)(children: ReactNode*): ModalTitle = {
    val component = ReactComponentB[Unit]("ModalTitle")
      .stateless
      .noBackend
      .render { scope =>
        val factory = React.createFactory(BootstrapModalTitle)
        factory(ModalTitleProperty(
          key,
          ref,
          className,
          modalClassName), children)
      }.buildU
    component.set(key = key.asInstanceOf[UndefOr[js.Any]], ref = ref)().asInstanceOf[ModalTitle]
  }
}