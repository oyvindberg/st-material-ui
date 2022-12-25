package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.linkLinkPropsMod.LinkOwnerState
import com.olvind.mui.muiJoy.linkLinkPropsMod.LinkSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialLinkPropsLinkTypeMapadefaultCompo] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[LinkSlot, LinkOwnerState, Theme]] = js.undefined
}
object `30` {
  
  inline def apply[Theme](): `30`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`30`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `30`[?], Theme] (val x: Self & `30`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialLinkPropsLinkTypeMapadefaultCompo): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[LinkSlot, LinkOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
