package com.olvind.mui.muiSystem

import com.olvind.mui.muiSystem.muiSystemStrings.`a98-rgb`
import com.olvind.mui.muiSystem.muiSystemStrings.`display-p3`
import com.olvind.mui.muiSystem.muiSystemStrings.`prophoto-rgb`
import com.olvind.mui.muiSystem.muiSystemStrings.`rec-2020`
import com.olvind.mui.muiSystem.muiSystemStrings.srgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorManipulatorMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiSystem.muiSystemStrings.rgb
    - `com.olvind.mui`.muiSystem.muiSystemStrings.rgba
    - `com.olvind.mui`.muiSystem.muiSystemStrings.hsl
    - `com.olvind.mui`.muiSystem.muiSystemStrings.hsla
  */
  trait ColorFormat extends StObject
  object ColorFormat {
    
    inline def hsl: com.olvind.mui.muiSystem.muiSystemStrings.hsl = "hsl".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.hsl]
    
    inline def hsla: com.olvind.mui.muiSystem.muiSystemStrings.hsla = "hsla".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.hsla]
    
    inline def rgb: com.olvind.mui.muiSystem.muiSystemStrings.rgb = "rgb".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.rgb]
    
    inline def rgba: com.olvind.mui.muiSystem.muiSystemStrings.rgba = "rgba".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.rgba]
  }
  
  trait ColorObject extends StObject {
    
    var colorSpace: js.UndefOr[srgb | `display-p3` | `a98-rgb` | `prophoto-rgb` | `rec-2020`] = js.undefined
    
    var `type`: ColorFormat
    
    var values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  }
  object ColorObject {
    
    inline def apply(
      `type`: ColorFormat,
      values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ): ColorObject = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorObject]
    }
    
    extension [Self <: ColorObject](x: Self) {
      
      inline def setColorSpace(value: srgb | `display-p3` | `a98-rgb` | `prophoto-rgb` | `rec-2020`): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
      
      inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
      
      inline def setType(value: ColorFormat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
