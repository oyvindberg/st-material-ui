package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `144` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTooltipProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTooltipClassKe] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTooltipProps]] = js.native
}
object `144` {
  
  @scala.inline
  def apply(): `144` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit class `144MutableBuilder`[Self <: `144`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTooltipProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTooltipClassKe): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTooltipProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTooltipProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
