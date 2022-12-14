package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.buttonGroupButtonGroupClassesMod.ButtonGroupClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialButtonGroupPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ButtonGroupClassKey, "MuiButtonGroup", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialButtonGroupPropsdiv]] = js.undefined
}
object `49` {
  
  inline def apply[Theme](): `49`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`49`[Theme]]
  }
  
  extension [Self <: `49`[?], Theme](x: Self & `49`[Theme]) {
    
    inline def setDefaultProps(value: PartialButtonGroupPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ButtonGroupClassKey, "MuiButtonGroup", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialButtonGroupPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialButtonGroupPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
