package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleOverridesVariants extends StObject {
  
  var defaultProps: js.UndefOr[PartialAutocompletePropsanyanyanyanydiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAutocompleteCl] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialAutocompletePropsanyanyanyanydiv]] = js.native
}
object StyleOverridesVariants {
  
  @scala.inline
  def apply(): StyleOverridesVariants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOverridesVariants]
  }
  
  @scala.inline
  implicit class StyleOverridesVariantsMutableBuilder[Self <: StyleOverridesVariants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAutocompletePropsanyanyanyanydiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAutocompleteCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialAutocompletePropsanyanyanyanydiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialAutocompletePropsanyanyanyanydiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
