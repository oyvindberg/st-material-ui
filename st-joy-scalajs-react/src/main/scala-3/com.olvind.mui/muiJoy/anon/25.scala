package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.formLabelFormLabelPropsMod.FormLabelOwnerState
import com.olvind.mui.muiJoy.formLabelFormLabelPropsMod.FormLabelSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormLabelPropsFormLabelTypeMaplab] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[FormLabelSlot, FormLabelOwnerState, Theme]] = js.undefined
}
object `25` {
  
  inline def apply[Theme](): `25`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`25`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `25`[?], Theme] (val x: Self & `25`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialFormLabelPropsFormLabelTypeMaplab): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[FormLabelSlot, FormLabelOwnerState, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
