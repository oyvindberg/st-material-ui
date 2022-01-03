package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `91` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListPropsul] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialListPropsul]] = js.native
}
object `91` {
  
  @scala.inline
  def apply(): `91` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`91`]
  }
  
  @scala.inline
  implicit class `91MutableBuilder`[Self <: `91`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialListPropsul): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesListClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialListPropsul]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialListPropsul*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
