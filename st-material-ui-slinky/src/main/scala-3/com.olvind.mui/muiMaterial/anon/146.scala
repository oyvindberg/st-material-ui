package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.toggleButtonToggleButtonClassesMod.ToggleButtonClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialToggleButtonPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ToggleButtonClassKey, "MuiToggleButton", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialToggleButtonPropsdefaultComponent]] = js.undefined
}
object `146` {
  
  inline def apply[Theme](): `146`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`146`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `146`[?], Theme] (val x: Self & `146`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialToggleButtonPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ToggleButtonClassKey, "MuiToggleButton", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialToggleButtonPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialToggleButtonPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
