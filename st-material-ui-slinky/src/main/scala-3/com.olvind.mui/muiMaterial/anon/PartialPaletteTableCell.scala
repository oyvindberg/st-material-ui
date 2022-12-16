package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteTableCell> */
trait PartialPaletteTableCell extends StObject {
  
  var border: js.UndefOr[String] = js.undefined
}
object PartialPaletteTableCell {
  
  inline def apply(): PartialPaletteTableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteTableCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaletteTableCell] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
