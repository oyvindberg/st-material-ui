package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.checkboxCheckboxPropsMod.CheckboxOwnerState
import com.olvind.mui.muiJoy.checkboxCheckboxPropsMod.CheckboxSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCheckboxPropsCheckboxTypeMapspand] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[CheckboxSlot, CheckboxOwnerState, Theme]] = js.undefined
}
object `17` {
  
  inline def apply[Theme](): `17`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`17`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `17`[?], Theme] (val x: Self & `17`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCheckboxPropsCheckboxTypeMapspand): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[CheckboxSlot, CheckboxOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
