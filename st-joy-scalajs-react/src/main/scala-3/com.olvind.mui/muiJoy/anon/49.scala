package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import com.olvind.mui.muiJoy.tabTabPropsMod.TabOwnerState
import com.olvind.mui.muiJoy.tabTabPropsMod.TabSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTabPropsTabTypeMapbuttondefaultCo] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[TabSlot, TabOwnerState, Theme]] = js.undefined
}
object `49` {
  
  inline def apply[Theme](): `49`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`49`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `49`[?], Theme] (val x: Self & `49`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTabPropsTabTypeMapbuttondefaultCo): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[TabSlot, TabOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
