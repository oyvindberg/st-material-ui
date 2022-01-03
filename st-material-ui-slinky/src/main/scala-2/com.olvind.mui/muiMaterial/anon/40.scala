package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.backdropBackdropMod.BackdropClassKey
import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `40` extends StObject {
  
  var defaultProps: js.UndefOr[PartialBackdropPropsdefaultComponent] = js.native
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[BackdropClassKey]]] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialBackdropPropsdefaultComponent]] = js.native
}
object `40` {
  
  @scala.inline
  def apply(): `40` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit class `40MutableBuilder`[Self <: `40`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialBackdropPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[BackdropClassKey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialBackdropPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialBackdropPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
