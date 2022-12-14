package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteSlider extends StObject {
  
  var errorTrack: String
  
  var infoTrack: String
  
  var primaryTrack: String
  
  var secondaryTrack: String
  
  var successTrack: String
  
  var warningTrack: String
}
object PaletteSlider {
  
  inline def apply(
    errorTrack: String,
    infoTrack: String,
    primaryTrack: String,
    secondaryTrack: String,
    successTrack: String,
    warningTrack: String
  ): PaletteSlider = {
    val __obj = js.Dynamic.literal(errorTrack = errorTrack.asInstanceOf[js.Any], infoTrack = infoTrack.asInstanceOf[js.Any], primaryTrack = primaryTrack.asInstanceOf[js.Any], secondaryTrack = secondaryTrack.asInstanceOf[js.Any], successTrack = successTrack.asInstanceOf[js.Any], warningTrack = warningTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteSlider]
  }
  
  extension [Self <: PaletteSlider](x: Self) {
    
    inline def setErrorTrack(value: String): Self = StObject.set(x, "errorTrack", value.asInstanceOf[js.Any])
    
    inline def setInfoTrack(value: String): Self = StObject.set(x, "infoTrack", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTrack(value: String): Self = StObject.set(x, "primaryTrack", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTrack(value: String): Self = StObject.set(x, "secondaryTrack", value.asInstanceOf[js.Any])
    
    inline def setSuccessTrack(value: String): Self = StObject.set(x, "successTrack", value.asInstanceOf[js.Any])
    
    inline def setWarningTrack(value: String): Self = StObject.set(x, "warningTrack", value.asInstanceOf[js.Any])
  }
}
