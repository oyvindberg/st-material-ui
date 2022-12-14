package com.olvind.mui.muiSystem

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createThemeShapeMod extends Shortcut {
  
  @JSImport("@mui/system/createTheme/shape", JSImport.Default)
  @js.native
  val default: Shape = js.native
  
  trait Shape extends StObject {
    
    var borderRadius: Double
  }
  object Shape {
    
    inline def apply(borderRadius: Double): Shape = {
      val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shape]
    }
    
    extension [Self <: Shape](x: Self) {
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@mui/system.@mui/system/createTheme/shape.Shape> */
  trait ShapeOptions extends StObject {
    
    var borderRadius: js.UndefOr[Double] = js.undefined
  }
  object ShapeOptions {
    
    inline def apply(): ShapeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeOptions]
    }
    
    extension [Self <: ShapeOptions](x: Self) {
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    }
  }
  
  type _To = Shape
  
  /* This means you don't have to write `default`, but can instead just say `createThemeShapeMod.foo` */
  override def _to: Shape = default
}
