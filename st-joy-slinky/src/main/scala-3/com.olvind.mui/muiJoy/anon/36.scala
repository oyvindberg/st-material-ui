package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.listItemContentListItemContentPropsMod.ListItemContentOwnerState
import com.olvind.mui.muiJoy.listItemContentListItemContentPropsMod.ListItemContentSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemContentPropsListItemConte] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ListItemContentSlot, ListItemContentOwnerState, Theme]] = js.undefined
}
object `36` {
  
  inline def apply[Theme](): `36`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`36`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `36`[?], Theme] (val x: Self & `36`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialListItemContentPropsListItemConte): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ListItemContentSlot, ListItemContentOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
