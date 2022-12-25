package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.formControlFormControlPropsMod.FormControlOwnerState
import com.olvind.mui.muiJoy.formControlFormControlPropsMod.FormControlSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormControlPropsFormControlTypeMa] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[FormControlSlot, FormControlOwnerState, Theme]] = js.undefined
}
object `23` {
  
  inline def apply[Theme](): `23`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`23`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `23`[?], Theme] (val x: Self & `23`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialFormControlPropsFormControlTypeMa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[FormControlSlot, FormControlOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
