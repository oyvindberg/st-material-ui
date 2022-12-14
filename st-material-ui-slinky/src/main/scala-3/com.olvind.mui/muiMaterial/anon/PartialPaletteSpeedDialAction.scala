package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteSpeedDialAction> */
trait PartialPaletteSpeedDialAction extends StObject {
  
  var fabHoverBg: js.UndefOr[String] = js.undefined
}
object PartialPaletteSpeedDialAction {
  
  inline def apply(): PartialPaletteSpeedDialAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteSpeedDialAction]
  }
  
  extension [Self <: PartialPaletteSpeedDialAction](x: Self) {
    
    inline def setFabHoverBg(value: String): Self = StObject.set(x, "fabHoverBg", value.asInstanceOf[js.Any])
    
    inline def setFabHoverBgUndefined: Self = StObject.set(x, "fabHoverBg", js.undefined)
  }
}
