package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteSlider> */
trait PartialPaletteSlider extends StObject {
  
  var errorTrack: js.UndefOr[String] = js.undefined
  
  var infoTrack: js.UndefOr[String] = js.undefined
  
  var primaryTrack: js.UndefOr[String] = js.undefined
  
  var secondaryTrack: js.UndefOr[String] = js.undefined
  
  var successTrack: js.UndefOr[String] = js.undefined
  
  var warningTrack: js.UndefOr[String] = js.undefined
}
object PartialPaletteSlider {
  
  inline def apply(): PartialPaletteSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteSlider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaletteSlider] (val x: Self) extends AnyVal {
    
    inline def setErrorTrack(value: String): Self = StObject.set(x, "errorTrack", value.asInstanceOf[js.Any])
    
    inline def setErrorTrackUndefined: Self = StObject.set(x, "errorTrack", js.undefined)
    
    inline def setInfoTrack(value: String): Self = StObject.set(x, "infoTrack", value.asInstanceOf[js.Any])
    
    inline def setInfoTrackUndefined: Self = StObject.set(x, "infoTrack", js.undefined)
    
    inline def setPrimaryTrack(value: String): Self = StObject.set(x, "primaryTrack", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTrackUndefined: Self = StObject.set(x, "primaryTrack", js.undefined)
    
    inline def setSecondaryTrack(value: String): Self = StObject.set(x, "secondaryTrack", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTrackUndefined: Self = StObject.set(x, "secondaryTrack", js.undefined)
    
    inline def setSuccessTrack(value: String): Self = StObject.set(x, "successTrack", value.asInstanceOf[js.Any])
    
    inline def setSuccessTrackUndefined: Self = StObject.set(x, "successTrack", js.undefined)
    
    inline def setWarningTrack(value: String): Self = StObject.set(x, "warningTrack", value.asInstanceOf[js.Any])
    
    inline def setWarningTrackUndefined: Self = StObject.set(x, "warningTrack", js.undefined)
  }
}
