package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepLabelStepLabelMod.StepLabelClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepLabelProps] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepLabelClasskey]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepLabelProps]] = js.undefined
}
object `125` {
  
  inline def apply(): `125` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`125`]
  }
  
  extension [Self <: `125`](x: Self) {
    
    inline def setDefaultProps(value: PartialStepLabelProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepLabelClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepLabelProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepLabelProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
