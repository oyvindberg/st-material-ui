package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `110` extends StObject {
  
  var defaultProps: js.UndefOr[PartialRatingProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesRatingClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialRatingProps]] = js.native
}
object `110` {
  
  @scala.inline
  def apply(): `110` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit class `110MutableBuilder`[Self <: `110`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialRatingProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesRatingClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialRatingProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialRatingProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
