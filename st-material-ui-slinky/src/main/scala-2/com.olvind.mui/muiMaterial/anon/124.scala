package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepIconStepIconMod.StepIconClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `124` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepIconProps] = js.native
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepIconClasskey]]] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialStepIconProps]] = js.native
}
object `124` {
  
  @scala.inline
  def apply(): `124` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`124`]
  }
  
  @scala.inline
  implicit class `124MutableBuilder`[Self <: `124`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialStepIconProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepIconClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialStepIconProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialStepIconProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
