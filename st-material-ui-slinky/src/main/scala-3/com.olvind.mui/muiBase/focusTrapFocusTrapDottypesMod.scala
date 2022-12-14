package com.olvind.mui.muiBase

import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusTrapFocusTrapDottypesMod {
  
  trait FocusTrapProps extends StObject {
    
    /**
      * A single child content element.
      */
    var children: ReactElement
    
    /**
      * If `true`, the focus trap will not automatically shift focus to itself when it opens, and
      * replace it to the last focused element when it closes.
      * This also works correctly with any focus trap children that have the `disableAutoFocus` prop.
      *
      * Generally this should never be set to `true` as it makes the focus trap less
      * accessible to assistive technologies, like screen readers.
      * @default false
      */
    var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the focus trap will not prevent focus from leaving the focus trap while open.
      *
      * Generally this should never be set to `true` as it makes the focus trap less
      * accessible to assistive technologies, like screen readers.
      * @default false
      */
    var disableEnforceFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the focus trap will not restore focus to previously focused element once
      * focus trap is hidden or unmounted.
      * @default false
      */
    var disableRestoreFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns an array of ordered tabbable nodes (i.e. in tab order) within the root.
      * For instance, you can provide the "tabbable" npm dependency.
      * @param {HTMLElement} root
      */
    var getTabbable: js.UndefOr[js.Function1[/* root */ HTMLElement, js.Array[String]]] = js.undefined
    
    /**
      * This prop extends the `open` prop.
      * It allows to toggle the open state without having to wait for a rerender when changing the `open` prop.
      * This prop should be memoized.
      * It can be used to support multiple focus trap mounted at the same time.
      * @default function defaultIsEnabled(): boolean {
      *   return true;
      * }
      */
    var isEnabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /**
      * If `true`, focus is locked.
      */
    var open: Boolean
  }
  object FocusTrapProps {
    
    inline def apply(children: ReactElement, open: Boolean): FocusTrapProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusTrapProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusTrapProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      inline def setDisableEnforceFocus(value: Boolean): Self = StObject.set(x, "disableEnforceFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableEnforceFocusUndefined: Self = StObject.set(x, "disableEnforceFocus", js.undefined)
      
      inline def setDisableRestoreFocus(value: Boolean): Self = StObject.set(x, "disableRestoreFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableRestoreFocusUndefined: Self = StObject.set(x, "disableRestoreFocus", js.undefined)
      
      inline def setGetTabbable(value: /* root */ HTMLElement => js.Array[String]): Self = StObject.set(x, "getTabbable", js.Any.fromFunction1(value))
      
      inline def setGetTabbableUndefined: Self = StObject.set(x, "getTabbable", js.undefined)
      
      inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
