package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.inputInputPropsMod.InputOwnerState
import com.olvind.mui.muiJoy.inputInputPropsMod.InputSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputPropsInputTypeMapdivdefaultC] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[InputSlot, InputOwnerState, Theme]] = js.undefined
}
object `28` {
  
  inline def apply[Theme](): `28`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`28`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `28`[?], Theme] (val x: Self & `28`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialInputPropsInputTypeMapdivdefaultC): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[InputSlot, InputOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
