package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@mui/joy.@mui/joy/styles/types/colorScheme.DefaultColorScheme | @mui/joy.@mui/joy/styles/types/colorScheme.ExtendedColorScheme, @mui/joy.@mui/joy/styles/types/colorSystem.ColorSystem> */
trait RecordDefaultColorSchemeExtendedColorSch extends StObject {
  
  var dark: ColorSystem
  
  var light: ColorSystem
}
object RecordDefaultColorSchemeExtendedColorSch {
  
  inline def apply(dark: ColorSystem, light: ColorSystem): RecordDefaultColorSchemeExtendedColorSch = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDefaultColorSchemeExtendedColorSch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordDefaultColorSchemeExtendedColorSch] (val x: Self) extends AnyVal {
    
    inline def setDark(value: ColorSystem): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: ColorSystem): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
