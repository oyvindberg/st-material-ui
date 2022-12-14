package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.ColorSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<Record<SupportedColorScheme, ColorSystemOptions>> */
trait PartialRecordSupportedColorSchemeColorSy extends StObject {
  
  var dark: js.UndefOr[ColorSystemOptions] = js.undefined
  
  var light: js.UndefOr[ColorSystemOptions] = js.undefined
}
object PartialRecordSupportedColorSchemeColorSy {
  
  inline def apply(): PartialRecordSupportedColorSchemeColorSy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordSupportedColorSchemeColorSy]
  }
  
  extension [Self <: PartialRecordSupportedColorSchemeColorSy](x: Self) {
    
    inline def setDark(value: ColorSystemOptions): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setLight(value: ColorSystemOptions): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
  }
}
