package xsistens.scalajs.bootstrap.modal

import japgolly.scalajs.react._
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSName

trait ModalBodyProperty extends js.Object {
  val key: js.UndefOr[js.Any] = js.native
  val ref: js.UndefOr[String] = js.native
  val className: js.UndefOr[String] = js.native
  val componentClass: js.UndefOr[js.Any] = js.native

  val modalClassName: js.UndefOr[String] = js.native
}

trait ModalBodyState extends js.Object

@JSName("ReactBootstrap.ModalBody")
object BootstrapModalBody extends JsComponentType[ModalBodyProperty, ModalBodyState, HTMLElement]

trait ModalBodyM extends JsComponentM[ModalBodyProperty, ModalBodyState, HTMLElement]

object ModalBodyProperty {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,

            modalClassName: js.UndefOr[String] = js.undefined): ModalBodyProperty = {
    val p = js.Dynamic.literal()

    className.foreach(p.updateDynamic("className")(_))
    modalClassName.foreach(p.updateDynamic("modalClassName")(_))

    p.asInstanceOf[ModalBodyProperty]
  }
}

trait ModalBody extends ReactComponentU[Unit, Unit, Unit, TopNode]

object ModalBody {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,

            modalClassName: js.UndefOr[String] = js.undefined)(children: ReactNode*): ModalBody = {
    val component = ReactComponentB[Unit]("ModalBody")
      .stateless
      .noBackend
      .render { scope =>
        val factory = React.createFactory(BootstrapModalBody)
        factory(ModalBodyProperty(
          key,
          ref,
          className,
          modalClassName), children)
      }.buildU
    component.set(key = key.asInstanceOf[UndefOr[js.Any]], ref = ref)().asInstanceOf[ModalBody]
  }
}