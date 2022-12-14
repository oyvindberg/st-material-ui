package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteStepConnector> */
trait PartialPaletteStepConnector extends StObject {
  
  var border: js.UndefOr[String] = js.undefined
}
object PartialPaletteStepConnector {
  
  inline def apply(): PartialPaletteStepConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteStepConnector]
  }
  
  extension [Self <: PartialPaletteStepConnector](x: Self) {
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
