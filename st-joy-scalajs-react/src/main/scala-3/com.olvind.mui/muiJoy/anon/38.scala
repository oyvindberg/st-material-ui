package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.radioRadioPropsMod.RadioOwnerState
import com.olvind.mui.muiJoy.radioRadioPropsMod.RadioSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialRadioPropsRadioTypeMapspandefault] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[RadioSlot, RadioOwnerState, Theme]] = js.undefined
}
object `38` {
  
  inline def apply[Theme](): `38`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`38`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `38`[?], Theme] (val x: Self & `38`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialRadioPropsRadioTypeMapspandefault): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[RadioSlot, RadioOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
