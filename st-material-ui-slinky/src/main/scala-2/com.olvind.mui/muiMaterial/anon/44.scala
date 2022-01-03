package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `44` extends StObject {
  
  var defaultProps: js.UndefOr[PartialBreadcrumbsPropsnav] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesBreadcrumbsCla] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialBreadcrumbsPropsnav]] = js.native
}
object `44` {
  
  @scala.inline
  def apply(): `44` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`44`]
  }
  
  @scala.inline
  implicit class `44MutableBuilder`[Self <: `44`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialBreadcrumbsPropsnav): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesBreadcrumbsCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialBreadcrumbsPropsnav]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialBreadcrumbsPropsnav*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
