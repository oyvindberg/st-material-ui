package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import com.olvind.mui.muiJoy.textFieldTextFieldPropsMod.TextFieldOwnerState
import com.olvind.mui.muiJoy.textFieldTextFieldPropsMod.TextFieldSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTextFieldPropsTextFieldTypeMapdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[TextFieldSlot, TextFieldOwnerState, Theme]] = js.undefined
}
object `52` {
  
  inline def apply[Theme](): `52`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`52`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `52`[?], Theme] (val x: Self & `52`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTextFieldPropsTextFieldTypeMapdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[TextFieldSlot, TextFieldOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
