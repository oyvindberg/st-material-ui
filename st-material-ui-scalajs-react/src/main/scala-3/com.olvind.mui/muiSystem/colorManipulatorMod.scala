package com.olvind.mui.muiSystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorManipulatorMod {
  
  object ColorFormat {
    
    inline def color: "color" = "color".asInstanceOf["color"]
    
    inline def hsl: "hsl" = "hsl".asInstanceOf["hsl"]
    
    inline def hsla: "hsla" = "hsla".asInstanceOf["hsla"]
    
    inline def rgb: "rgb" = "rgb".asInstanceOf["rgb"]
    
    inline def rgba: "rgba" = "rgba".asInstanceOf["rgba"]
  }
  type ColorFormat = "rgb" | "rgba" | "hsl" | "hsla" | "color"
  
  trait ColorObject extends StObject {
    
    var colorSpace: js.UndefOr["srgb" | "display-p3" | "a98-rgb" | "prophoto-rgb" | "rec-2020"] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorObject] (val x: Self) extends AnyVal {
      
      inline def setColorSpace(value: "srgb" | "display-p3" | "a98-rgb" | "prophoto-rgb" | "rec-2020"): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
      
      inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
      
      inline def setType(value: ColorFormat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
