package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import com.olvind.mui.muiJoy.svgIconSvgIconPropsMod.SvgIconOwnerState
import com.olvind.mui.muiJoy.svgIconSvgIconPropsMod.SvgIconSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSvgIconPropsSvgIconTypeMapsvgdefa] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[SvgIconSlot, SvgIconOwnerState, Theme]] = js.undefined
}
object `45` {
  
  inline def apply[Theme](): `45`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`45`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `45`[?], Theme] (val x: Self & `45`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialSvgIconPropsSvgIconTypeMapsvgdefa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[SvgIconSlot, SvgIconOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
