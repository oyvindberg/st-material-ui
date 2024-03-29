package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.formHelperTextFormHelperTextPropsMod.FormHelperTextOwnerState
import com.olvind.mui.muiJoy.formHelperTextFormHelperTextPropsMod.FormHelperTextSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormHelperTextPropsFormHelperText] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[FormHelperTextSlot, FormHelperTextOwnerState, Theme]] = js.undefined
}
object `22` {
  
  inline def apply[Theme](): `22`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`22`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `22`[?], Theme] (val x: Self & `22`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialFormHelperTextPropsFormHelperText): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[FormHelperTextSlot, FormHelperTextOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
