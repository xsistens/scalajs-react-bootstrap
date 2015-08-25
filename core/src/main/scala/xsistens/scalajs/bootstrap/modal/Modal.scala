package xsistens.scalajs.bootstrap.modal

import japgolly.scalajs.react._
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSName

trait ModalProperty extends js.Object {
  val key: js.UndefOr[js.Any] = js.native
  val ref: js.UndefOr[String] = js.native
  val className: js.UndefOr[String] = js.native
  val componentClass: js.UndefOr[js.Any] = js.native

  val show: js.UndefOr[Boolean] = js.native
  val container: js.UndefOr[Any] = js.native
  val onHide: Option[() => Unit] = js.native
  val dialogClassName: js.UndefOr[String] = js.native
  val backdrop: js.UndefOr[Any] = js.native
  val keyboard: js.UndefOr[Boolean] = js.native
  val animation: js.UndefOr[Boolean] = js.native
  val dialogComponent: js.UndefOr[Any] = js.native
  val autoFocus: js.UndefOr[Boolean] = js.native
  val enforceFocus: js.UndefOr[Boolean] = js.native
}

trait ModalState extends js.Object {
  val exited: js.UndefOr[Boolean] = js.native
}

@JSName("ReactBootstrap.Modal")
object BootstrapModal extends JsComponentType[ModalProperty, ModalState, HTMLElement]

trait ModalM extends JsComponentM[ModalProperty, ModalState, HTMLElement]

object ModalProperty {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,
            componentClass: js.UndefOr[js.Any] = js.undefined,

            show: js.UndefOr[Boolean] = js.undefined,
            container: js.UndefOr[js.Any] = js.undefined,
            onHide: Option[() => Unit] = None,
            dialogClassName: js.UndefOr[String] = js.undefined,
            backdrop: js.UndefOr[js.Any] = js.undefined,
            keyboard: js.UndefOr[Boolean] = js.undefined,
            animation: js.UndefOr[Boolean] = js.undefined,
            dialogComponent: js.UndefOr[js.Any] = js.undefined,
            autoFocus: js.UndefOr[Boolean] = js.undefined,
            enforceFocus: js.UndefOr[Boolean] = js.undefined): ModalProperty = {
    val p = js.Dynamic.literal()

    ref.foreach(p.updateDynamic("ref")(_))
    show.foreach(p.updateDynamic("show")(_))
    container.foreach(p.updateDynamic("container")(_))
    onHide.foreach(p.updateDynamic("onHide")(_))
    dialogClassName.foreach(p.updateDynamic("dialogClassName")(_))
    backdrop.foreach(p.updateDynamic("backdrop")(_))
    keyboard.foreach(p.updateDynamic("keyboard")(_))
    animation.foreach(p.updateDynamic("animation")(_))
    dialogComponent.foreach(p.updateDynamic("dialogComponent")(_))
    autoFocus.foreach(p.updateDynamic("autoFocus")(_))
    enforceFocus.foreach(p.updateDynamic("enfoceFocus")(_))

    p.asInstanceOf[ModalProperty]
  }
}

object ModalState {
  def apply(prevState: ModalState)(
    exited: js.UndefOr[Boolean] = js.undefined): ModalState = {
    val p = js.Dynamic.literal()

    exited.orElse(prevState.exited).foreach(p.updateDynamic("exited")(_))

    p.asInstanceOf[ModalState]
  }
}

object Modal {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,
            componentClass: js.UndefOr[js.Any] = js.undefined,

            show: js.UndefOr[Boolean] = js.undefined,
            container: js.UndefOr[js.Any] = js.undefined,
            onHide: Option[() => Unit] = None,
            dialogClassName: js.UndefOr[String] = js.undefined,
            backdrop: js.UndefOr[js.Any] = js.undefined,
            keyboard: js.UndefOr[Boolean] = js.undefined,
            animation: js.UndefOr[Boolean] = js.undefined,
            dialogComponent: js.UndefOr[js.Any] = js.undefined,
            autoFocus: js.UndefOr[Boolean] = js.undefined,
            enforceFocus: js.UndefOr[Boolean] = js.undefined)(header: ModalHeader, body: ModalBody, footer: ModalFooter) = {
    val component = ReactComponentB[Unit]("Modal")
      .stateless
      .noBackend
      .render { scope =>
        val factory = React.createFactory(BootstrapModal)
        factory(ModalProperty(
          key,
          ref,
          className,
          componentClass,

          show,
          container,
          onHide,
          dialogClassName,

          backdrop,
          keyboard,
          animation,
          dialogComponent,

          autoFocus,
          enforceFocus), Seq(header, body, footer))
      }.buildU
    component.set(key = key.asInstanceOf[UndefOr[js.Any]], ref = ref)()
  }
}