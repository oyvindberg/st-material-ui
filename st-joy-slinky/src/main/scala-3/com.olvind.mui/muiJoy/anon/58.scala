package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.modalModalPropsMod.ModalOwnerState
import com.olvind.mui.muiJoy.modalModalPropsMod.ModalSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialModalPropsModalTypeMapdivdefaultC] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ModalSlot, ModalOwnerState, Theme]] = js.undefined
}
object `58` {
  
  inline def apply[Theme](): `58`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`58`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `58`[?], Theme] (val x: Self & `58`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialModalPropsModalTypeMapdivdefaultC): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ModalSlot, ModalOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
