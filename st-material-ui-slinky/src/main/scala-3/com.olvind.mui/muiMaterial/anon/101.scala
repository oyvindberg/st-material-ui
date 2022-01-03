package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101` extends StObject {
  
  var defaultProps: js.UndefOr[PartialMobileStepperProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesMobileStepperC] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialMobileStepperProps]] = js.undefined
}
object `101` {
  
  inline def apply(): `101` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`101`]
  }
  
  extension [Self <: `101`](x: Self) {
    
    inline def setDefaultProps(value: PartialMobileStepperProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesMobileStepperC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialMobileStepperProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialMobileStepperProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
