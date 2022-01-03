package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepperStepperMod.StepperClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepperProps] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepperClasskey]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepperProps]] = js.undefined
}
object `126` {
  
  inline def apply(): `126` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`126`]
  }
  
  extension [Self <: `126`](x: Self) {
    
    inline def setDefaultProps(value: PartialStepperProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepperClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepperProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepperProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
