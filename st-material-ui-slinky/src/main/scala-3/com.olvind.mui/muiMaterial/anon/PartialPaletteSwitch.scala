package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteSwitch> */
trait PartialPaletteSwitch extends StObject {
  
  var defaultColor: js.UndefOr[String] = js.undefined
  
  var defaultDisabledColor: js.UndefOr[String] = js.undefined
  
  var errorDisabledColor: js.UndefOr[String] = js.undefined
  
  var infoDisabledColor: js.UndefOr[String] = js.undefined
  
  var primaryDisabledColor: js.UndefOr[String] = js.undefined
  
  var secondaryDisabledColor: js.UndefOr[String] = js.undefined
  
  var successDisabledColor: js.UndefOr[String] = js.undefined
  
  var warningDisabledColor: js.UndefOr[String] = js.undefined
}
object PartialPaletteSwitch {
  
  inline def apply(): PartialPaletteSwitch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteSwitch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaletteSwitch] (val x: Self) extends AnyVal {
    
    inline def setDefaultColor(value: String): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
    
    inline def setDefaultDisabledColor(value: String): Self = StObject.set(x, "defaultDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultDisabledColorUndefined: Self = StObject.set(x, "defaultDisabledColor", js.undefined)
    
    inline def setErrorDisabledColor(value: String): Self = StObject.set(x, "errorDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setErrorDisabledColorUndefined: Self = StObject.set(x, "errorDisabledColor", js.undefined)
    
    inline def setInfoDisabledColor(value: String): Self = StObject.set(x, "infoDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setInfoDisabledColorUndefined: Self = StObject.set(x, "infoDisabledColor", js.undefined)
    
    inline def setPrimaryDisabledColor(value: String): Self = StObject.set(x, "primaryDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setPrimaryDisabledColorUndefined: Self = StObject.set(x, "primaryDisabledColor", js.undefined)
    
    inline def setSecondaryDisabledColor(value: String): Self = StObject.set(x, "secondaryDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setSecondaryDisabledColorUndefined: Self = StObject.set(x, "secondaryDisabledColor", js.undefined)
    
    inline def setSuccessDisabledColor(value: String): Self = StObject.set(x, "successDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setSuccessDisabledColorUndefined: Self = StObject.set(x, "successDisabledColor", js.undefined)
    
    inline def setWarningDisabledColor(value: String): Self = StObject.set(x, "warningDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setWarningDisabledColorUndefined: Self = StObject.set(x, "warningDisabledColor", js.undefined)
  }
}
