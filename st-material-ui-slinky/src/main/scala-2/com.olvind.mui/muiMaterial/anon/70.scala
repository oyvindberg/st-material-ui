package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `70` extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionSummaryPropsdefaultCompo] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAccordionSumma] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionSummaryPropsdefaultCompo]] = js.native
}
object `70` {
  
  @scala.inline
  def apply(): `70` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`70`]
  }
  
  @scala.inline
  implicit class `70MutableBuilder`[Self <: `70`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAccordionSummaryPropsdefaultCompo): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAccordionSumma): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialAccordionSummaryPropsdefaultCompo]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialAccordionSummaryPropsdefaultCompo*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
