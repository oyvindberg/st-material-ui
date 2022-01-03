package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepIconStepIconMod.StepIconClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepIconProps] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepIconClasskey]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepIconProps]] = js.undefined
}
object `124` {
  
  inline def apply(): `124` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`124`]
  }
  
  extension [Self <: `124`](x: Self) {
    
    inline def setDefaultProps(value: PartialStepIconProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepIconClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepIconProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepIconProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
