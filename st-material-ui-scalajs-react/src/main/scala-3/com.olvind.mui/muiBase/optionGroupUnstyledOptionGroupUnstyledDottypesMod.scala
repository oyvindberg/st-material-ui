package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.Label
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionGroupUnstyledOptionGroupUnstyledDottypesMod {
  
  trait OptionGroupUnstyledComponentsPropsOverrides extends StObject
  
  trait OptionGroupUnstyledOwnProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * If `true` all the options in the group will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The human-readable description of the group.
      */
    var label: js.UndefOr[Node] = js.undefined
    
    /**
      * The props used for each slot inside the Input.
      * @default {}
      */
    var slotProps: js.UndefOr[com.olvind.mui.muiBase.anon.List] = js.undefined
    
    /**
      * The components used for each slot inside the OptionGroupUnstyled.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[Label] = js.undefined
  }
  object OptionGroupUnstyledOwnProps {
    
    inline def apply(): OptionGroupUnstyledOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionGroupUnstyledOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionGroupUnstyledOwnProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSlotProps(value: com.olvind.mui.muiBase.anon.List): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: Label): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    }
  }
  
  type OptionGroupUnstyledOwnerState = OptionGroupUnstyledOwnProps
}
