package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `92` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemPropsli] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemClassK] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemPropsli]] = js.native
}
object `92` {
  
  @scala.inline
  def apply(): `92` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`92`]
  }
  
  @scala.inline
  implicit class `92MutableBuilder`[Self <: `92`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialListItemPropsli): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesListItemClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialListItemPropsli]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialListItemPropsli*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
