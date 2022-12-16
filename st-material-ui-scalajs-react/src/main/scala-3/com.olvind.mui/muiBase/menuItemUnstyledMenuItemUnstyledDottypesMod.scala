package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.`1`
import com.olvind.mui.muiBase.anon.`5`
import com.olvind.mui.react.mod.MouseEventHandler
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemUnstyledMenuItemUnstyledDottypesMod {
  
  trait MenuItemUnstyledComponentsPropsOverrides extends StObject
  
  trait MenuItemUnstyledOwnProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the menu item will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A text representation of the menu item's content.
      * Used for keyboard text navigation matching.
      */
    var label: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    /**
      * The props used for each slot inside the MenuItem.
      * @default {}
      */
    var slotProps: js.UndefOr[`5`] = js.undefined
    
    /**
      * The components used for each slot inside the MenuItem.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[`1`] = js.undefined
  }
  object MenuItemUnstyledOwnProps {
    
    inline def apply(): MenuItemUnstyledOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemUnstyledOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemUnstyledOwnProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSlotProps(value: `5`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: `1`): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    }
  }
  
  trait MenuItemUnstyledOwnerState
    extends StObject
       with MenuItemUnstyledOwnProps {
    
    @JSName("disabled")
    var disabled_MenuItemUnstyledOwnerState: Boolean
    
    var focusVisible: Boolean
  }
  object MenuItemUnstyledOwnerState {
    
    inline def apply(disabled: Boolean, focusVisible: Boolean): MenuItemUnstyledOwnerState = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemUnstyledOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemUnstyledOwnerState] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    }
  }
}
