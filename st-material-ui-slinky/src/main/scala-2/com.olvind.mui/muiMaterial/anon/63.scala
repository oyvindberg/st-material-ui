package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `63` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogContentTextPropsspan] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDialogContentT] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogContentTextPropsspan]] = js.native
}
object `63` {
  
  @scala.inline
  def apply(): `63` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`63`]
  }
  
  @scala.inline
  implicit class `63MutableBuilder`[Self <: `63`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialDialogContentTextPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesDialogContentT): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialDialogContentTextPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialDialogContentTextPropsspan*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
