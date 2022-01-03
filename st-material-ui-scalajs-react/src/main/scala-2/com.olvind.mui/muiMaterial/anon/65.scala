package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `65` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDividerPropshr] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDividerClassKe] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialDividerPropshr]] = js.native
}
object `65` {
  
  @scala.inline
  def apply(): `65` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`65`]
  }
  
  @scala.inline
  implicit class `65MutableBuilder`[Self <: `65`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialDividerPropshr): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesDividerClassKe): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialDividerPropshr]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialDividerPropshr*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
