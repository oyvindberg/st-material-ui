package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `47` extends StObject {
  
  var defaultProps: js.UndefOr[PartialButtonGroupPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesButtonGroupCla] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialButtonGroupPropsdiv]] = js.native
}
object `47` {
  
  @scala.inline
  def apply(): `47` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`47`]
  }
  
  @scala.inline
  implicit class `47MutableBuilder`[Self <: `47`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialButtonGroupPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesButtonGroupCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialButtonGroupPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialButtonGroupPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
