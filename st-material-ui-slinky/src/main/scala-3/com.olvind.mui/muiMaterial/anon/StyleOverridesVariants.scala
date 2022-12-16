package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.autocompleteAutocompleteClassesMod.AutocompleteClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleOverridesVariants[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAutocompletePropsanyanyanyanydiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[AutocompleteClassKey, "MuiAutocomplete", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAutocompletePropsanyanyanyanydiv]] = js.undefined
}
object StyleOverridesVariants {
  
  inline def apply[Theme](): StyleOverridesVariants[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOverridesVariants[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleOverridesVariants[?], Theme] (val x: Self & StyleOverridesVariants[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAutocompletePropsanyanyanyanydiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[AutocompleteClassKey, "MuiAutocomplete", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAutocompletePropsanyanyanyanydiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAutocompletePropsanyanyanyanydiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
