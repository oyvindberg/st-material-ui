package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.iconButtonIconButtonPropsMod.IconButtonOwnerState
import com.olvind.mui.muiJoy.iconButtonIconButtonPropsMod.IconButtonSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialIconButtonPropsIconButtonTypeMapb] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[IconButtonSlot, IconButtonOwnerState, Theme]] = js.undefined
}
object `25` {
  
  inline def apply[Theme](): `25`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`25`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `25`[?], Theme] (val x: Self & `25`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialIconButtonPropsIconButtonTypeMapb): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[IconButtonSlot, IconButtonOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
