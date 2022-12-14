package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.sliderSliderPropsMod.SliderOwnerState
import com.olvind.mui.muiJoy.sliderSliderPropsMod.SliderSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSliderPropsSliderTypeMapspandefau] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[SliderSlot, SliderOwnerState, Theme]] = js.undefined
}
object `44` {
  
  inline def apply[Theme](): `44`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`44`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `44`[?], Theme] (val x: Self & `44`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialSliderPropsSliderTypeMapspandefau): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[SliderSlot, SliderOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
