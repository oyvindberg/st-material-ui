package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleOverridesVariants extends StObject {
  
  var defaultProps: js.UndefOr[PartialAutocompletePropsanyanyanyanydiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAutocompleteCl] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAutocompletePropsanyanyanyanydiv]] = js.undefined
}
object StyleOverridesVariants {
  
  inline def apply(): StyleOverridesVariants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOverridesVariants]
  }
  
  extension [Self <: StyleOverridesVariants](x: Self) {
    
    inline def setDefaultProps(value: PartialAutocompletePropsanyanyanyanydiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesAutocompleteCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAutocompletePropsanyanyanyanydiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAutocompletePropsanyanyanyanydiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
