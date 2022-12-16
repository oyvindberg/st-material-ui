package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stepStepMod.StepClasskey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepClasskey, "MuiStep", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepPropsdiv]] = js.undefined
}
object `124` {
  
  inline def apply[Theme](): `124`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`124`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `124`[?], Theme] (val x: Self & `124`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialStepPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepClasskey, "MuiStep", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
