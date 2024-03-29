package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.avatarGroupAvatarGroupPropsMod.AvatarGroupOwnerState
import com.olvind.mui.muiJoy.avatarGroupAvatarGroupPropsMod.AvatarGroupSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAvatarGroupPropsAvatarGroupTypeMa] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[AvatarGroupSlot, AvatarGroupOwnerState, Theme]] = js.undefined
}
object `5` {
  
  inline def apply[Theme](): `5`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`[?], Theme] (val x: Self & `5`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAvatarGroupPropsAvatarGroupTypeMa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[AvatarGroupSlot, AvatarGroupOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
