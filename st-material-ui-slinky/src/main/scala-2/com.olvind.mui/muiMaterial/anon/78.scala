package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `78` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormLabelPropslabel] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFormLabelClass] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialFormLabelPropslabel]] = js.native
}
object `78` {
  
  @scala.inline
  def apply(): `78` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`78`]
  }
  
  @scala.inline
  implicit class `78MutableBuilder`[Self <: `78`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialFormLabelPropslabel): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesFormLabelClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialFormLabelPropslabel]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialFormLabelPropslabel*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
