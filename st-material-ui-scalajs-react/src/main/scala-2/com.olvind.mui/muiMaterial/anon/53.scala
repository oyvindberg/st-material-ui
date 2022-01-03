package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `53` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardMediaPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardMediaClass] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialCardMediaPropsdiv]] = js.native
}
object `53` {
  
  @scala.inline
  def apply(): `53` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`53`]
  }
  
  @scala.inline
  implicit class `53MutableBuilder`[Self <: `53`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialCardMediaPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesCardMediaClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialCardMediaPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialCardMediaPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
