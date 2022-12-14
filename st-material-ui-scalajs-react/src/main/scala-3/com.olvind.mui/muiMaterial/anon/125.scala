package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stepButtonStepButtonMod.StepButtonClasskey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepButtonPropsbutton] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[StepButtonClasskey, "MuiStepButton", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepButtonPropsbutton]] = js.undefined
}
object `125` {
  
  inline def apply[Theme](): `125`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`125`[Theme]]
  }
  
  extension [Self <: `125`[?], Theme](x: Self & `125`[Theme]) {
    
    inline def setDefaultProps(value: PartialStepButtonPropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepButtonClasskey, "MuiStepButton", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepButtonPropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepButtonPropsbutton*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
