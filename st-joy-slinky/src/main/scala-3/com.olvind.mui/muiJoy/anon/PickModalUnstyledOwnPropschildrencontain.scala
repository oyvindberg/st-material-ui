package com.olvind.mui.muiJoy.anon

import org.scalajs.dom.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@mui/base.@mui/base/ModalUnstyled.ModalUnstyledOwnProps, 'children' | 'container' | 'disableAutoFocus' | 'disableEnforceFocus' | 'disableEscapeKeyDown' | 'disablePortal' | 'disableRestoreFocus' | 'disableScrollLock' | 'hideBackdrop' | 'keepMounted' | 'open'> */
trait PickModalUnstyledOwnPropschildrencontain extends StObject {
  
  var children: ReactElement
  
  var container: js.UndefOr[Element | (js.Function0[Element | Null]) | Null] = js.undefined
  
  var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
  
  var disableEnforceFocus: js.UndefOr[Boolean] = js.undefined
  
  var disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined
  
  var disablePortal: js.UndefOr[Boolean] = js.undefined
  
  var disableRestoreFocus: js.UndefOr[Boolean] = js.undefined
  
  var disableScrollLock: js.UndefOr[Boolean] = js.undefined
  
  var hideBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var keepMounted: js.UndefOr[Boolean] = js.undefined
  
  var open: Boolean
}
object PickModalUnstyledOwnPropschildrencontain {
  
  inline def apply(children: ReactElement, open: Boolean): PickModalUnstyledOwnPropschildrencontain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickModalUnstyledOwnPropschildrencontain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickModalUnstyledOwnPropschildrencontain] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: Element | (js.Function0[Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerFunction0(value: () => Element | Null): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
    
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
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
