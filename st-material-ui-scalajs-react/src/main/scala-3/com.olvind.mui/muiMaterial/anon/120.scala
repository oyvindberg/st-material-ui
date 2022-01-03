package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepStepMod.StepClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepProps] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepClasskey]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepProps]] = js.undefined
}
object `120` {
  
  inline def apply(): `120` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`120`]
  }
  
  extension [Self <: `120`](x: Self) {
    
    inline def setDefaultProps(value: PartialStepProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
