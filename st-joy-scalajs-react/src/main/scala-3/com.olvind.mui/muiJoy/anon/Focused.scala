package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focused extends StObject {
  
  var disabled: String
  
  var error: String
  
  var focused: String
  
  var formControl: String
}
object Focused {
  
  inline def apply(disabled: String, error: String, focused: String, formControl: String): Focused = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], formControl = formControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFormControl(value: String): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
  }
}
