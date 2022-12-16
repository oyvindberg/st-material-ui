package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.`0`
import com.olvind.mui.muiBase.anon.`1`
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.std.NonNullable
import org.scalajs.dom.Element
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonUnstyledButtonUnstyledDottypesMod {
  
  trait ButtonUnstyledActions extends StObject {
    
    def focusVisible(): Unit
  }
  object ButtonUnstyledActions {
    
    inline def apply(focusVisible: () => Unit): ButtonUnstyledActions = {
      val __obj = js.Dynamic.literal(focusVisible = js.Any.fromFunction0(focusVisible))
      __obj.asInstanceOf[ButtonUnstyledActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonUnstyledActions] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: () => Unit): Self = StObject.set(x, "focusVisible", js.Any.fromFunction0(value))
    }
  }
  
  trait ButtonUnstyledComponentsPropsOverrides extends StObject
  
  /* Inlined parent std.Omit<@mui/base.@mui/base/ButtonUnstyled/useButton.types.UseButtonParameters, 'ref'> */
  trait ButtonUnstyledOwnProps extends StObject {
    
    /**
      * A ref for imperative actions. It currently only supports `focusVisible()` action.
      */
    var action: js.UndefOr[Ref[ButtonUnstyledActions]] = js.undefined
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focusableWhenDisabled: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var onFocusVisible: js.UndefOr[FocusEventHandler[Element]] = js.undefined
    
    /**
      * The props used for each slot inside the Button.
      * @default {}
      */
    var slotProps: js.UndefOr[`0`] = js.undefined
    
    /**
      * The components used for each slot inside the Button.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[`1`] = js.undefined
    
    var tabIndex: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr["submit" | "reset" | "button"] = js.undefined
  }
  object ButtonUnstyledOwnProps {
    
    inline def apply(): ButtonUnstyledOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonUnstyledOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonUnstyledOwnProps] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Ref[ButtonUnstyledActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction1(value: /* instance */ ButtonUnstyledActions | Null => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setActionReactRef(value: ReactRef[ButtonUnstyledActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusableWhenDisabled(value: Boolean): Self = StObject.set(x, "focusableWhenDisabled", value.asInstanceOf[js.Any])
      
      inline def setFocusableWhenDisabledUndefined: Self = StObject.set(x, "focusableWhenDisabled", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setOnFocusVisible(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1(value))
      
      inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
      
      inline def setSlotProps(value: `0`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: `1`): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: "submit" | "reset" | "button"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ButtonUnstyledOwnerState
    extends StObject
       with ButtonUnstyledOwnProps {
    
    var active: Boolean
    
    var focusVisible: Boolean
  }
  object ButtonUnstyledOwnerState {
    
    inline def apply(active: Boolean, focusVisible: Boolean): ButtonUnstyledOwnerState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonUnstyledOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonUnstyledOwnerState] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    }
  }
}
