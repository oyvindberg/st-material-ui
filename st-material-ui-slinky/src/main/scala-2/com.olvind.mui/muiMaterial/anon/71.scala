package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `71` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFabPropsdefaultComponent] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFabClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialFabPropsdefaultComponent]] = js.native
}
object `71` {
  
  @scala.inline
  def apply(): `71` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`71`]
  }
  
  @scala.inline
  implicit class `71MutableBuilder`[Self <: `71`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialFabPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesFabClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialFabPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialFabPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
