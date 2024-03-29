package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import com.olvind.mui.muiJoy.tooltipTooltipPropsMod.TooltipOwnerState
import com.olvind.mui.muiJoy.tooltipTooltipPropsMod.TooltipSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTooltipPropsTooltipTypeMapdivdefa] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[TooltipSlot, TooltipOwnerState, Theme]] = js.undefined
}
object `51` {
  
  inline def apply[Theme](): `51`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`51`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `51`[?], Theme] (val x: Self & `51`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTooltipPropsTooltipTypeMapdivdefa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[TooltipSlot, TooltipOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
