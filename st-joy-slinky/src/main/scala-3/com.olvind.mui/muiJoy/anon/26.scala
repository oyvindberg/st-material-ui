package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.gridGridPropsMod.GridSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialGridPropsGridTypeMapdivdefaultCom] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[GridSlot, GridPropsGridTypeMapdivdefaultComponent, Theme]] = js.undefined
}
object `26` {
  
  inline def apply[Theme](): `26`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`26`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `26`[?], Theme] (val x: Self & `26`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialGridPropsGridTypeMapdivdefaultCom): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[GridSlot, GridPropsGridTypeMapdivdefaultComponent, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
