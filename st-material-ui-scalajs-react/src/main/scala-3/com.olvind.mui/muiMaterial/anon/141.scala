package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141` extends StObject {
  
  var defaultProps: js.UndefOr[PartialToggleButtonPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesToggleButtonCl] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialToggleButtonPropsdefaultComponent]] = js.undefined
}
object `141` {
  
  inline def apply(): `141` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`141`]
  }
  
  extension [Self <: `141`](x: Self) {
    
    inline def setDefaultProps(value: PartialToggleButtonPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesToggleButtonCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialToggleButtonPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialToggleButtonPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
