package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stepConnectorStepConnectorMod.StepConnectorClasskey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepConnectorProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[StepConnectorClasskey, "MuiStepConnector", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStepConnectorProps]] = js.undefined
}
object `126` {
  
  inline def apply[Theme](): `126`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`126`[Theme]]
  }
  
  extension [Self <: `126`[?], Theme](x: Self & `126`[Theme]) {
    
    inline def setDefaultProps(value: PartialStepConnectorProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[StepConnectorClasskey, "MuiStepConnector", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStepConnectorProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStepConnectorProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
