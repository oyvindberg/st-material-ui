package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesExtendThemeMod.ColorSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<Record<DefaultColorScheme | ExtendedColorScheme, ColorSystemOptions>> */
trait PartialRecordDefaultColorSchemeExtendedC extends StObject {
  
  var dark: js.UndefOr[ColorSystemOptions] = js.undefined
  
  var light: js.UndefOr[ColorSystemOptions] = js.undefined
}
object PartialRecordDefaultColorSchemeExtendedC {
  
  inline def apply(): PartialRecordDefaultColorSchemeExtendedC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordDefaultColorSchemeExtendedC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordDefaultColorSchemeExtendedC] (val x: Self) extends AnyVal {
    
    inline def setDark(value: ColorSystemOptions): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setLight(value: ColorSystemOptions): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
  }
}
