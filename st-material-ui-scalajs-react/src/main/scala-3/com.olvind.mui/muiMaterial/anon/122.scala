package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepConnectorStepConnectorMod.StepConnectorClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepConnectorProps] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepConnectorClasskey]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepConnectorProps]] = js.undefined
}
object `122` {
  
  inline def apply(): `122` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`122`]
  }
  
  extension [Self <: `122`](x: Self) {
    
    inline def setDefaultProps(value: PartialStepConnectorProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepConnectorClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepConnectorProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepConnectorProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
