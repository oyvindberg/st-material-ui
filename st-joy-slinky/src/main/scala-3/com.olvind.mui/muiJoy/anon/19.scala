package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.chipDeleteChipDeletePropsMod.ChipDeleteOwnerState
import com.olvind.mui.muiJoy.chipDeleteChipDeletePropsMod.ChipDeleteSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialChipDeletePropsChipDeleteTypeMapb] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[ChipDeleteSlot, ChipDeleteOwnerState, Theme]] = js.undefined
}
object `19` {
  
  inline def apply[Theme](): `19`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`19`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`[?], Theme] (val x: Self & `19`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialChipDeletePropsChipDeleteTypeMapb): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ChipDeleteSlot, ChipDeleteOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
