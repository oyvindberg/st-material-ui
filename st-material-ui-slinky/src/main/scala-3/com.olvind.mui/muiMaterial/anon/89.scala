package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.inputAdornmentInputAdornmentClassesMod.InputAdornmentClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputAdornmentPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[InputAdornmentClassKey, "MuiInputAdornment", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialInputAdornmentPropsdiv]] = js.undefined
}
object `89` {
  
  inline def apply[Theme](): `89`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`89`[Theme]]
  }
  
  extension [Self <: `89`[?], Theme](x: Self & `89`[Theme]) {
    
    inline def setDefaultProps(value: PartialInputAdornmentPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[InputAdornmentClassKey, "MuiInputAdornment", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialInputAdornmentPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialInputAdornmentPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
