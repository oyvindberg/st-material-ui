package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.cardCoverCardCoverPropsMod.CardCoverOwnerState
import com.olvind.mui.muiJoy.cardCoverCardCoverPropsMod.CardCoverSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardCoverPropsCardCoverTypeMapdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[CardCoverSlot, CardCoverOwnerState, Theme]] = js.undefined
}
object `13` {
  
  inline def apply[Theme](): `13`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `13`[?], Theme] (val x: Self & `13`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCardCoverPropsCardCoverTypeMapdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[CardCoverSlot, CardCoverOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
