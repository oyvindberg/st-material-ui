package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteStepConnector extends StObject {
  
  var border: String
}
object PaletteStepConnector {
  
  inline def apply(border: String): PaletteStepConnector = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteStepConnector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteStepConnector] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
