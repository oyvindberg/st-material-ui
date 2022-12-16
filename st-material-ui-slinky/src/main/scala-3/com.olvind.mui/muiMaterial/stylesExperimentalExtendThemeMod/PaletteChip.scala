package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteChip extends StObject {
  
  var defaultAvatarColor: String
  
  var defaultBorder: String
  
  var defaultIconColor: String
}
object PaletteChip {
  
  inline def apply(defaultAvatarColor: String, defaultBorder: String, defaultIconColor: String): PaletteChip = {
    val __obj = js.Dynamic.literal(defaultAvatarColor = defaultAvatarColor.asInstanceOf[js.Any], defaultBorder = defaultBorder.asInstanceOf[js.Any], defaultIconColor = defaultIconColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteChip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteChip] (val x: Self) extends AnyVal {
    
    inline def setDefaultAvatarColor(value: String): Self = StObject.set(x, "defaultAvatarColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultBorder(value: String): Self = StObject.set(x, "defaultBorder", value.asInstanceOf[js.Any])
    
    inline def setDefaultIconColor(value: String): Self = StObject.set(x, "defaultIconColor", value.asInstanceOf[js.Any])
  }
}
