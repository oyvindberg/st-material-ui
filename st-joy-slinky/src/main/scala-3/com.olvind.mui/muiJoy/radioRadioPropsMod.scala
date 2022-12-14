package com.olvind.mui.muiJoy

import com.olvind.mui.muiBase.useSwitchUseSwitchDottypesMod.UseSwitchParameters
import com.olvind.mui.muiJoy.anon.DisableIcon
import com.olvind.mui.muiJoy.anon.Radio
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioRadioPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.RadioPropsRadioTypeMapspandefaultCompone, 'color'> & @mui/joy.anon.61<@mui/joy.anon.RadioPropsRadioTypeMapspandefaultCompone> extends std.Function ? std.Omit<@mui/joy.anon.RadioPropsRadioTypeMapspandefaultCompone, 'color'> & @mui/joy.anon.61<@mui/joy.anon.RadioPropsRadioTypeMapspandefaultCompone> : {[ K in keyof std.Omit<@mui/joy.anon.RadioPropsRadioTypeMapspandefaultCompone, 'color'> & @mui/joy.anon.61<@mui/joy.anon.RadioPropsRadioTypeMapspandefaultCompone> ]: std.Omit<@mui/joy.anon.RadioPropsRadioTypeMapspandefaultCompone, 'color'> & @mui/joy.anon.61<@mui/joy.anon.RadioPropsRadioTypeMapspandefaultCompone>[K]} */ trait RadioOwnerState extends StObject {
    
    /**
      * @internal
      * The internal prop for controlling CSS margin of the element.
      */
    var `data-first-child`: js.UndefOr[String] = js.undefined
    
    /**
      * @internal
      * The internal prop for controlling CSS margin of the element.
      */
    var `data-parent`: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the element's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @internal
      * The value from the RadioGroup component.
      */
    var orientation: js.UndefOr["horizontal" | "vertical"] = js.undefined
  }
  object RadioOwnerState {
    
    inline def apply(): RadioOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadioOwnerState] (val x: Self) extends AnyVal {
      
      inline def `setData-first-child`(value: String): Self = StObject.set(x, "data-first-child", value.asInstanceOf[js.Any])
      
      inline def `setData-first-childUndefined`: Self = StObject.set(x, "data-first-child", js.undefined)
      
      inline def `setData-parent`(value: String): Self = StObject.set(x, "data-parent", value.asInstanceOf[js.Any])
      
      inline def `setData-parentUndefined`: Self = StObject.set(x, "data-parent", js.undefined)
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
      
      inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  type RadioProps[D /* <: ReactElement */, P] = OverrideProps[RadioTypeMap[P, D], D]
  
  trait RadioPropsColorOverrides extends StObject
  
  trait RadioPropsSizeOverrides extends StObject
  
  trait RadioPropsVariantOverrides extends StObject
  
  object RadioSlot {
    
    inline def action: "action" = "action".asInstanceOf["action"]
    
    inline def icon: "icon" = "icon".asInstanceOf["icon"]
    
    inline def input: "input" = "input".asInstanceOf["input"]
    
    inline def label: "label" = "label".asInstanceOf["label"]
    
    inline def radio: "radio" = "radio".asInstanceOf["radio"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type RadioSlot = "root" | "radio" | "icon" | "action" | "input" | "label"
  
  trait RadioSlots extends StObject {
    
    /**
      * The component that renders the action.
      * @default 'span'
      */
    var action: ReactElement
    
    /**
      * The component that renders the icon.
      * @default 'span'
      */
    var icon: ReactElement
    
    /**
      * The component that renders the input.
      * @default 'input'
      */
    var input: ReactElement
    
    /**
      * The component that renders the label.
      * @default 'label'
      */
    var label: ReactElement
    
    /**
      * The component that renders the radio.
      * @default 'span'
      */
    var radio: ReactElement
    
    /**
      * The component that renders the root.
      * @default 'span'
      */
    var root: ReactElement
  }
  object RadioSlots {
    
    inline def apply(
      action: ReactElement,
      icon: ReactElement,
      input: ReactElement,
      label: ReactElement,
      radio: ReactElement,
      root: ReactElement
    ): RadioSlots = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadioSlots] (val x: Self) extends AnyVal {
      
      inline def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInput(value: ReactElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRadio(value: ReactElement): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type RadioSlotsAndSlotProps = CreateSlotsAndSlotProps[RadioSlots, Radio]
  
  trait RadioTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & RadioSlotsAndSlotProps & UseSwitchParameters & DisableIcon
  }
  object RadioTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & RadioSlotsAndSlotProps & UseSwitchParameters & DisableIcon): RadioTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadioTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (RadioTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & RadioSlotsAndSlotProps & UseSwitchParameters & DisableIcon): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
