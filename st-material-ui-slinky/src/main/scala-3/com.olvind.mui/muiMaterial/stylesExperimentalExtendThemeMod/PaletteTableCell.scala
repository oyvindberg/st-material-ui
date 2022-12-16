package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteTableCell extends StObject {
  
  var border: String
}
object PaletteTableCell {
  
  inline def apply(border: String): PaletteTableCell = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteTableCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteTableCell] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
