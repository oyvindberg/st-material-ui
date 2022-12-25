package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.radioGroupRadioGroupPropsMod.RadioGroupOwnerState
import com.olvind.mui.muiJoy.radioGroupRadioGroupPropsMod.RadioGroupSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialRadioGroupPropsRadioGroupTypeMapd] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[RadioGroupSlot, RadioGroupOwnerState, Theme]] = js.undefined
}
object `39` {
  
  inline def apply[Theme](): `39`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`39`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `39`[?], Theme] (val x: Self & `39`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialRadioGroupPropsRadioGroupTypeMapd): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[RadioGroupSlot, RadioGroupOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
