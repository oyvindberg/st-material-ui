package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.ColorSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@mui/material.@mui/material/styles/experimental_extendTheme.SupportedColorScheme, @mui/material.@mui/material/styles/experimental_extendTheme.ColorSystem> */
trait RecordSupportedColorSchemeColorSystem extends StObject {
  
  var dark: ColorSystem
  
  var light: ColorSystem
}
object RecordSupportedColorSchemeColorSystem {
  
  inline def apply(dark: ColorSystem, light: ColorSystem): RecordSupportedColorSchemeColorSystem = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordSupportedColorSchemeColorSystem]
  }
  
  extension [Self <: RecordSupportedColorSchemeColorSystem](x: Self) {
    
    inline def setDark(value: ColorSystem): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: ColorSystem): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
