package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.modalCloseModalClosePropsMod.ModalCloseOwnerState
import com.olvind.mui.muiJoy.modalCloseModalClosePropsMod.ModalCloseSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialModalClosePropsModalCloseTypeMapb] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ModalCloseSlot, ModalCloseOwnerState, Theme]] = js.undefined
}
object `57` {
  
  inline def apply[Theme](): `57`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`57`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `57`[?], Theme] (val x: Self & `57`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialModalClosePropsModalCloseTypeMapb): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ModalCloseSlot, ModalCloseOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
