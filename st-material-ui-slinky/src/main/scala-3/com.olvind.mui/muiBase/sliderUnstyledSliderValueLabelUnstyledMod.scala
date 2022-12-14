package com.olvind.mui.muiBase

import com.olvind.mui.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderUnstyledSliderValueLabelUnstyledMod {
  
  trait SliderValueLabelUnstyledProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the value label is visible.
      */
    var open: Boolean
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The value of the slider.
      * For ranged sliders, provide an array with two values.
      */
    var value: Double
    
    /**
      * Controls when the value label is displayed:
      *
      * - `auto` the value label will display when the thumb is hovered or focused.
      * - `on` will display persistently.
      * - `off` will never display.
      * @default 'off'
      */
    var valueLabelDisplay: js.UndefOr["on" | "auto" | "off"] = js.undefined
  }
  object SliderValueLabelUnstyledProps {
    
    inline def apply(open: Boolean, value: Double): SliderValueLabelUnstyledProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderValueLabelUnstyledProps]
    }
    
    extension [Self <: SliderValueLabelUnstyledProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueLabelDisplay(value: "on" | "auto" | "off"): Self = StObject.set(x, "valueLabelDisplay", value.asInstanceOf[js.Any])
      
      inline def setValueLabelDisplayUndefined: Self = StObject.set(x, "valueLabelDisplay", js.undefined)
    }
  }
}
