package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `119` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSpeedDialIconProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSpeedDialIconC] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSpeedDialIconProps]] = js.native
}
object `119` {
  
  @scala.inline
  def apply(): `119` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`119`]
  }
  
  @scala.inline
  implicit class `119MutableBuilder`[Self <: `119`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSpeedDialIconProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesSpeedDialIconC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSpeedDialIconProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSpeedDialIconProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
