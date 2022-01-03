package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.modalModalMod.ModalClassKey
import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `102` extends StObject {
  
  var defaultProps: js.UndefOr[PartialModalPropsdefaultComponent] = js.native
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[ModalClassKey]]] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialModalPropsdefaultComponent]] = js.native
}
object `102` {
  
  @scala.inline
  def apply(): `102` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`102`]
  }
  
  @scala.inline
  implicit class `102MutableBuilder`[Self <: `102`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialModalPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ModalClassKey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialModalPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialModalPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
