package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stepContentStepContentMod.StepContentClasskey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepContentProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[StepContentClasskey, "MuiStepContent", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepContentProps]] = js.undefined
}
object `127` {
  
  inline def apply[Theme](): `127`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`127`[Theme]]
  }
  
  extension [Self <: `127`[?], Theme](x: Self & `127`[Theme]) {
    
    inline def setDefaultProps(value: PartialStepContentProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[StepContentClasskey, "MuiStepContent", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepContentProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepContentProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
