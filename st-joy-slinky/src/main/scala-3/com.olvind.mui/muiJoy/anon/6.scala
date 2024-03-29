package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.badgeBadgePropsMod.BadgeOwnerState
import com.olvind.mui.muiJoy.badgeBadgePropsMod.BadgeSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialBadgePropsBadgeTypeMapspandefault] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[BadgeSlot, BadgeOwnerState, Theme]] = js.undefined
}
object `6` {
  
  inline def apply[Theme](): `6`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`[?], Theme] (val x: Self & `6`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialBadgePropsBadgeTypeMapspandefault): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[BadgeSlot, BadgeOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
