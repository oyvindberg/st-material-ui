package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stepLabelStepLabelMod.StepLabelClasskey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepLabelProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[StepLabelClasskey, "MuiStepLabel", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepLabelProps]] = js.undefined
}
object `129` {
  
  inline def apply[Theme](): `129`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`129`[Theme]]
  }
  
  extension [Self <: `129`[?], Theme](x: Self & `129`[Theme]) {
    
    inline def setDefaultProps(value: PartialStepLabelProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepLabelClasskey, "MuiStepLabel", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepLabelProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepLabelProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
