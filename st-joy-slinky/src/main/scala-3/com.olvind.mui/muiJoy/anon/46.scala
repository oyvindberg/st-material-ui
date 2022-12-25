package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.sliderSliderPropsMod.SliderSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSliderPropsSliderTypeMapspandefau] = js.undefined
  
  var styleOverrides: js.UndefOr[
    OverridesStyleRules[SliderSlot, com.olvind.mui.muiJoy.sliderSliderPropsMod.SliderOwnerState, Theme]
  ] = js.undefined
}
object `46` {
  
  inline def apply[Theme](): `46`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`46`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `46`[?], Theme] (val x: Self & `46`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialSliderPropsSliderTypeMapspandefau): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: OverridesStyleRules[SliderSlot, com.olvind.mui.muiJoy.sliderSliderPropsMod.SliderOwnerState, Theme]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
