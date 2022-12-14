package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.listItemListItemPropsMod.ListItemOwnerState
import com.olvind.mui.muiJoy.listItemListItemPropsMod.ListItemSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemPropsListItemTypeMaplidef] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ListItemSlot, ListItemOwnerState, Theme]] = js.undefined
}
object `32` {
  
  inline def apply[Theme](): `32`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`32`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `32`[?], Theme] (val x: Self & `32`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialListItemPropsListItemTypeMaplidef): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ListItemSlot, ListItemOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
