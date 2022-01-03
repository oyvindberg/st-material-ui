package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `104` extends StObject {
  
  var defaultProps: js.UndefOr[PartialOutlinedInputProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesOutlinedInputC] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialOutlinedInputProps]] = js.native
}
object `104` {
  
  @scala.inline
  def apply(): `104` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`104`]
  }
  
  @scala.inline
  implicit class `104MutableBuilder`[Self <: `104`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialOutlinedInputProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesOutlinedInputC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialOutlinedInputProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialOutlinedInputProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
