package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.formControlFormControlClassesMod.FormControlClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `75`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormControlPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[FormControlClassKey, "MuiFormControl", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFormControlPropsdiv]] = js.undefined
}
object `75` {
  
  inline def apply[Theme](): `75`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`75`[Theme]]
  }
  
  extension [Self <: `75`[?], Theme](x: Self & `75`[Theme]) {
    
    inline def setDefaultProps(value: PartialFormControlPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[FormControlClassKey, "MuiFormControl", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFormControlPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFormControlPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
