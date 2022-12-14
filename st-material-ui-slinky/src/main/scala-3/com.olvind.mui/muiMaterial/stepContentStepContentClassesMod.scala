package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepContentStepContentClassesMod {
  
  @JSImport("@mui/material/StepContent/stepContentClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/StepContent/stepContentClasses", JSImport.Default)
  @js.native
  val default: StepContentClasses = js.native
  
  inline def getStepContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type StepContentClassKey = "root" | "last" | "transition"
  
  trait StepContentClasses extends StObject {
    
    /** Styles applied to the root element if `last={true}` (controlled by `Step`). */
    var last: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the Transition component. */
    var transition: String
  }
  object StepContentClasses {
    
    inline def apply(last: String, root: String, transition: String): StepContentClasses = {
      val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepContentClasses]
    }
    
    extension [Self <: StepContentClasses](x: Self) {
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
}
