package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.`10`
import com.olvind.mui.muiBase.anon.`1`
import com.olvind.mui.muiBase.listboxUnstyledUseListboxDottypesMod.OptionState
import com.olvind.mui.muiTypes.mod.Simplify
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionUnstyledOptionUnstyledDottypesMod {
  
  trait OptionUnstyledComponentsPropsOverrides extends StObject
  
  trait OptionUnstyledOwnProps[TValue] extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the option will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A text representation of the option's content.
      * Used for keyboard text navigation matching.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * The props used for each slot inside the OptionUnstyled.
      * @default {}
      */
    var slotProps: js.UndefOr[`10`[TValue]] = js.undefined
    
    /**
      * The components used for each slot inside the OptionUnstyled.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[`1`] = js.undefined
    
    /**
      * The value of the option.
      */
    var value: TValue
  }
  object OptionUnstyledOwnProps {
    
    inline def apply[TValue](value: TValue): OptionUnstyledOwnProps[TValue] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionUnstyledOwnProps[TValue]]
    }
    
    extension [Self <: OptionUnstyledOwnProps[?], TValue](x: Self & OptionUnstyledOwnProps[TValue]) {
      
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
      
      inline def setSlotProps(value: `10`[TValue]): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: `1`): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionUnstyledOwnerState[TValue] = Simplify[OptionUnstyledOwnProps[TValue] & OptionState]
  
  trait OptionUnstyledTypeMap[TValue, P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & OptionUnstyledOwnProps[TValue]
  }
  object OptionUnstyledTypeMap {
    
    inline def apply[TValue, P, D /* <: ElementType */](defaultComponent: D, props: P & OptionUnstyledOwnProps[TValue]): OptionUnstyledTypeMap[TValue, P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionUnstyledTypeMap[TValue, P, D]]
    }
    
    extension [Self <: OptionUnstyledTypeMap[?, ?, ?], TValue, P, D /* <: ElementType */](x: Self & (OptionUnstyledTypeMap[TValue, P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OptionUnstyledOwnProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
