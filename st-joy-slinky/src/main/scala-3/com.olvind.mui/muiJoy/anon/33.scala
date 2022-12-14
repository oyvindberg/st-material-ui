package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.listItemButtonListItemButtonPropsMod.ListItemButtonOwnerState
import com.olvind.mui.muiJoy.listItemButtonListItemButtonPropsMod.ListItemButtonSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemButtonPropsListItemButton] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ListItemButtonSlot, ListItemButtonOwnerState, Theme]] = js.undefined
}
object `33` {
  
  inline def apply[Theme](): `33`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`33`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `33`[?], Theme] (val x: Self & `33`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialListItemButtonPropsListItemButton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ListItemButtonSlot, ListItemButtonOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
