package com.olvind.mui.muiJoy

import com.olvind.mui.muiStyledEngine.mod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesFocusMod {
  
  trait Focus extends StObject {
    
    var default: CSSObject
    
    var selector: String
    
    var thickness: String
  }
  object Focus {
    
    inline def apply(default: CSSObject, selector: String, thickness: String): Focus = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: CSSObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setThickness(value: String): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    }
  }
}
