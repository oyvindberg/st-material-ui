package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/StepContent/stepContentClasses.StepContentClasses> */
trait PartialStepContentClasses extends StObject {
  
  var last: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
}
object PartialStepContentClasses {
  
  inline def apply(): PartialStepContentClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStepContentClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStepContentClasses] (val x: Self) extends AnyVal {
    
    inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
