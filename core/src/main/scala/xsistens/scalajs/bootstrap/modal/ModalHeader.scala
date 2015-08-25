package xsistens.scalajs.bootstrap.modal

import japgolly.scalajs.react._
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSName

trait ModalHeaderProperty extends js.Object {
  val key: js.UndefOr[js.Any] = js.native
  val ref: js.UndefOr[String] = js.native
  val className: js.UndefOr[String] = js.native
  val componentClass: js.UndefOr[js.Any] = js.native

  val modalClassName: js.UndefOr[String] = js.native
  val closeButton: js.UndefOr[Boolean] = js.native
  val onHide: js.UndefOr[() => Unit] = js.native
}

trait ModalHeaderState extends js.Object

@JSName("ReactBootstrap.ModalHeader")
object BootstrapModalHeader extends JsComponentType[ModalHeaderProperty, ModalHeaderState, HTMLElement]

trait ModalHeaderM extends JsComponentM[ModalHeaderProperty, ModalHeaderState, HTMLElement]

object ModalHeaderProperty {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,

            modalClassName: js.UndefOr[String] = js.undefined,
            closeButton: js.UndefOr[Boolean] = js.undefined,
            onHide: js.UndefOr[() => Unit] = js.undefined): ModalHeaderProperty = {
    val p = js.Dynamic.literal()

    className.foreach(p.updateDynamic("className")(_))
    modalClassName.foreach(p.updateDynamic("modalClassName")(_))
    closeButton.foreach(p.updateDynamic("closeButton")(_))
    onHide.foreach(p.updateDynamic("onHide")(_))

    p.asInstanceOf[ModalHeaderProperty]
  }
}

trait ModalHeader extends ReactComponentU[Unit, Unit, Unit, TopNode]

object ModalHeader {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,

            modalClassName: js.UndefOr[String] = js.undefined,
            closeButton: js.UndefOr[Boolean] = js.undefined,
            onHide: js.UndefOr[() => Unit] = js.undefined)(title: ModalTitle): ModalHeader = {
    val component = ReactComponentB[Unit]("ModalHeader")
      .stateless
      .noBackend
      .render { scope =>
        val factory = React.createFactory(BootstrapModalHeader)
        factory(ModalHeaderProperty(
          key,
          ref,
          className,
          modalClassName,
          closeButton,
          onHide), title)
      }.buildU
    component.set(key = key.asInstanceOf[UndefOr[js.Any]], ref = ref)().asInstanceOf[ModalHeader]
  }
}