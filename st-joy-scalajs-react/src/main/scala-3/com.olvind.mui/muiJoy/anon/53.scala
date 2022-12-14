package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.menuMenuPropsMod.MenuOwnerState
import com.olvind.mui.muiJoy.menuMenuPropsMod.MenuSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialMenuPropsMenuTypeMapuldefaultComp] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[MenuSlot, MenuOwnerState, Theme]] = js.undefined
}
object `53` {
  
  inline def apply[Theme](): `53`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`53`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `53`[?], Theme] (val x: Self & `53`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialMenuPropsMenuTypeMapuldefaultComp): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[MenuSlot, MenuOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
