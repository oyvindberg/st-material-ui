package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.cardOverflowCardOverflowPropsMod.CardOverflowOwnerState
import com.olvind.mui.muiJoy.cardOverflowCardOverflowPropsMod.CardOverflowSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardOverflowPropsCardOverflowType] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[CardOverflowSlot, CardOverflowOwnerState, Theme]] = js.undefined
}
object `14` {
  
  inline def apply[Theme](): `14`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`[?], Theme] (val x: Self & `14`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCardOverflowPropsCardOverflowType): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[CardOverflowSlot, CardOverflowOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
