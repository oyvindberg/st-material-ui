package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteAvatar> */
trait PartialPaletteAvatar extends StObject {
  
  var defaultBg: js.UndefOr[String] = js.undefined
}
object PartialPaletteAvatar {
  
  inline def apply(): PartialPaletteAvatar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteAvatar]
  }
  
  extension [Self <: PartialPaletteAvatar](x: Self) {
    
    inline def setDefaultBg(value: String): Self = StObject.set(x, "defaultBg", value.asInstanceOf[js.Any])
    
    inline def setDefaultBgUndefined: Self = StObject.set(x, "defaultBg", js.undefined)
  }
}
