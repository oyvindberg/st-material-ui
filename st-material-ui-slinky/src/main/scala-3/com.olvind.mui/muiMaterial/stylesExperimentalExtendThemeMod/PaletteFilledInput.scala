package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteFilledInput extends StObject {
  
  var bg: String
  
  var disabledBg: String
  
  var hoverBg: String
}
object PaletteFilledInput {
  
  inline def apply(bg: String, disabledBg: String, hoverBg: String): PaletteFilledInput = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], disabledBg = disabledBg.asInstanceOf[js.Any], hoverBg = hoverBg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteFilledInput]
  }
  
  extension [Self <: PaletteFilledInput](x: Self) {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setDisabledBg(value: String): Self = StObject.set(x, "disabledBg", value.asInstanceOf[js.Any])
    
    inline def setHoverBg(value: String): Self = StObject.set(x, "hoverBg", value.asInstanceOf[js.Any])
  }
}
