package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.listSubheaderListSubheaderPropsMod.ListSubheaderOwnerState
import com.olvind.mui.muiJoy.listSubheaderListSubheaderPropsMod.ListSubheaderSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListSubheaderPropsListSubheaderTy] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ListSubheaderSlot, ListSubheaderOwnerState, Theme]] = js.undefined
}
object `31` {
  
  inline def apply[Theme](): `31`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`31`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`[?], Theme] (val x: Self & `31`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialListSubheaderPropsListSubheaderTy): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ListSubheaderSlot, ListSubheaderOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
