package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteSwitch extends StObject {
  
  var defaultColor: String
  
  var defaultDisabledColor: String
  
  var errorDisabledColor: String
  
  var infoDisabledColor: String
  
  var primaryDisabledColor: String
  
  var secondaryDisabledColor: String
  
  var successDisabledColor: String
  
  var warningDisabledColor: String
}
object PaletteSwitch {
  
  inline def apply(
    defaultColor: String,
    defaultDisabledColor: String,
    errorDisabledColor: String,
    infoDisabledColor: String,
    primaryDisabledColor: String,
    secondaryDisabledColor: String,
    successDisabledColor: String,
    warningDisabledColor: String
  ): PaletteSwitch = {
    val __obj = js.Dynamic.literal(defaultColor = defaultColor.asInstanceOf[js.Any], defaultDisabledColor = defaultDisabledColor.asInstanceOf[js.Any], errorDisabledColor = errorDisabledColor.asInstanceOf[js.Any], infoDisabledColor = infoDisabledColor.asInstanceOf[js.Any], primaryDisabledColor = primaryDisabledColor.asInstanceOf[js.Any], secondaryDisabledColor = secondaryDisabledColor.asInstanceOf[js.Any], successDisabledColor = successDisabledColor.asInstanceOf[js.Any], warningDisabledColor = warningDisabledColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteSwitch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteSwitch] (val x: Self) extends AnyVal {
    
    inline def setDefaultColor(value: String): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultDisabledColor(value: String): Self = StObject.set(x, "defaultDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setErrorDisabledColor(value: String): Self = StObject.set(x, "errorDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setInfoDisabledColor(value: String): Self = StObject.set(x, "infoDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setPrimaryDisabledColor(value: String): Self = StObject.set(x, "primaryDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setSecondaryDisabledColor(value: String): Self = StObject.set(x, "secondaryDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setSuccessDisabledColor(value: String): Self = StObject.set(x, "successDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setWarningDisabledColor(value: String): Self = StObject.set(x, "warningDisabledColor", value.asInstanceOf[js.Any])
  }
}
