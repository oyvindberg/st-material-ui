package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.linearProgressLinearProgressClassesMod.LinearProgressClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `92`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialLinearProgressProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[LinearProgressClassKey, "MuiLinearProgress", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialLinearProgressProps]] = js.undefined
}
object `92` {
  
  inline def apply[Theme](): `92`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`92`[Theme]]
  }
  
  extension [Self <: `92`[?], Theme](x: Self & `92`[Theme]) {
    
    inline def setDefaultProps(value: PartialLinearProgressProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[LinearProgressClassKey, "MuiLinearProgress", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialLinearProgressProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialLinearProgressProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}