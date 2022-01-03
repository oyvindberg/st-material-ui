package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `113` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSkeletonPropsspan] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSkeletonClassK] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSkeletonPropsspan]] = js.native
}
object `113` {
  
  @scala.inline
  def apply(): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit class `113MutableBuilder`[Self <: `113`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSkeletonPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesSkeletonClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSkeletonPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSkeletonPropsspan*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
