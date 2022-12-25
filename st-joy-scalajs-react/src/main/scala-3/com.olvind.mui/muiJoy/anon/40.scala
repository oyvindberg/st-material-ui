package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.selectSelectPropsMod.SelectOwnerState
import com.olvind.mui.muiJoy.selectSelectPropsMod.SelectSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSelectPropsanySelectTypeMapanybut] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[SelectSlot, SelectOwnerState[Any], Theme]] = js.undefined
}
object `40` {
  
  inline def apply[Theme](): `40`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`40`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `40`[?], Theme] (val x: Self & `40`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialSelectPropsanySelectTypeMapanybut): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[SelectSlot, SelectOwnerState[Any], Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
