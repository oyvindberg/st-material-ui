package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteSpeedDialAction extends StObject {
  
  var fabHoverBg: String
}
object PaletteSpeedDialAction {
  
  inline def apply(fabHoverBg: String): PaletteSpeedDialAction = {
    val __obj = js.Dynamic.literal(fabHoverBg = fabHoverBg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteSpeedDialAction]
  }
  
  extension [Self <: PaletteSpeedDialAction](x: Self) {
    
    inline def setFabHoverBg(value: String): Self = StObject.set(x, "fabHoverBg", value.asInstanceOf[js.Any])
  }
}
