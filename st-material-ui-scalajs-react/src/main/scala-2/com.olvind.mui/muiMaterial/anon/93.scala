package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `93` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemButtonPropsdefaultCompone] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemButton] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemButtonPropsdefaultCompone]] = js.native
}
object `93` {
  
  @scala.inline
  def apply(): `93` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`93`]
  }
  
  @scala.inline
  implicit class `93MutableBuilder`[Self <: `93`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialListItemButtonPropsdefaultCompone): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesListItemButton): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialListItemButtonPropsdefaultCompone]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialListItemButtonPropsdefaultCompone*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
