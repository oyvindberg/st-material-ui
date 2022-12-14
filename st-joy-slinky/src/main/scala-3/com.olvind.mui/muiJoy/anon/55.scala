package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.menuItemMenuItemPropsMod.MenuItemOwnerState
import com.olvind.mui.muiJoy.menuItemMenuItemPropsMod.MenuItemSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialMenuItemPropsMenuItemTypeMapdivde] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[MenuItemSlot, MenuItemOwnerState, Theme]] = js.undefined
}
object `55` {
  
  inline def apply[Theme](): `55`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`55`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `55`[?], Theme] (val x: Self & `55`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialMenuItemPropsMenuItemTypeMapdivde): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[MenuItemSlot, MenuItemOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
