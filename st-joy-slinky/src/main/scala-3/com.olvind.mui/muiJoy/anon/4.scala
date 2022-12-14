package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.avatarAvatarPropsMod.AvatarOwnerState
import com.olvind.mui.muiJoy.avatarAvatarPropsMod.AvatarSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAvatarPropsAvatarTypeMapdivdefaul] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[AvatarSlot, AvatarOwnerState, Theme]] = js.undefined
}
object `4` {
  
  inline def apply[Theme](): `4`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`[?], Theme] (val x: Self & `4`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAvatarPropsAvatarTypeMapdivdefaul): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[AvatarSlot, AvatarOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
