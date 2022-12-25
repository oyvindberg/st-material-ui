package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.modalDialogModalDialogPropsMod.ModalDialogOwnerState
import com.olvind.mui.muiJoy.modalDialogModalDialogPropsMod.ModalDialogSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialModalDialogPropsModalDialogTypeMa] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ModalDialogSlot, ModalDialogOwnerState, Theme]] = js.undefined
}
object `60` {
  
  inline def apply[Theme](): `60`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`60`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `60`[?], Theme] (val x: Self & `60`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialModalDialogPropsModalDialogTypeMa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ModalDialogSlot, ModalDialogOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
