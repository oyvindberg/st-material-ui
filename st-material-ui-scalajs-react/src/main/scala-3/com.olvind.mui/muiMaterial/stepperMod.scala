package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStepperTypeMapdiv
import com.olvind.mui.muiMaterial.stepperStepperClassesMod.StepperClasses
import com.olvind.mui.muiMaterial.stepperStepperContextMod.StepperContextType
import com.olvind.mui.react.mod.Context
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod {
  
  @JSImport("@mui/material/Stepper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Stepper](https://mui.com/material-ui/react-stepper/)
    *
    * API:
    *
    * - [Stepper API](https://mui.com/material-ui/api/stepper/)
    */
  @JSImport("@mui/material/Stepper", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsStepperTypeMapdiv, Element] = js.native
  
  /**
    * Provides information about the current step in Stepper.
    */
  @JSImport("@mui/material/Stepper", "StepperContext")
  @js.native
  val StepperContext: Context[js.Object | StepperContextType] = js.native
  
  inline def getStepperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Stepper", "stepperClasses")
  @js.native
  val stepperClasses: StepperClasses = js.native
  
  inline def useStepperContext(): StepperContextType | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useStepperContext")().asInstanceOf[StepperContextType | js.Object]
}
