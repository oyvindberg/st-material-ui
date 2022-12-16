package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.sliderSliderMod.SliderClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSliderPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SliderClassKey, "MuiSlider", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSliderPropsdefaultComponent]] = js.undefined
}
object `118` {
  
  inline def apply[Theme](): `118`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`118`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `118`[?], Theme] (val x: Self & `118`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialSliderPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[SliderClassKey, "MuiSlider", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSliderPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSliderPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
