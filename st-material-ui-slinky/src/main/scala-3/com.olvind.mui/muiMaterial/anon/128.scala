package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stepIconStepIconMod.StepIconClasskey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepIconProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[StepIconClasskey, "MuiStepIcon", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepIconProps]] = js.undefined
}
object `128` {
  
  inline def apply[Theme](): `128`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`128`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `128`[?], Theme] (val x: Self & `128`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialStepIconProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepIconClasskey, "MuiStepIcon", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepIconProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepIconProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
