package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteStepContent extends StObject {
  
  var border: String
}
object PaletteStepContent {
  
  inline def apply(border: String): PaletteStepContent = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteStepContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteStepContent] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
