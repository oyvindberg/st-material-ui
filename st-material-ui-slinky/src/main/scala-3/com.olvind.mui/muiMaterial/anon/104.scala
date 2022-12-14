package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.mobileStepperMobileStepperClassesMod.MobileStepperClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialMobileStepperProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[MobileStepperClassKey, "MuiMobileStepper", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialMobileStepperProps]] = js.undefined
}
object `104` {
  
  inline def apply[Theme](): `104`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`104`[Theme]]
  }
  
  extension [Self <: `104`[?], Theme](x: Self & `104`[Theme]) {
    
    inline def setDefaultProps(value: PartialMobileStepperProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[MobileStepperClassKey, "MuiMobileStepper", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialMobileStepperProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialMobileStepperProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
