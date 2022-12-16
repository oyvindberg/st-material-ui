package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/StepIcon/stepIconClasses.StepIconClasses> */
trait PartialStepIconClasses extends StObject {
  
  var active: js.UndefOr[String] = js.undefined
  
  var completed: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PartialStepIconClasses {
  
  inline def apply(): PartialStepIconClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStepIconClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStepIconClasses] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
