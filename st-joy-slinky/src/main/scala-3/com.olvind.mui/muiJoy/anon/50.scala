package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import com.olvind.mui.muiJoy.tabPanelTabPanelPropsMod.TabPanelOwnerState
import com.olvind.mui.muiJoy.tabPanelTabPanelPropsMod.TabPanelSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTabPanelPropsTabPanelTypeMapdivde] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[TabPanelSlot, TabPanelOwnerState, Theme]] = js.undefined
}
object `50` {
  
  inline def apply[Theme](): `50`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`50`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `50`[?], Theme] (val x: Self & `50`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTabPanelPropsTabPanelTypeMapdivde): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[TabPanelSlot, TabPanelOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
