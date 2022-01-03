package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `45` extends StObject {
  
  var defaultProps: js.UndefOr[PartialButtonPropsdefaultComponent] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesButtonClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialButtonPropsdefaultComponent]] = js.native
}
object `45` {
  
  @scala.inline
  def apply(): `45` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit class `45MutableBuilder`[Self <: `45`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialButtonPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesButtonClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialButtonPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialButtonPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
