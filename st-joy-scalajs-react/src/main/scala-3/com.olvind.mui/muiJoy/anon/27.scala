package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.linearProgressLinearProgressPropsMod.LinearProgressOwnerState
import com.olvind.mui.muiJoy.linearProgressLinearProgressPropsMod.LinearProgressSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialLinearProgressPropsLinearProgress] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[LinearProgressSlot, LinearProgressOwnerState, Theme]] = js.undefined
}
object `27` {
  
  inline def apply[Theme](): `27`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`27`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `27`[?], Theme] (val x: Self & `27`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialLinearProgressPropsLinearProgress): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[LinearProgressSlot, LinearProgressOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
