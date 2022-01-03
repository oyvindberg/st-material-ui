package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `98` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListSubheaderPropsli] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListSubheaderC] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialListSubheaderPropsli]] = js.native
}
object `98` {
  
  @scala.inline
  def apply(): `98` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`98`]
  }
  
  @scala.inline
  implicit class `98MutableBuilder`[Self <: `98`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialListSubheaderPropsli): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesListSubheaderC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialListSubheaderPropsli]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialListSubheaderPropsli*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
