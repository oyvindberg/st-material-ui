package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepLabelStepLabelMod.StepLabelClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `125` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepLabelProps] = js.native
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepLabelClasskey]]] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialStepLabelProps]] = js.native
}
object `125` {
  
  @scala.inline
  def apply(): `125` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`125`]
  }
  
  @scala.inline
  implicit class `125MutableBuilder`[Self <: `125`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialStepLabelProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepLabelClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialStepLabelProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialStepLabelProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
