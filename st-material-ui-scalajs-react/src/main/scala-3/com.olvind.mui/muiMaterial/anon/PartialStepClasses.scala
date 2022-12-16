package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Step/stepClasses.StepClasses> */
trait PartialStepClasses extends StObject {
  
  var alternativeLabel: js.UndefOr[String] = js.undefined
  
  var completed: js.UndefOr[String] = js.undefined
  
  var horizontal: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[String] = js.undefined
}
object PartialStepClasses {
  
  inline def apply(): PartialStepClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStepClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStepClasses] (val x: Self) extends AnyVal {
    
    inline def setAlternativeLabel(value: String): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
    
    inline def setAlternativeLabelUndefined: Self = StObject.set(x, "alternativeLabel", js.undefined)
    
    inline def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
