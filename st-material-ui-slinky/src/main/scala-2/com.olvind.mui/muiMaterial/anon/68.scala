package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `68` extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionActionsProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAccordionActio] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionActionsProps]] = js.native
}
object `68` {
  
  @scala.inline
  def apply(): `68` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`68`]
  }
  
  @scala.inline
  implicit class `68MutableBuilder`[Self <: `68`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAccordionActionsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAccordionActio): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialAccordionActionsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialAccordionActionsProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
