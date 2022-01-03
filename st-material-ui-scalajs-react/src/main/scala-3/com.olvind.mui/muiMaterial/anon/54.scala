package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCheckboxProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCheckboxClassK] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCheckboxProps]] = js.undefined
}
object `54` {
  
  inline def apply(): `54` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`54`]
  }
  
  extension [Self <: `54`](x: Self) {
    
    inline def setDefaultProps(value: PartialCheckboxProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesCheckboxClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCheckboxProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCheckboxProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
