package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `56` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCircularProgressProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCircularProgre] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialCircularProgressProps]] = js.native
}
object `56` {
  
  @scala.inline
  def apply(): `56` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`56`]
  }
  
  @scala.inline
  implicit class `56MutableBuilder`[Self <: `56`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialCircularProgressProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesCircularProgre): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialCircularProgressProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialCircularProgressProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
