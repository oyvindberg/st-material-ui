package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.alertAlertPropsMod.AlertOwnerState
import com.olvind.mui.muiJoy.alertAlertPropsMod.AlertSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultProps[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAlertPropsAlertTypeMapdivdefaultC] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[AlertSlot, AlertOwnerState, Theme]] = js.undefined
}
object DefaultProps {
  
  inline def apply[Theme](): DefaultProps[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultProps[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultProps[?], Theme] (val x: Self & DefaultProps[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAlertPropsAlertTypeMapdivdefaultC): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[AlertSlot, AlertOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
