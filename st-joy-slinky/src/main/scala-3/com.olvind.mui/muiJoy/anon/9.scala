package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.breadcrumbsBreadcrumbsPropsMod.BreadcrumbsOwnerState
import com.olvind.mui.muiJoy.breadcrumbsBreadcrumbsPropsMod.BreadcrumbsSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialBreadcrumbsPropsBreadcrumbsTypeMa] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[BreadcrumbsSlot, BreadcrumbsOwnerState, Theme]] = js.undefined
}
object `9` {
  
  inline def apply[Theme](): `9`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`[?], Theme] (val x: Self & `9`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialBreadcrumbsPropsBreadcrumbsTypeMa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[BreadcrumbsSlot, BreadcrumbsOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
