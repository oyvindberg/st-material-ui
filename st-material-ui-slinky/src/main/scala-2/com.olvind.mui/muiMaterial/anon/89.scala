package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `89` extends StObject {
  
  var defaultProps: js.UndefOr[PartialLinearProgressProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesLinearProgress] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialLinearProgressProps]] = js.native
}
object `89` {
  
  @scala.inline
  def apply(): `89` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`89`]
  }
  
  @scala.inline
  implicit class `89MutableBuilder`[Self <: `89`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialLinearProgressProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesLinearProgress): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialLinearProgressProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialLinearProgressProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
