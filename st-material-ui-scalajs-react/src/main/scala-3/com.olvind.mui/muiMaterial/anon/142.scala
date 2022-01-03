package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `142` extends StObject {
  
  var defaultProps: js.UndefOr[PartialToggleButtonGroupProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesToggleButtonGr] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialToggleButtonGroupProps]] = js.undefined
}
object `142` {
  
  inline def apply(): `142` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`142`]
  }
  
  extension [Self <: `142`](x: Self) {
    
    inline def setDefaultProps(value: PartialToggleButtonGroupProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesToggleButtonGr): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialToggleButtonGroupProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialToggleButtonGroupProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
