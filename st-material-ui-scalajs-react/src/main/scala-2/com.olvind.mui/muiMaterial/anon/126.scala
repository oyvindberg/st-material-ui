package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepperStepperMod.StepperClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `126` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepperProps] = js.native
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepperClasskey]]] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialStepperProps]] = js.native
}
object `126` {
  
  @scala.inline
  def apply(): `126` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`126`]
  }
  
  @scala.inline
  implicit class `126MutableBuilder`[Self <: `126`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialStepperProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepperClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialStepperProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialStepperProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
