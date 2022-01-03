package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `142` extends StObject {
  
  var defaultProps: js.UndefOr[PartialToggleButtonGroupProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesToggleButtonGr] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialToggleButtonGroupProps]] = js.native
}
object `142` {
  
  @scala.inline
  def apply(): `142` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`142`]
  }
  
  @scala.inline
  implicit class `142MutableBuilder`[Self <: `142`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialToggleButtonGroupProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesToggleButtonGr): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialToggleButtonGroupProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialToggleButtonGroupProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
