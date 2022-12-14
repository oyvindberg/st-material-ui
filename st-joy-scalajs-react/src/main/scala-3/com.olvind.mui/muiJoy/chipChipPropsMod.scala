package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Disabled
import com.olvind.mui.muiJoy.anon.EndDecoratorLabel
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipChipPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.ChipPropsChipTypeMapdivdefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ChipPropsChipTypeMapdivdefaultComponent> extends std.Function ? std.Omit<@mui/joy.anon.ChipPropsChipTypeMapdivdefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ChipPropsChipTypeMapdivdefaultComponent> : {[ K in keyof std.Omit<@mui/joy.anon.ChipPropsChipTypeMapdivdefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ChipPropsChipTypeMapdivdefaultComponent> ]: std.Omit<@mui/joy.anon.ChipPropsChipTypeMapdivdefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ChipPropsChipTypeMapdivdefaultComponent>[K]} */ trait ChipOwnerState extends StObject {
    
    /**
      * If `true`, the chip is clickable.
      */
    var clickable: Boolean
    
    /**
      * If `true`, the action slot's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
  }
  object ChipOwnerState {
    
    inline def apply(clickable: Boolean): ChipOwnerState = {
      val __obj = js.Dynamic.literal(clickable = clickable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChipOwnerState] (val x: Self) extends AnyVal {
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    }
  }
  
  type ChipProps[D /* <: ElementType */, P] = OverrideProps[ChipTypeMap[P, D], D]
  
  trait ChipPropsColorOverrides extends StObject
  
  trait ChipPropsSizeOverrides extends StObject
  
  trait ChipPropsVariantOverrides extends StObject
  
  object ChipSlot {
    
    inline def action: "action" = "action".asInstanceOf["action"]
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def label: "label" = "label".asInstanceOf["label"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
  }
  type ChipSlot = "root" | "label" | "action" | "startDecorator" | "endDecorator"
  
  trait ChipSlots extends StObject {
    
    /**
      * The component that renders the action.
      * @default 'button'
      */
    var action: ElementType
    
    /**
      * The component that renders the end decorator.
      * @default 'span'
      */
    var endDecorator: ElementType
    
    /**
      * The component that renders the label.
      * @default 'span'
      */
    var label: ElementType
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: ElementType
    
    /**
      * The component that renders the start decorator.
      * @default 'span'
      */
    var startDecorator: ElementType
  }
  object ChipSlots {
    
    inline def apply(
      action: ElementType,
      endDecorator: ElementType,
      label: ElementType,
      root: ElementType,
      startDecorator: ElementType
    ): ChipSlots = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChipSlots] (val x: Self) extends AnyVal {
      
      inline def setAction(value: ElementType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setEndDecorator(value: ElementType): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ElementType): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: ElementType): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    }
  }
  
  type ChipSlotsAndSlotProps = CreateSlotsAndSlotProps[ChipSlots, EndDecoratorLabel]
  
  trait ChipTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ChipSlotsAndSlotProps & Disabled
  }
  object ChipTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & ChipSlotsAndSlotProps & Disabled): ChipTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChipTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (ChipTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ChipSlotsAndSlotProps & Disabled): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
