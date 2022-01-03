package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `85` extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesInputClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialInputProps]] = js.native
}
object `85` {
  
  @scala.inline
  def apply(): `85` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`85`]
  }
  
  @scala.inline
  implicit class `85MutableBuilder`[Self <: `85`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialInputProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesInputClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialInputProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialInputProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
