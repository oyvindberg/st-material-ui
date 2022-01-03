package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `129` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTabPropsdefaultComponent] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTabClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTabPropsdefaultComponent]] = js.native
}
object `129` {
  
  @scala.inline
  def apply(): `129` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit class `129MutableBuilder`[Self <: `129`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTabPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTabClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTabPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTabPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
