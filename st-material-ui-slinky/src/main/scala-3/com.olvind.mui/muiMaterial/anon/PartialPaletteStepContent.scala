package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteStepContent> */
trait PartialPaletteStepContent extends StObject {
  
  var border: js.UndefOr[String] = js.undefined
}
object PartialPaletteStepContent {
  
  inline def apply(): PartialPaletteStepContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteStepContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaletteStepContent] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
