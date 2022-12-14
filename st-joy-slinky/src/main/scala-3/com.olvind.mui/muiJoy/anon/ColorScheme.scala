package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSchemeMod.DefaultColorScheme
import com.olvind.mui.muiJoy.stylesTypesColorSchemeMod.ExtendedColorScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorScheme extends StObject {
  
  var colorScheme: DefaultColorScheme | ExtendedColorScheme
}
object ColorScheme {
  
  inline def apply(colorScheme: DefaultColorScheme | ExtendedColorScheme): ColorScheme = {
    val __obj = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorScheme] (val x: Self) extends AnyVal {
    
    inline def setColorScheme(value: DefaultColorScheme | ExtendedColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
  }
}
