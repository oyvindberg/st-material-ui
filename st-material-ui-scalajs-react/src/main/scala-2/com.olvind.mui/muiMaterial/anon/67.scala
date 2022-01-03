package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `67` extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAccordionClass] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionProps]] = js.native
}
object `67` {
  
  @scala.inline
  def apply(): `67` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`67`]
  }
  
  @scala.inline
  implicit class `67MutableBuilder`[Self <: `67`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAccordionProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAccordionClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialAccordionProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialAccordionProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
