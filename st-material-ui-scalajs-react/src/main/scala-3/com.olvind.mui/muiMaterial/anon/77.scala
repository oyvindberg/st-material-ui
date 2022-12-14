package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.formControlLabelFormControlLabelClassesMod.FormControlLabelClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormControlLabelProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[FormControlLabelClassKey, "MuiFormControlLabel", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFormControlLabelProps]] = js.undefined
}
object `77` {
  
  inline def apply[Theme](): `77`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`77`[Theme]]
  }
  
  extension [Self <: `77`[?], Theme](x: Self & `77`[Theme]) {
    
    inline def setDefaultProps(value: PartialFormControlLabelProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[FormControlLabelClassKey, "MuiFormControlLabel", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFormControlLabelProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFormControlLabelProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
