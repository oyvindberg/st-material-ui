package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.formControlFormControlContextMod.FormControlContextValue
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormControl extends StObject {
  
  var formControl: FormControlContextValue
  
  var inputStateClasses: Record[String, Any]
  
  var propsToForward: Record[String, Any]
  
  var rootStateClasses: Record[String, Any]
}
object FormControl {
  
  inline def apply(
    inputStateClasses: Record[String, Any],
    propsToForward: Record[String, Any],
    rootStateClasses: Record[String, Any]
  ): FormControl = {
    val __obj = js.Dynamic.literal(inputStateClasses = inputStateClasses.asInstanceOf[js.Any], propsToForward = propsToForward.asInstanceOf[js.Any], rootStateClasses = rootStateClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormControl] (val x: Self) extends AnyVal {
    
    inline def setFormControl(value: FormControlContextValue): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
    
    inline def setFormControlUndefined: Self = StObject.set(x, "formControl", js.undefined)
    
    inline def setInputStateClasses(value: Record[String, Any]): Self = StObject.set(x, "inputStateClasses", value.asInstanceOf[js.Any])
    
    inline def setPropsToForward(value: Record[String, Any]): Self = StObject.set(x, "propsToForward", value.asInstanceOf[js.Any])
    
    inline def setRootStateClasses(value: Record[String, Any]): Self = StObject.set(x, "rootStateClasses", value.asInstanceOf[js.Any])
  }
}
