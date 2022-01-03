package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `73` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormControlPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFormControlCla] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialFormControlPropsdiv]] = js.native
}
object `73` {
  
  @scala.inline
  def apply(): `73` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`73`]
  }
  
  @scala.inline
  implicit class `73MutableBuilder`[Self <: `73`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialFormControlPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesFormControlCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialFormControlPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialFormControlPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
