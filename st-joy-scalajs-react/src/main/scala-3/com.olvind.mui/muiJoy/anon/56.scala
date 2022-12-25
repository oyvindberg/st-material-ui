package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.menuListMenuListPropsMod.MenuListOwnerState
import com.olvind.mui.muiJoy.menuListMenuListPropsMod.MenuListSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialMenuListPropsMenuListTypeMapuldef] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[MenuListSlot, MenuListOwnerState, Theme]] = js.undefined
}
object `56` {
  
  inline def apply[Theme](): `56`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`56`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `56`[?], Theme] (val x: Self & `56`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialMenuListPropsMenuListTypeMapuldef): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[MenuListSlot, MenuListOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
