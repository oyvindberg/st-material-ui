package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.filledInputFilledInputClassesMod.FilledInputClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFilledInputProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[FilledInputClassKey, "MuiFilledInput", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFilledInputProps]] = js.undefined
}
object `74` {
  
  inline def apply[Theme](): `74`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`74`[Theme]]
  }
  
  extension [Self <: `74`[?], Theme](x: Self & `74`[Theme]) {
    
    inline def setDefaultProps(value: PartialFilledInputProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[FilledInputClassKey, "MuiFilledInput", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFilledInputProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFilledInputProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}