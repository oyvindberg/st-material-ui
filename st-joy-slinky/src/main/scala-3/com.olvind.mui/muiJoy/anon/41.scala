package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stackStackPropsMod.StackSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialStackPropsStackTypeMapdivdefaultC] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[StackSlot, StackPropsStackTypeMapdivdefaultComponen, Theme]] = js.undefined
}
object `41` {
  
  inline def apply[Theme](): `41`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`41`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `41`[?], Theme] (val x: Self & `41`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialStackPropsStackTypeMapdivdefaultC): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[StackSlot, StackPropsStackTypeMapdivdefaultComponen, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
