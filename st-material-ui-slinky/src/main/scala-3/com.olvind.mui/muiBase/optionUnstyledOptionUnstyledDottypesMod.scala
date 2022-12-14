package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.`7`
import com.olvind.mui.muiBase.useListboxUseListboxDottypesMod.OptionState
import com.olvind.mui.muiTypes.mod.Simplify
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionUnstyledOptionUnstyledDottypesMod {
  
  trait OptionUnstyledOwnProps[TValue] extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
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
    var slotProps: js.UndefOr[`7`[TValue]] = js.undefined
    
    /**
      * The components used for each slot inside the OptionUnstyled.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[OptionUnstyledSlots] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionUnstyledOwnProps[?], TValue] (val x: Self & OptionUnstyledOwnProps[TValue]) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSlotProps(value: `7`[TValue]): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: OptionUnstyledSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionUnstyledOwnerState[TValue] = Simplify[OptionUnstyledOwnProps[TValue] & OptionState]
  
  trait OptionUnstyledRootSlotPropsOverrides extends StObject
  
  trait OptionUnstyledSlots extends StObject {
    
    /**
      * The component that renders the root.
      * @default 'li'
      */
    var root: js.UndefOr[ReactElement] = js.undefined
  }
  object OptionUnstyledSlots {
    
    inline def apply(): OptionUnstyledSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionUnstyledSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionUnstyledSlots] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait OptionUnstyledTypeMap[TValue, P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & OptionUnstyledOwnProps[TValue]
  }
  object OptionUnstyledTypeMap {
    
    inline def apply[TValue, P, D /* <: ReactElement */](defaultComponent: D, props: P & OptionUnstyledOwnProps[TValue]): OptionUnstyledTypeMap[TValue, P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionUnstyledTypeMap[TValue, P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionUnstyledTypeMap[?, ?, ?], TValue, P, D /* <: ReactElement */] (val x: Self & (OptionUnstyledTypeMap[TValue, P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OptionUnstyledOwnProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
