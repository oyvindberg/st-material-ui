package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import com.olvind.mui.muiJoy.typographyTypographyPropsMod.TypographyOwnerState
import com.olvind.mui.muiJoy.typographyTypographyPropsMod.TypographySlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTypographyPropsTypographyTypeMaps] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[TypographySlot, TypographyOwnerState, Theme]] = js.undefined
}
object `54` {
  
  inline def apply[Theme](): `54`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`54`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `54`[?], Theme] (val x: Self & `54`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTypographyPropsTypographyTypeMaps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[TypographySlot, TypographyOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
