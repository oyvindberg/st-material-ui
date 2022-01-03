package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.Root
import com.olvind.mui.muiBase.muiBaseStrings.auto
import com.olvind.mui.muiBase.muiBaseStrings.off
import com.olvind.mui.muiBase.muiBaseStrings.on
import com.olvind.mui.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderValueLabelUnstyledMod {
  
  trait ValueLabelUnstyledProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The components used for each slot inside the ValueLabel.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var components: js.UndefOr[Root] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The value of the slider.
      * For ranged sliders, provide an array with two values.
      */
    var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Controls when the value label is displayed:
      *
      * - `auto` the value label will display when the thumb is hovered or focused.
      * - `on` will display persistently.
      * - `off` will never display.
      * @default 'off'
      */
    var valueLabelDisplay: js.UndefOr[on | auto | off] = js.undefined
  }
  object ValueLabelUnstyledProps {
    
    inline def apply(): ValueLabelUnstyledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueLabelUnstyledProps]
    }
    
    extension [Self <: ValueLabelUnstyledProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponents(value: Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueLabelDisplay(value: on | auto | off): Self = StObject.set(x, "valueLabelDisplay", value.asInstanceOf[js.Any])
      
      inline def setValueLabelDisplayUndefined: Self = StObject.set(x, "valueLabelDisplay", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
