package com.olvind.mui.muiJoy

import com.olvind.mui.muiBase.useSwitchUseSwitchDottypesMod.UseSwitchParameters
import com.olvind.mui.muiJoy.anon.CheckedIcon
import com.olvind.mui.muiJoy.anon.Label
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.CheckboxPropsCheckboxTypeMapspandefaultC, 'color'> & @mui/joy.anon.61<@mui/joy.anon.CheckboxPropsCheckboxTypeMapspandefaultC> extends std.Function ? std.Omit<@mui/joy.anon.CheckboxPropsCheckboxTypeMapspandefaultC, 'color'> & @mui/joy.anon.61<@mui/joy.anon.CheckboxPropsCheckboxTypeMapspandefaultC> : {[ K in keyof std.Omit<@mui/joy.anon.CheckboxPropsCheckboxTypeMapspandefaultC, 'color'> & @mui/joy.anon.61<@mui/joy.anon.CheckboxPropsCheckboxTypeMapspandefaultC> ]: std.Omit<@mui/joy.anon.CheckboxPropsCheckboxTypeMapspandefaultC, 'color'> & @mui/joy.anon.61<@mui/joy.anon.CheckboxPropsCheckboxTypeMapspandefaultC>[K]} */ trait CheckboxOwnerState extends StObject {
    
    /**
      * If `true`, the checkbox's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
  }
  object CheckboxOwnerState {
    
    inline def apply(): CheckboxOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    }
  }
  
  type CheckboxProps[D /* <: ElementType */, P] = OverrideProps[CheckboxTypeMap[P, D], D]
  
  trait CheckboxPropsColorOverrides extends StObject
  
  trait CheckboxPropsSizeOverrides extends StObject
  
  trait CheckboxPropsVariantOverrides extends StObject
  
  object CheckboxSlot {
    
    inline def action: "action" = "action".asInstanceOf["action"]
    
    inline def checkbox: "checkbox" = "checkbox".asInstanceOf["checkbox"]
    
    inline def input: "input" = "input".asInstanceOf["input"]
    
    inline def label: "label" = "label".asInstanceOf["label"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type CheckboxSlot = "root" | "checkbox" | "action" | "input" | "label"
  
  trait CheckboxSlots extends StObject {
    
    /**
      * The component that renders the action.
      * @default 'span'
      */
    var action: ElementType
    
    /**
      * The component that renders the checkbox.
      * @default 'span'
      */
    var checkbox: ElementType
    
    /**
      * The component that renders the input.
      * @default 'input'
      */
    var input: ElementType
    
    /**
      * The component that renders the label.
      * @default 'label'
      */
    var label: ElementType
    
    /**
      * The component that renders the root.
      * @default 'span'
      */
    var root: ElementType
  }
  object CheckboxSlots {
    
    inline def apply(
      action: ElementType,
      checkbox: ElementType,
      input: ElementType,
      label: ElementType,
      root: ElementType
    ): CheckboxSlots = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxSlots] (val x: Self) extends AnyVal {
      
      inline def setAction(value: ElementType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCheckbox(value: ElementType): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setInput(value: ElementType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ElementType): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckboxSlotsAndSlotProps = CreateSlotsAndSlotProps[CheckboxSlots, Label]
  
  trait CheckboxTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & UseSwitchParameters & CheckboxSlotsAndSlotProps & CheckedIcon
  }
  object CheckboxTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & UseSwitchParameters & CheckboxSlotsAndSlotProps & CheckedIcon): CheckboxTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (CheckboxTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & UseSwitchParameters & CheckboxSlotsAndSlotProps & CheckedIcon): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
