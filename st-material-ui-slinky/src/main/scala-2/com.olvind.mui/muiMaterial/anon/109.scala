package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `109` extends StObject {
  
  var defaultProps: js.UndefOr[PartialRadioProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesRadioClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialRadioProps]] = js.native
}
object `109` {
  
  @scala.inline
  def apply(): `109` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit class `109MutableBuilder`[Self <: `109`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialRadioProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesRadioClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialRadioProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialRadioProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
