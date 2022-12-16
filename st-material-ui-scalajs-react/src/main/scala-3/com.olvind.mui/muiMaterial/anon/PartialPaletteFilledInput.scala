package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteFilledInput> */
trait PartialPaletteFilledInput extends StObject {
  
  var bg: js.UndefOr[String] = js.undefined
  
  var disabledBg: js.UndefOr[String] = js.undefined
  
  var hoverBg: js.UndefOr[String] = js.undefined
}
object PartialPaletteFilledInput {
  
  inline def apply(): PartialPaletteFilledInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteFilledInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaletteFilledInput] (val x: Self) extends AnyVal {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setDisabledBg(value: String): Self = StObject.set(x, "disabledBg", value.asInstanceOf[js.Any])
    
    inline def setDisabledBgUndefined: Self = StObject.set(x, "disabledBg", js.undefined)
    
    inline def setHoverBg(value: String): Self = StObject.set(x, "hoverBg", value.asInstanceOf[js.Any])
    
    inline def setHoverBgUndefined: Self = StObject.set(x, "hoverBg", js.undefined)
  }
}
