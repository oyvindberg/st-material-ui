package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.modalOverflowModalOverflowPropsMod.ModalOverflowOwnerState
import com.olvind.mui.muiJoy.modalOverflowModalOverflowPropsMod.ModalOverflowSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialModalOverflowPropsModalOverflowTy] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ModalOverflowSlot, ModalOverflowOwnerState, Theme]] = js.undefined
}
object `59` {
  
  inline def apply[Theme](): `59`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`59`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `59`[?], Theme] (val x: Self & `59`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialModalOverflowPropsModalOverflowTy): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ModalOverflowSlot, ModalOverflowOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
