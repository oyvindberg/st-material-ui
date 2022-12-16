package com.olvind.mui.muiSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dark[ColorScheme /* <: String */] extends StObject {
  
  var dark: ColorScheme
  
  var light: ColorScheme
}
object Dark {
  
  inline def apply[ColorScheme /* <: String */](dark: ColorScheme, light: ColorScheme): Dark[ColorScheme] = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark[ColorScheme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dark[?], ColorScheme /* <: String */] (val x: Self & Dark[ColorScheme]) extends AnyVal {
    
    inline def setDark(value: ColorScheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: ColorScheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
