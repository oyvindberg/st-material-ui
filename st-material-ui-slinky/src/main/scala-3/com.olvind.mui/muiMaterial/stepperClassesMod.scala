package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperClassesMod {
  
  @JSImport("@mui/material/Stepper/stepperClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Stepper/stepperClasses", JSImport.Default)
  @js.native
  val default: StepperClasses = js.native
  
  inline def getStepperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.horizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.vertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alternativeLabel
  */
  trait StepperClassKey extends StObject
  
  trait StepperClasses extends StObject {
    
    /** Styles applied to the root element if `alternativeLabel={true}`. */
    var alternativeLabel: String
    
    /** Styles applied to the root element if `orientation="horizontal"`. */
    var horizontal: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object StepperClasses {
    
    inline def apply(alternativeLabel: String, horizontal: String, root: String, vertical: String): StepperClasses = {
      val __obj = js.Dynamic.literal(alternativeLabel = alternativeLabel.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperClasses]
    }
    
    extension [Self <: StepperClasses](x: Self) {
      
      inline def setAlternativeLabel(value: String): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
