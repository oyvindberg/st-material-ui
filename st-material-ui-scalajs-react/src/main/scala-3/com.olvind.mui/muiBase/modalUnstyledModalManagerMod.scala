package com.olvind.mui.muiBase

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalUnstyledModalManagerMod {
  
  @JSImport("@mui/base/ModalUnstyled/ModalManager", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ModalManager
  
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
  
  @js.native
  trait ModalManager extends StObject {
    
    def add(modal: Modal, container: HTMLElement): Double = js.native
    
    /* private */ var containers: Any = js.native
    
    def isTopModal(modal: Modal): Boolean = js.native
    
    /* private */ var modals: Any = js.native
    
    def mount(modal: Modal, props: ManagedModalProps): Unit = js.native
    
    def remove(modal: Modal): Double = js.native
    def remove(modal: Modal, ariaHiddenState: Boolean): Double = js.native
  }
}
