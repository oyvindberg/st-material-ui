package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `100` extends StObject {
  
  var defaultProps: js.UndefOr[PartialMenuItemPropsdefaultComponent] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesMenuItemClassK] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialMenuItemPropsdefaultComponent]] = js.native
}
object `100` {
  
  @scala.inline
  def apply(): `100` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`100`]
  }
  
  @scala.inline
  implicit class `100MutableBuilder`[Self <: `100`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialMenuItemPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesMenuItemClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialMenuItemPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialMenuItemPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
