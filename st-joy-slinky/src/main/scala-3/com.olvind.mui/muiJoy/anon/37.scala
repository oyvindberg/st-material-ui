package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.listItemDecoratorListItemDecoratorPropsMod.ListItemDecoratorOwnerState
import com.olvind.mui.muiJoy.listItemDecoratorListItemDecoratorPropsMod.ListItemDecoratorSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemDecoratorPropsListItemDec] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ListItemDecoratorSlot, ListItemDecoratorOwnerState, Theme]] = js.undefined
}
object `37` {
  
  inline def apply[Theme](): `37`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`37`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `37`[?], Theme] (val x: Self & `37`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialListItemDecoratorPropsListItemDec): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ListItemDecoratorSlot, ListItemDecoratorOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
