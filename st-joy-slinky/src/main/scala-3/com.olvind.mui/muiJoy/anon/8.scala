package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.buttonButtonPropsMod.ButtonOwnerState
import com.olvind.mui.muiJoy.buttonButtonPropsMod.ButtonSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialButtonPropsButtonTypeMapbuttondef] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ButtonSlot, ButtonOwnerState, Theme]] = js.undefined
}
object `8` {
  
  inline def apply[Theme](): `8`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`[?], Theme] (val x: Self & `8`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialButtonPropsButtonTypeMapbuttondef): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ButtonSlot, ButtonOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
