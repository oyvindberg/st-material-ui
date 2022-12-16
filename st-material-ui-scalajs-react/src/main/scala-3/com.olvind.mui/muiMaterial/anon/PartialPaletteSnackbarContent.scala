package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteSnackbarContent> */
trait PartialPaletteSnackbarContent extends StObject {
  
  var bg: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
}
object PartialPaletteSnackbarContent {
  
  inline def apply(): PartialPaletteSnackbarContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteSnackbarContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaletteSnackbarContent] (val x: Self) extends AnyVal {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
