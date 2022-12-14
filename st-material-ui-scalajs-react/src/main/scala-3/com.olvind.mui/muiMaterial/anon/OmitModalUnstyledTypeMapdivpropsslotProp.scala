package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.modalUnstyledModalUnstyledDottypesMod.ModalUnstyledSlots
import com.olvind.mui.react.mod.ReactEventHandler
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<ModalUnstyledTypeMap<{}, 'div'>['props'], 'slotProps'> */
trait OmitModalUnstyledTypeMapdivpropsslotProp extends StObject {
  
  var children: Element
  
  var closeAfterTransition: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[org.scalajs.dom.Element | (js.Function0[org.scalajs.dom.Element | Null]) | Null] = js.undefined
  
  var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
  
  var disableEnforceFocus: js.UndefOr[Boolean] = js.undefined
  
  var disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined
  
  var disablePortal: js.UndefOr[Boolean] = js.undefined
  
  var disableRestoreFocus: js.UndefOr[Boolean] = js.undefined
  
  var disableScrollLock: js.UndefOr[Boolean] = js.undefined
  
  var hideBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var keepMounted: js.UndefOr[Boolean] = js.undefined
  
  var onBackdropClick: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  var onClose: js.UndefOr[
    js.Function2[/* event */ js.Object, /* reason */ "backdropClick" | "escapeKeyDown", Unit]
  ] = js.undefined
  
  var open: Boolean
  
  var slots: js.UndefOr[ModalUnstyledSlots] = js.undefined
}
object OmitModalUnstyledTypeMapdivpropsslotProp {
  
  inline def apply(children: VdomElement, open: Boolean): OmitModalUnstyledTypeMapdivpropsslotProp = {
    val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitModalUnstyledTypeMapdivpropsslotProp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitModalUnstyledTypeMapdivpropsslotProp] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCloseAfterTransition(value: Boolean): Self = StObject.set(x, "closeAfterTransition", value.asInstanceOf[js.Any])
    
    inline def setCloseAfterTransitionUndefined: Self = StObject.set(x, "closeAfterTransition", js.undefined)
    
    inline def setContainer(value: org.scalajs.dom.Element | (js.Function0[org.scalajs.dom.Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerCallbackTo(value: CallbackTo[org.scalajs.dom.Element | Null]): Self = StObject.set(x, "container", value.toJsFn)
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
    
    inline def setDisableEnforceFocus(value: Boolean): Self = StObject.set(x, "disableEnforceFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableEnforceFocusUndefined: Self = StObject.set(x, "disableEnforceFocus", js.undefined)
    
    inline def setDisableEscapeKeyDown(value: Boolean): Self = StObject.set(x, "disableEscapeKeyDown", value.asInstanceOf[js.Any])
    
    inline def setDisableEscapeKeyDownUndefined: Self = StObject.set(x, "disableEscapeKeyDown", js.undefined)
    
    inline def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
    
    inline def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
    
    inline def setDisableRestoreFocus(value: Boolean): Self = StObject.set(x, "disableRestoreFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableRestoreFocusUndefined: Self = StObject.set(x, "disableRestoreFocus", js.undefined)
    
    inline def setDisableScrollLock(value: Boolean): Self = StObject.set(x, "disableScrollLock", value.asInstanceOf[js.Any])
    
    inline def setDisableScrollLockUndefined: Self = StObject.set(x, "disableScrollLock", js.undefined)
    
    inline def setHideBackdrop(value: Boolean): Self = StObject.set(x, "hideBackdrop", value.asInstanceOf[js.Any])
    
    inline def setHideBackdropUndefined: Self = StObject.set(x, "hideBackdrop", js.undefined)
    
    inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
    
    inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
    
    inline def setOnBackdropClick(value: ReactEventFrom[js.Object & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1((t0: ReactEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
    
    inline def setOnClose(value: (/* event */ js.Object, /* reason */ "backdropClick" | "escapeKeyDown") => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction2((t0: /* event */ js.Object, t1: /* reason */ "backdropClick" | "escapeKeyDown") => (value(t0, t1)).runNow()))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: ModalUnstyledSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
