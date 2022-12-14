package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.formHelperTextFormHelperTextClassesMod.FormHelperTextClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormHelperTextPropsp] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[FormHelperTextClassKey, "MuiFormHelperText", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFormHelperTextPropsp]] = js.undefined
}
object `79` {
  
  inline def apply[Theme](): `79`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`79`[Theme]]
  }
  
  extension [Self <: `79`[?], Theme](x: Self & `79`[Theme]) {
    
    inline def setDefaultProps(value: PartialFormHelperTextPropsp): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[FormHelperTextClassKey, "MuiFormHelperText", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFormHelperTextPropsp]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFormHelperTextPropsp*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}