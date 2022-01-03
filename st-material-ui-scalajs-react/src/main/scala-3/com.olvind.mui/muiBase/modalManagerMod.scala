package com.olvind.mui.muiBase

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalManagerMod {
  
  @JSImport("@mui/base/ModalUnstyled/ModalManager", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ModalManager {
    
    /* CompleteClass */
    override def add(modal: Modal, container: HTMLElement): Double = js.native
    
    /* private */ /* CompleteClass */
    var containers: Any = js.native
    
    /* CompleteClass */
    override def isTopModal(modal: Modal): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var modals: Any = js.native
    
    /* CompleteClass */
    override def mount(modal: Modal, props: ManagedModalProps): Unit = js.native
    
    /* CompleteClass */
    override def remove(modal: Modal): Double = js.native
  }
  
  trait ManagedModalProps extends StObject {
    
    var disableScrollLock: js.UndefOr[Boolean] = js.undefined
  }
  object ManagedModalProps {
    
    inline def apply(): ManagedModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagedModalProps]
    }
    
    extension [Self <: ManagedModalProps](x: Self) {
      
      inline def setDisableScrollLock(value: Boolean): Self = StObject.set(x, "disableScrollLock", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollLockUndefined: Self = StObject.set(x, "disableScrollLock", js.undefined)
    }
  }
  
  trait Modal extends StObject {
    
    var modalRef: Element
    
    var mount: Element
  }
  object Modal {
    
    inline def apply(modalRef: Element, mount: Element): Modal = {
      val __obj = js.Dynamic.literal(modalRef = modalRef.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modal]
    }
    
    extension [Self <: Modal](x: Self) {
      
      inline def setModalRef(value: Element): Self = StObject.set(x, "modalRef", value.asInstanceOf[js.Any])
      
      inline def setMount(value: Element): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModalManager extends StObject {
    
    def add(modal: Modal, container: HTMLElement): Double
    
    /* private */ var containers: Any
    
    def isTopModal(modal: Modal): Boolean
    
    /* private */ var modals: Any
    
    def mount(modal: Modal, props: ManagedModalProps): Unit
    
    def remove(modal: Modal): Double
  }
  object ModalManager {
    
    inline def apply(
      add: (Modal, HTMLElement) => Double,
      containers: Any,
      isTopModal: Modal => Boolean,
      modals: Any,
      mount: (Modal, ManagedModalProps) => Callback,
      remove: Modal => Double
    ): ModalManager = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), containers = containers.asInstanceOf[js.Any], isTopModal = js.Any.fromFunction1(isTopModal), modals = modals.asInstanceOf[js.Any], mount = js.Any.fromFunction2((t0: Modal, t1: ManagedModalProps) => (mount(t0, t1)).runNow()), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[ModalManager]
    }
    
    extension [Self <: ModalManager](x: Self) {
      
      inline def setAdd(value: (Modal, HTMLElement) => Double): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setContainers(value: Any): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      inline def setIsTopModal(value: Modal => Boolean): Self = StObject.set(x, "isTopModal", js.Any.fromFunction1(value))
      
      inline def setModals(value: Any): Self = StObject.set(x, "modals", value.asInstanceOf[js.Any])
      
      inline def setMount(value: (Modal, ManagedModalProps) => Callback): Self = StObject.set(x, "mount", js.Any.fromFunction2((t0: Modal, t1: ManagedModalProps) => (value(t0, t1)).runNow()))
      
      inline def setRemove(value: Modal => Double): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
