package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `128` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSwitchProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSwitchClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSwitchProps]] = js.native
}
object `128` {
  
  @scala.inline
  def apply(): `128` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`128`]
  }
  
  @scala.inline
  implicit class `128MutableBuilder`[Self <: `128`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSwitchProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesSwitchClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSwitchProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSwitchProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
