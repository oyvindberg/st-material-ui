package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.toggleButtonGroupToggleButtonGroupClassesMod.ToggleButtonGroupClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialToggleButtonGroupProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ToggleButtonGroupClassKey, "MuiToggleButtonGroup", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialToggleButtonGroupProps]] = js.undefined
}
object `147` {
  
  inline def apply[Theme](): `147`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`147`[Theme]]
  }
  
  extension [Self <: `147`[?], Theme](x: Self & `147`[Theme]) {
    
    inline def setDefaultProps(value: PartialToggleButtonGroupProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ToggleButtonGroupClassKey, "MuiToggleButtonGroup", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialToggleButtonGroupProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialToggleButtonGroupProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
