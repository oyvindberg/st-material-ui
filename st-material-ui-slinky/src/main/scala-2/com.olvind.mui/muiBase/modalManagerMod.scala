package com.olvind.mui.muiBase

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalManagerMod {
  
  @JSImport("@mui/base/ModalUnstyled/ModalManager", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ModalManager
  
  @js.native
  trait ManagedModalProps extends StObject {
    
    var disableScrollLock: js.UndefOr[Boolean] = js.native
  }
  object ManagedModalProps {
    
    @scala.inline
    def apply(): ManagedModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagedModalProps]
    }
    
    @scala.inline
    implicit class ManagedModalPropsMutableBuilder[Self <: ManagedModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableScrollLock(value: Boolean): Self = StObject.set(x, "disableScrollLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScrollLockUndefined: Self = StObject.set(x, "disableScrollLock", js.undefined)
    }
  }
  
  @js.native
  trait Modal extends StObject {
    
    var modalRef: Element = js.native
    
    var mount: Element = js.native
  }
  object Modal {
    
    @scala.inline
    def apply(modalRef: Element, mount: Element): Modal = {
      val __obj = js.Dynamic.literal(modalRef = modalRef.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modal]
    }
    
    @scala.inline
    implicit class ModalMutableBuilder[Self <: Modal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModalRef(value: Element): Self = StObject.set(x, "modalRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMount(value: Element): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
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
  }
  object ModalManager {
    
    @scala.inline
    def apply(
      add: (Modal, HTMLElement) => Double,
      containers: Any,
      isTopModal: Modal => Boolean,
      modals: Any,
      mount: (Modal, ManagedModalProps) => Unit,
      remove: Modal => Double
    ): ModalManager = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), containers = containers.asInstanceOf[js.Any], isTopModal = js.Any.fromFunction1(isTopModal), modals = modals.asInstanceOf[js.Any], mount = js.Any.fromFunction2(mount), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[ModalManager]
    }
    
    @scala.inline
    implicit class ModalManagerMutableBuilder[Self <: ModalManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (Modal, HTMLElement) => Double): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContainers(value: Any): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTopModal(value: Modal => Boolean): Self = StObject.set(x, "isTopModal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModals(value: Any): Self = StObject.set(x, "modals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMount(value: (Modal, ManagedModalProps) => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemove(value: Modal => Double): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
