package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.scopedCssBaselineScopedCssBaselineClassesMod.ScopedCssBaselineClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialScopedCssBaselinePropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ScopedCssBaselineClassKey, "MuiScopedCssBaseline", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialScopedCssBaselinePropsdiv]] = js.undefined
}
object `115` {
  
  inline def apply[Theme](): `115`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`115`[Theme]]
  }
  
  extension [Self <: `115`[?], Theme](x: Self & `115`[Theme]) {
    
    inline def setDefaultProps(value: PartialScopedCssBaselinePropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ScopedCssBaselineClassKey, "MuiScopedCssBaseline", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialScopedCssBaselinePropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialScopedCssBaselinePropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}