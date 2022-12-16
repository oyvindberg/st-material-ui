package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteAppBar extends StObject {
  
  var darkBg: String
  
  var darkColor: String
  
  var defaultBg: String
}
object PaletteAppBar {
  
  inline def apply(darkBg: String, darkColor: String, defaultBg: String): PaletteAppBar = {
    val __obj = js.Dynamic.literal(darkBg = darkBg.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], defaultBg = defaultBg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteAppBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteAppBar] (val x: Self) extends AnyVal {
    
    inline def setDarkBg(value: String): Self = StObject.set(x, "darkBg", value.asInstanceOf[js.Any])
    
    inline def setDarkColor(value: String): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultBg(value: String): Self = StObject.set(x, "defaultBg", value.asInstanceOf[js.Any])
  }
}
