package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.chipChipPropsMod.ChipOwnerState
import com.olvind.mui.muiJoy.chipChipPropsMod.ChipSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialChipPropsChipTypeMapdivdefaultCom] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ChipSlot, ChipOwnerState, Theme]] = js.undefined
}
object `16` {
  
  inline def apply[Theme](): `16`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `16`[?], Theme] (val x: Self & `16`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialChipPropsChipTypeMapdivdefaultCom): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ChipSlot, ChipOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
