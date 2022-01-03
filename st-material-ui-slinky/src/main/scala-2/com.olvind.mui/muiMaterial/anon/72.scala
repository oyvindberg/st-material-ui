package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `72` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFilledInputProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFilledInputCla] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialFilledInputProps]] = js.native
}
object `72` {
  
  @scala.inline
  def apply(): `72` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`72`]
  }
  
  @scala.inline
  implicit class `72MutableBuilder`[Self <: `72`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialFilledInputProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesFilledInputCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialFilledInputProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialFilledInputProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
