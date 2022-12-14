package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.switchSwitchClassesMod.SwitchClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSwitchProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SwitchClassKey, "MuiSwitch", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSwitchProps]] = js.undefined
}
object `133` {
  
  inline def apply[Theme](): `133`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`133`[Theme]]
  }
  
  extension [Self <: `133`[?], Theme](x: Self & `133`[Theme]) {
    
    inline def setDefaultProps(value: PartialSwitchProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[SwitchClassKey, "MuiSwitch", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSwitchProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSwitchProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
