package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.formLabelFormLabelClassesMod.FormLabelClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormLabelPropslabel] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[FormLabelClassKey, "MuiFormLabel", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFormLabelPropslabel]] = js.undefined
}
object `80` {
  
  inline def apply[Theme](): `80`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`80`[Theme]]
  }
  
  extension [Self <: `80`[?], Theme](x: Self & `80`[Theme]) {
    
    inline def setDefaultProps(value: PartialFormLabelPropslabel): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[FormLabelClassKey, "MuiFormLabel", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFormLabelPropslabel]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFormLabelPropslabel*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
