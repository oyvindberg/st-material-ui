package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `130` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTablePropstable] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTablePropstable]] = js.native
}
object `130` {
  
  @scala.inline
  def apply(): `130` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`130`]
  }
  
  @scala.inline
  implicit class `130MutableBuilder`[Self <: `130`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTablePropstable): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTableClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTablePropstable]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTablePropstable*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
