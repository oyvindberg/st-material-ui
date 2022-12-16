package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteSnackbarContent extends StObject {
  
  var bg: String
  
  var color: String
}
object PaletteSnackbarContent {
  
  inline def apply(bg: String, color: String): PaletteSnackbarContent = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteSnackbarContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteSnackbarContent] (val x: Self) extends AnyVal {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
