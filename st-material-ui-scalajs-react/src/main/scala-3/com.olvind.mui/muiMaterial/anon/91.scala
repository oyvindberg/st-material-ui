package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListPropsul] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListPropsul]] = js.undefined
}
object `91` {
  
  inline def apply(): `91` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`91`]
  }
  
  extension [Self <: `91`](x: Self) {
    
    inline def setDefaultProps(value: PartialListPropsul): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesListClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListPropsul]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListPropsul*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
