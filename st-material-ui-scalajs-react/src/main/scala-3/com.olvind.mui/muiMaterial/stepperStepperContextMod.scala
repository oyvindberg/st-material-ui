package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.Context
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
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
    
    var connector: Node
    
    var nonLinear: Boolean
    
    var orientation: "horizontal" | "vertical"
  }
  object StepperContextType {
    
    inline def apply(
      activeStep: Double,
      alternativeLabel: Boolean,
      nonLinear: Boolean,
      orientation: "horizontal" | "vertical"
    ): StepperContextType = {
      val __obj = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any], alternativeLabel = alternativeLabel.asInstanceOf[js.Any], nonLinear = nonLinear.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], connector = null)
      __obj.asInstanceOf[StepperContextType]
    }
    
    extension [Self <: StepperContextType](x: Self) {
      
      inline def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
      
      inline def setAlternativeLabel(value: Boolean): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
      
      inline def setConnector(value: VdomNode): Self = StObject.set(x, "connector", value.rawNode.asInstanceOf[js.Any])
      
      inline def setConnectorNull: Self = StObject.set(x, "connector", null)
      
      inline def setConnectorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "connector", js.Array(value*))
      
      inline def setConnectorVdomElement(value: VdomElement): Self = StObject.set(x, "connector", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNonLinear(value: Boolean): Self = StObject.set(x, "nonLinear", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
}
