package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepStepClassesMod {
  
  @JSImport("@mui/material/Step/stepClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Step/stepClasses", JSImport.Default)
  @js.native
  val default: StepClasses = js.native
  
  inline def getStepUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type StepClassKey = "root" | "horizontal" | "vertical" | "alternativeLabel" | "completed"
  
  trait StepClasses extends StObject {
    
    /** Styles applied to the root element if `alternativeLabel={true}`. */
    var alternativeLabel: String
    
    /** State class applied to the root element if `completed={true}`. */
    var completed: String
    
    /** Styles applied to the root element if `orientation="horizontal"`. */
    var horizontal: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object StepClasses {
    
    inline def apply(alternativeLabel: String, completed: String, horizontal: String, root: String, vertical: String): StepClasses = {
      val __obj = js.Dynamic.literal(alternativeLabel = alternativeLabel.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepClasses]
    }
    
    extension [Self <: StepClasses](x: Self) {
      
      inline def setAlternativeLabel(value: String): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
