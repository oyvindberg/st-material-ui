package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.backdropBackdropMod.BackdropClassKey
import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  var defaultProps: js.UndefOr[PartialBackdropPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[BackdropClassKey]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBackdropPropsdefaultComponent]] = js.undefined
}
object `40` {
  
  inline def apply(): `40` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`40`]
  }
  
  extension [Self <: `40`](x: Self) {
    
    inline def setDefaultProps(value: PartialBackdropPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[BackdropClassKey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBackdropPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBackdropPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
