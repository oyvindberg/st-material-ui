package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `146` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTypographyPropsspan] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTypographyClas] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTypographyPropsspan]] = js.native
}
object `146` {
  
  @scala.inline
  def apply(): `146` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`146`]
  }
  
  @scala.inline
  implicit class `146MutableBuilder`[Self <: `146`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTypographyPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTypographyClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTypographyPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTypographyPropsspan*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
