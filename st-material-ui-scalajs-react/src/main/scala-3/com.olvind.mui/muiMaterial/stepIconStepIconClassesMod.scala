package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepIconStepIconClassesMod {
  
  @JSImport("@mui/material/StepIcon/stepIconClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/StepIcon/stepIconClasses", JSImport.Default)
  @js.native
  val default: StepIconClasses = js.native
  
  inline def getStepIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type StepIconClassKey = "root" | "text" | "active" | "completed" | "error"
  
  trait StepIconClasses extends StObject {
    
    /** State class applied to the root element if `active={true}`. */
    var active: String
    
    /** State class applied to the root element if `completed={true}`. */
    var completed: String
    
    /** State class applied to the root element if `error={true}`. */
    var error: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the SVG text element. */
    var text: String
  }
  object StepIconClasses {
    
    inline def apply(active: String, completed: String, error: String, root: String, text: String): StepIconClasses = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepIconClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepIconClasses] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
