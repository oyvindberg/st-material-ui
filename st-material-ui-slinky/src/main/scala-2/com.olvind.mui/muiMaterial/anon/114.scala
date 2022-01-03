package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `114` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSliderPropsdefaultComponent] = js.native
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[SliderClassKey]]] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSliderPropsdefaultComponent]] = js.native
}
object `114` {
  
  @scala.inline
  def apply(): `114` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`114`]
  }
  
  @scala.inline
  implicit class `114MutableBuilder`[Self <: `114`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSliderPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[SliderClassKey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSliderPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSliderPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
