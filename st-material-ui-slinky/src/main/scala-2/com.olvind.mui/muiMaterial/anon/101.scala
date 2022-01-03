package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `101` extends StObject {
  
  var defaultProps: js.UndefOr[PartialMobileStepperProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesMobileStepperC] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialMobileStepperProps]] = js.native
}
object `101` {
  
  @scala.inline
  def apply(): `101` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`101`]
  }
  
  @scala.inline
  implicit class `101MutableBuilder`[Self <: `101`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialMobileStepperProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesMobileStepperC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialMobileStepperProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialMobileStepperProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
