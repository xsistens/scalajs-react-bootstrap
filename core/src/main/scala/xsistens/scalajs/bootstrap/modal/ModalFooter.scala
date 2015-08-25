package xsistens.scalajs.bootstrap.modal

import japgolly.scalajs.react._
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSName

trait ModalFooterProperty extends js.Object {
  val key: js.UndefOr[js.Any] = js.native
  val ref: js.UndefOr[String] = js.native
  val className: js.UndefOr[String] = js.native
  val componentClass: js.UndefOr[js.Any] = js.native

  val modalClassName: js.UndefOr[String] = js.native
}

trait ModalFooterState extends js.Object

@JSName("ReactBootstrap.ModalFooter")
object BootstrapModalFooter extends JsComponentType[ModalFooterProperty, ModalFooterState, HTMLElement]

trait ModalFooterM extends JsComponentM[ModalFooterProperty, ModalFooterState, HTMLElement]

object ModalFooterProperty {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,

            modalClassName: js.UndefOr[String] = js.undefined): ModalFooterProperty = {
    val p = js.Dynamic.literal()

    className.foreach(p.updateDynamic("className")(_))
    modalClassName.foreach(p.updateDynamic("modalClassName")(_))

    p.asInstanceOf[ModalFooterProperty]
  }
}

trait ModalFooter extends ReactComponentU[Unit, Unit, Unit, TopNode]

object ModalFooter {
  def apply(key: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            className: js.UndefOr[String] = js.undefined,

            modalClassName: js.UndefOr[String] = js.undefined)(children: ReactNode*): ModalFooter = {
    val component = ReactComponentB[Unit]("ModalFooter")
      .stateless
      .noBackend
      .render { scope =>
        val factory = React.createFactory(BootstrapModalFooter)
        factory(ModalFooterProperty(
          key,
          ref,
          className,
          modalClassName), children)
      }.buildU
    component.set(key = key.asInstanceOf[UndefOr[js.Any]], ref = ref)().asInstanceOf[ModalFooter]
  }
}