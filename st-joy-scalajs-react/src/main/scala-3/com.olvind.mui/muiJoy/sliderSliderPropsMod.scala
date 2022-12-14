package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Classes
import com.olvind.mui.muiJoy.anon.MarkLabel
import com.olvind.mui.muiJoy.anon.OmitSliderUnstyledOwnPropsslotsslotProps
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.SliderPropsSliderTypeMapspandefaultCompo, 'color'> & @mui/joy.anon.61<@mui/joy.anon.SliderPropsSliderTypeMapspandefaultCompo> extends std.Function ? std.Omit<@mui/joy.anon.SliderPropsSliderTypeMapspandefaultCompo, 'color'> & @mui/joy.anon.61<@mui/joy.anon.SliderPropsSliderTypeMapspandefaultCompo> : {[ K in keyof std.Omit<@mui/joy.anon.SliderPropsSliderTypeMapspandefaultCompo, 'color'> & @mui/joy.anon.61<@mui/joy.anon.SliderPropsSliderTypeMapspandefaultCompo> ]: std.Omit<@mui/joy.anon.SliderPropsSliderTypeMapspandefaultCompo, 'color'> & @mui/joy.anon.61<@mui/joy.anon.SliderPropsSliderTypeMapspandefaultCompo>[K]} */ trait SliderOwnerState extends StObject {
    
    /**
      * If `true`, the thumb is in dragging state.
      */
    var dragging: Boolean
    
    /**
      * If `true`, some of the marks has `label` property.
      */
    var marked: Boolean
  }
  object SliderOwnerState {
    
    inline def apply(dragging: Boolean, marked: Boolean): SliderOwnerState = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderOwnerState] (val x: Self) extends AnyVal {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setMarked(value: Boolean): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    }
  }
  
  type SliderProps[D /* <: ElementType */, P] = OverrideProps[SliderTypeMap[D, P], D]
  
  trait SliderPropsColorOverrides extends StObject
  
  trait SliderPropsSizeOverrides extends StObject
  
  trait SliderPropsVariantOverrides extends StObject
  
  object SliderSlot {
    
    inline def input: "input" = "input".asInstanceOf["input"]
    
    inline def mark: "mark" = "mark".asInstanceOf["mark"]
    
    inline def markLabel: "markLabel" = "markLabel".asInstanceOf["markLabel"]
    
    inline def rail: "rail" = "rail".asInstanceOf["rail"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def thumb: "thumb" = "thumb".asInstanceOf["thumb"]
    
    inline def track: "track" = "track".asInstanceOf["track"]
    
    inline def valueLabel: "valueLabel" = "valueLabel".asInstanceOf["valueLabel"]
  }
  type SliderSlot = "root" | "mark" | "markLabel" | "rail" | "track" | "thumb" | "valueLabel" | "input"
  
  trait SliderSlots extends StObject {
    
    /**
      * The component that renders the input.
      * @default 'input'
      */
    var input: ElementType
    
    /**
      * The component that renders the mark.
      * @default 'span'
      */
    var mark: ElementType
    
    /**
      * The component that renders the mark label.
      * @default 'span'
      */
    var markLabel: ElementType
    
    /**
      * The component that renders the rail.
      * @default 'span'
      */
    var rail: ElementType
    
    /**
      * The component that renders the root.
      * @default 'span'
      */
    var root: ElementType
    
    /**
      * The component that renders the thumb.
      * @default 'span'
      */
    var thumb: ElementType
    
    /**
      * The component that renders the track.
      * @default 'span'
      */
    var track: ElementType
    
    /**
      * The component that renders the value label.
      * @default 'span'
      */
    var valueLabel: ElementType
  }
  object SliderSlots {
    
    inline def apply(
      input: ElementType,
      mark: ElementType,
      markLabel: ElementType,
      rail: ElementType,
      root: ElementType,
      thumb: ElementType,
      track: ElementType,
      valueLabel: ElementType
    ): SliderSlots = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], markLabel = markLabel.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], valueLabel = valueLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderSlots] (val x: Self) extends AnyVal {
      
      inline def setInput(value: ElementType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMark(value: ElementType): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkLabel(value: ElementType): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
      
      inline def setRail(value: ElementType): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setThumb(value: ElementType): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: ElementType): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setValueLabel(value: ElementType): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    }
  }
  
  type SliderSlotsAndSlotProps = CreateSlotsAndSlotProps[SliderSlots, MarkLabel]
  
  trait SliderTypeMap[D /* <: ElementType */, P] extends StObject {
    
    var defaultComponent: D
    
    var props: P & OmitSliderUnstyledOwnPropsslotsslotProps & SliderSlotsAndSlotProps & Classes
  }
  object SliderTypeMap {
    
    inline def apply[D /* <: ElementType */, P](
      defaultComponent: D,
      props: P & OmitSliderUnstyledOwnPropsslotsslotProps & SliderSlotsAndSlotProps & Classes
    ): SliderTypeMap[D, P] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderTypeMap[D, P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderTypeMap[?, ?], D /* <: ElementType */, P] (val x: Self & (SliderTypeMap[D, P])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OmitSliderUnstyledOwnPropsslotsslotProps & SliderSlotsAndSlotProps & Classes): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
