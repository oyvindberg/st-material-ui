package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteAppBar> */
trait PartialPaletteAppBar extends StObject {
  
  var darkBg: js.UndefOr[String] = js.undefined
  
  var darkColor: js.UndefOr[String] = js.undefined
  
  var defaultBg: js.UndefOr[String] = js.undefined
}
object PartialPaletteAppBar {
  
  inline def apply(): PartialPaletteAppBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteAppBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaletteAppBar] (val x: Self) extends AnyVal {
    
    inline def setDarkBg(value: String): Self = StObject.set(x, "darkBg", value.asInstanceOf[js.Any])
    
    inline def setDarkBgUndefined: Self = StObject.set(x, "darkBg", js.undefined)
    
    inline def setDarkColor(value: String): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    inline def setDarkColorUndefined: Self = StObject.set(x, "darkColor", js.undefined)
    
    inline def setDefaultBg(value: String): Self = StObject.set(x, "defaultBg", value.asInstanceOf[js.Any])
    
    inline def setDefaultBgUndefined: Self = StObject.set(x, "defaultBg", js.undefined)
  }
}
