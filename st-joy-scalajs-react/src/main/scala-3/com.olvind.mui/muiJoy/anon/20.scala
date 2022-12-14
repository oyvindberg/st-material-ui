package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.dividerDividerPropsMod.DividerOwnerState
import com.olvind.mui.muiJoy.dividerDividerPropsMod.DividerSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialDividerPropsDividerTypeMaphrdefau] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[DividerSlot, DividerOwnerState, Theme]] = js.undefined
}
object `20` {
  
  inline def apply[Theme](): `20`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`20`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `20`[?], Theme] (val x: Self & `20`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialDividerPropsDividerTypeMaphrdefau): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[DividerSlot, DividerOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
