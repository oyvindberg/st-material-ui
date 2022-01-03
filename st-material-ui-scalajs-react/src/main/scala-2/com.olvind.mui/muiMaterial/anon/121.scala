package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.stepButtonStepButtonMod.StepButtonClasskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `121` extends StObject {
  
  var defaultProps: js.UndefOr[PartialStepButtonPropsbutton] = js.native
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[StepButtonClasskey]]] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialStepButtonPropsbutton]] = js.native
}
object `121` {
  
  @scala.inline
  def apply(): `121` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit class `121MutableBuilder`[Self <: `121`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialStepButtonPropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[StepButtonClasskey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialStepButtonPropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialStepButtonPropsbutton*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
