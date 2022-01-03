package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSwitchProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSwitchClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSwitchProps]] = js.undefined
}
object `128` {
  
  inline def apply(): `128` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`128`]
  }
  
  extension [Self <: `128`](x: Self) {
    
    inline def setDefaultProps(value: PartialSwitchProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesSwitchClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSwitchProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSwitchProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
