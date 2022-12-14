package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteLinearProgress extends StObject {
  
  var errorBg: String
  
  var infoBg: String
  
  var primaryBg: String
  
  var secondaryBg: String
  
  var successBg: String
  
  var warningBg: String
}
object PaletteLinearProgress {
  
  inline def apply(
    errorBg: String,
    infoBg: String,
    primaryBg: String,
    secondaryBg: String,
    successBg: String,
    warningBg: String
  ): PaletteLinearProgress = {
    val __obj = js.Dynamic.literal(errorBg = errorBg.asInstanceOf[js.Any], infoBg = infoBg.asInstanceOf[js.Any], primaryBg = primaryBg.asInstanceOf[js.Any], secondaryBg = secondaryBg.asInstanceOf[js.Any], successBg = successBg.asInstanceOf[js.Any], warningBg = warningBg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteLinearProgress]
  }
  
  extension [Self <: PaletteLinearProgress](x: Self) {
    
    inline def setErrorBg(value: String): Self = StObject.set(x, "errorBg", value.asInstanceOf[js.Any])
    
    inline def setInfoBg(value: String): Self = StObject.set(x, "infoBg", value.asInstanceOf[js.Any])
    
    inline def setPrimaryBg(value: String): Self = StObject.set(x, "primaryBg", value.asInstanceOf[js.Any])
    
    inline def setSecondaryBg(value: String): Self = StObject.set(x, "secondaryBg", value.asInstanceOf[js.Any])
    
    inline def setSuccessBg(value: String): Self = StObject.set(x, "successBg", value.asInstanceOf[js.Any])
    
    inline def setWarningBg(value: String): Self = StObject.set(x, "warningBg", value.asInstanceOf[js.Any])
  }
}
