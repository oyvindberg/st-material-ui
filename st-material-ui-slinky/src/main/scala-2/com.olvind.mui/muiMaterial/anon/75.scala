package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `75` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormControlLabelProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFormControlLab] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialFormControlLabelProps]] = js.native
}
object `75` {
  
  @scala.inline
  def apply(): `75` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`75`]
  }
  
  @scala.inline
  implicit class `75MutableBuilder`[Self <: `75`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialFormControlLabelProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesFormControlLab): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialFormControlLabelProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialFormControlLabelProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
