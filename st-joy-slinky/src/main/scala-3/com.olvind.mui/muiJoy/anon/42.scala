package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.sheetSheetPropsMod.SheetOwnerState
import com.olvind.mui.muiJoy.sheetSheetPropsMod.SheetSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSheetPropsSheetTypeMapdivdefaultC] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[SheetSlot, SheetOwnerState, Theme]] = js.undefined
}
object `42` {
  
  inline def apply[Theme](): `42`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`42`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `42`[?], Theme] (val x: Self & `42`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialSheetPropsSheetTypeMapdivdefaultC): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[SheetSlot, SheetOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
