package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `61` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogActionsProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDialogActionsC] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogActionsProps]] = js.native
}
object `61` {
  
  @scala.inline
  def apply(): `61` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit class `61MutableBuilder`[Self <: `61`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialDialogActionsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesDialogActionsC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialDialogActionsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialDialogActionsProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
