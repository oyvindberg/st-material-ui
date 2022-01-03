package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `50` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardActionsProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardActionsCla] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialCardActionsProps]] = js.native
}
object `50` {
  
  @scala.inline
  def apply(): `50` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`50`]
  }
  
  @scala.inline
  implicit class `50MutableBuilder`[Self <: `50`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialCardActionsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesCardActionsCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialCardActionsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialCardActionsProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
