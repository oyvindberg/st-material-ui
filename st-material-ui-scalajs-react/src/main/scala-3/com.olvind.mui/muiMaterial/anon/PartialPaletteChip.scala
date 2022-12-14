package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteChip> */
trait PartialPaletteChip extends StObject {
  
  var defaultAvatarColor: js.UndefOr[String] = js.undefined
  
  var defaultBorder: js.UndefOr[String] = js.undefined
  
  var defaultIconColor: js.UndefOr[String] = js.undefined
}
object PartialPaletteChip {
  
  inline def apply(): PartialPaletteChip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteChip]
  }
  
  extension [Self <: PartialPaletteChip](x: Self) {
    
    inline def setDefaultAvatarColor(value: String): Self = StObject.set(x, "defaultAvatarColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultAvatarColorUndefined: Self = StObject.set(x, "defaultAvatarColor", js.undefined)
    
    inline def setDefaultBorder(value: String): Self = StObject.set(x, "defaultBorder", value.asInstanceOf[js.Any])
    
    inline def setDefaultBorderUndefined: Self = StObject.set(x, "defaultBorder", js.undefined)
    
    inline def setDefaultIconColor(value: String): Self = StObject.set(x, "defaultIconColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultIconColorUndefined: Self = StObject.set(x, "defaultIconColor", js.undefined)
  }
}
