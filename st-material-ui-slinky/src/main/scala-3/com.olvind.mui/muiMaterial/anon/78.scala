package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.formGroupFormGroupClassesMod.FormGroupClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormGroupProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[FormGroupClassKey, "MuiFormGroup", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFormGroupProps]] = js.undefined
}
object `78` {
  
  inline def apply[Theme](): `78`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`78`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `78`[?], Theme] (val x: Self & `78`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialFormGroupProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[FormGroupClassKey, "MuiFormGroup", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFormGroupProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFormGroupProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
