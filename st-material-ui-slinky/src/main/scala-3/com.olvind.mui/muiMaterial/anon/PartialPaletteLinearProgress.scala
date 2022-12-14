package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteLinearProgress> */
trait PartialPaletteLinearProgress extends StObject {
  
  var errorBg: js.UndefOr[String] = js.undefined
  
  var infoBg: js.UndefOr[String] = js.undefined
  
  var primaryBg: js.UndefOr[String] = js.undefined
  
  var secondaryBg: js.UndefOr[String] = js.undefined
  
  var successBg: js.UndefOr[String] = js.undefined
  
  var warningBg: js.UndefOr[String] = js.undefined
}
object PartialPaletteLinearProgress {
  
  inline def apply(): PartialPaletteLinearProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteLinearProgress]
  }
  
  extension [Self <: PartialPaletteLinearProgress](x: Self) {
    
    inline def setErrorBg(value: String): Self = StObject.set(x, "errorBg", value.asInstanceOf[js.Any])
    
    inline def setErrorBgUndefined: Self = StObject.set(x, "errorBg", js.undefined)
    
    inline def setInfoBg(value: String): Self = StObject.set(x, "infoBg", value.asInstanceOf[js.Any])
    
    inline def setInfoBgUndefined: Self = StObject.set(x, "infoBg", js.undefined)
    
    inline def setPrimaryBg(value: String): Self = StObject.set(x, "primaryBg", value.asInstanceOf[js.Any])
    
    inline def setPrimaryBgUndefined: Self = StObject.set(x, "primaryBg", js.undefined)
    
    inline def setSecondaryBg(value: String): Self = StObject.set(x, "secondaryBg", value.asInstanceOf[js.Any])
    
    inline def setSecondaryBgUndefined: Self = StObject.set(x, "secondaryBg", js.undefined)
    
    inline def setSuccessBg(value: String): Self = StObject.set(x, "successBg", value.asInstanceOf[js.Any])
    
    inline def setSuccessBgUndefined: Self = StObject.set(x, "successBg", js.undefined)
    
    inline def setWarningBg(value: String): Self = StObject.set(x, "warningBg", value.asInstanceOf[js.Any])
    
    inline def setWarningBgUndefined: Self = StObject.set(x, "warningBg", js.undefined)
  }
}
