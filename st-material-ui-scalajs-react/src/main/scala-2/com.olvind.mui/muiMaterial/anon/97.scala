package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `97` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemTextPropsspanp] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemTextCl] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemTextPropsspanp]] = js.native
}
object `97` {
  
  @scala.inline
  def apply(): `97` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`97`]
  }
  
  @scala.inline
  implicit class `97MutableBuilder`[Self <: `97`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialListItemTextPropsspanp): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesListItemTextCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialListItemTextPropsspanp]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialListItemTextPropsspanp*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
