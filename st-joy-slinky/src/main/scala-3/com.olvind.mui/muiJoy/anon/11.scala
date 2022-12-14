package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.cardCardPropsMod.CardOwnerState
import com.olvind.mui.muiJoy.cardCardPropsMod.CardSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardPropsCardTypeMapdivdefaultCom] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[CardSlot, CardOwnerState, Theme]] = js.undefined
}
object `11` {
  
  inline def apply[Theme](): `11`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`11`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `11`[?], Theme] (val x: Self & `11`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCardPropsCardTypeMapdivdefaultCom): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[CardSlot, CardOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
