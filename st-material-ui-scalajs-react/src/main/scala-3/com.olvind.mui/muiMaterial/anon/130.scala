package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stepperStepperMod.StepperClasskey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepperPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[StepperClasskey, "MuiStepper", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepperPropsdiv]] = js.undefined
}
object `130` {
  
  inline def apply[Theme](): `130`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`130`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `130`[?], Theme] (val x: Self & `130`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialStepperPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepperClasskey, "MuiStepper", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepperPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepperPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
