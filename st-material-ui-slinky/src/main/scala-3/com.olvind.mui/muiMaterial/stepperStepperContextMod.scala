package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.Context
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperStepperContextMod {
  
  @JSImport("@mui/material/Stepper/StepperContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides information about the current step in Stepper.
    */
  @JSImport("@mui/material/Stepper/StepperContext", JSImport.Default)
  @js.native
  val default: Context[js.Object | StepperContextType] = js.native
  
  inline def useStepperContext(): StepperContextType | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useStepperContext")().asInstanceOf[StepperContextType | js.Object]
  
  trait StepperContextType extends StObject {
    
    var activeStep: Double
    
    var alternativeLabel: Boolean
    
    var connector: ReactElement
    
    var nonLinear: Boolean
    
    var orientation: "horizontal" | "vertical"
  }
  object StepperContextType {
    
    inline def apply(
      activeStep: Double,
      alternativeLabel: Boolean,
      connector: ReactElement,
      nonLinear: Boolean,
      orientation: "horizontal" | "vertical"
    ): StepperContextType = {
      val __obj = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any], alternativeLabel = alternativeLabel.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], nonLinear = nonLinear.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperContextType]
    }
    
    extension [Self <: StepperContextType](x: Self) {
      
      inline def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
      
      inline def setAlternativeLabel(value: Boolean): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
      
      inline def setConnector(value: ReactElement): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      inline def setNonLinear(value: Boolean): Self = StObject.set(x, "nonLinear", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
}
