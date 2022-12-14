package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteTooltip extends StObject {
  
  var bg: String
}
object PaletteTooltip {
  
  inline def apply(bg: String): PaletteTooltip = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteTooltip]
  }
  
  extension [Self <: PaletteTooltip](x: Self) {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
  }
}
