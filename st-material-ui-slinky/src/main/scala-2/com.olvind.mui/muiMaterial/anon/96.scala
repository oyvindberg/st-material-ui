package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `96` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemSecondaryActionProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemSecond] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemSecondaryActionProps]] = js.native
}
object `96` {
  
  @scala.inline
  def apply(): `96` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`96`]
  }
  
  @scala.inline
  implicit class `96MutableBuilder`[Self <: `96`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialListItemSecondaryActionProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesListItemSecond): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialListItemSecondaryActionProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialListItemSecondaryActionProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
