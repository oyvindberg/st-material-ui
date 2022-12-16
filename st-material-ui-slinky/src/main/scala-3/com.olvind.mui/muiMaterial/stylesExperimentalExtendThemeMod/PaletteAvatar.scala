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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteAvatar] (val x: Self) extends AnyVal {
    
    inline def setDefaultBg(value: String): Self = StObject.set(x, "defaultBg", value.asInstanceOf[js.Any])
  }
}
