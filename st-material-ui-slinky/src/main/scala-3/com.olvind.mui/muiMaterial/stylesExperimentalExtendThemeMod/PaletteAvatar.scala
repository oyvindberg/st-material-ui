package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteAvatar extends StObject {
  
  var defaultBg: String
}
object PaletteAvatar {
  
  inline def apply(defaultBg: String): PaletteAvatar = {
    val __obj = js.Dynamic.literal(defaultBg = defaultBg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteAvatar]
  }
  
  extension [Self <: PaletteAvatar](x: Self) {
    
    inline def setDefaultBg(value: String): Self = StObject.set(x, "defaultBg", value.asInstanceOf[js.Any])
  }
}
