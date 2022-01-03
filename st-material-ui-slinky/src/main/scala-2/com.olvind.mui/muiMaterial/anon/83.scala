package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `83` extends StObject {
  
  var defaultProps: js.UndefOr[PartialIconPropsspan] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesIconClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialIconPropsspan]] = js.native
}
object `83` {
  
  @scala.inline
  def apply(): `83` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`83`]
  }
  
  @scala.inline
  implicit class `83MutableBuilder`[Self <: `83`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialIconPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesIconClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialIconPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialIconPropsspan*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
