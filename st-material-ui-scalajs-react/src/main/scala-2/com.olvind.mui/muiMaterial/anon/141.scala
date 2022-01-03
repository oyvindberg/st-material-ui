package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `141` extends StObject {
  
  var defaultProps: js.UndefOr[PartialToggleButtonPropsdefaultComponent] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesToggleButtonCl] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialToggleButtonPropsdefaultComponent]] = js.native
}
object `141` {
  
  @scala.inline
  def apply(): `141` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`141`]
  }
  
  @scala.inline
  implicit class `141MutableBuilder`[Self <: `141`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialToggleButtonPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesToggleButtonCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialToggleButtonPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialToggleButtonPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
