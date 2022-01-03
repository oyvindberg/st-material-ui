package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `69` extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionDetailsProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAccordionDetai] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionDetailsProps]] = js.native
}
object `69` {
  
  @scala.inline
  def apply(): `69` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`69`]
  }
  
  @scala.inline
  implicit class `69MutableBuilder`[Self <: `69`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAccordionDetailsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAccordionDetai): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialAccordionDetailsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialAccordionDetailsProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
