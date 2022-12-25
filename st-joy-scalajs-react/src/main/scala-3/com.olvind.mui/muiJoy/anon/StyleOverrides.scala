package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.aspectRatioAspectRatioPropsMod.AspectRatioOwnerState
import com.olvind.mui.muiJoy.aspectRatioAspectRatioPropsMod.AspectRatioSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleOverrides[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAspectRatioPropsAspectRatioTypeMa] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[AspectRatioSlot, AspectRatioOwnerState, Theme]] = js.undefined
}
object StyleOverrides {
  
  inline def apply[Theme](): StyleOverrides[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOverrides[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleOverrides[?], Theme] (val x: Self & StyleOverrides[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAspectRatioPropsAspectRatioTypeMa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[AspectRatioSlot, AspectRatioOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
