package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepConnectorStepConnectorMod.StepConnectorClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `122` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepConnectorProps] = js.native
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepConnectorClasskey]]] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialStepConnectorProps]] = js.native
}
object `122` {
  
  @scala.inline
  def apply(): `122` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`122`]
  }
  
  @scala.inline
  implicit class `122MutableBuilder`[Self <: `122`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialStepConnectorProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepConnectorClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialStepConnectorProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialStepConnectorProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
