package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.FormControlUnstyledState
import com.olvind.mui.react.mod.HTMLInputTypeAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focused extends StObject {
  
  var focused: Boolean
  
  var formControlContext: js.UndefOr[FormControlUnstyledState] = js.undefined
  
  var `type`: js.UndefOr[HTMLInputTypeAttribute] = js.undefined
}
object Focused {
  
  inline def apply(focused: Boolean): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  
  extension [Self <: Focused](x: Self) {
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFormControlContext(value: FormControlUnstyledState): Self = StObject.set(x, "formControlContext", value.asInstanceOf[js.Any])
    
    inline def setFormControlContextUndefined: Self = StObject.set(x, "formControlContext", js.undefined)
    
    inline def setType(value: HTMLInputTypeAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
