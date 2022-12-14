package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.cardContentCardContentPropsMod.CardContentOwnerState
import com.olvind.mui.muiJoy.cardContentCardContentPropsMod.CardContentSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardContentPropsCardContentTypeMa] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[CardContentSlot, CardContentOwnerState, Theme]] = js.undefined
}
object `12` {
  
  inline def apply[Theme](): `12`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `12`[?], Theme] (val x: Self & `12`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCardContentPropsCardContentTypeMa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[CardContentSlot, CardContentOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
