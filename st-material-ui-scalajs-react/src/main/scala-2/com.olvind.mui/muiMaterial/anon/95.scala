package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `95` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemIconProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemIconCl] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemIconProps]] = js.native
}
object `95` {
  
  @scala.inline
  def apply(): `95` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`95`]
  }
  
  @scala.inline
  implicit class `95MutableBuilder`[Self <: `95`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialListItemIconProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesListItemIconCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialListItemIconProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialListItemIconProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
