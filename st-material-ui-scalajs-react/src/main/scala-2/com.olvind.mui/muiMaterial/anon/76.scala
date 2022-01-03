package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `76` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormGroupProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFormGroupClass] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialFormGroupProps]] = js.native
}
object `76` {
  
  @scala.inline
  def apply(): `76` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit class `76MutableBuilder`[Self <: `76`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialFormGroupProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesFormGroupClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialFormGroupProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialFormGroupProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
