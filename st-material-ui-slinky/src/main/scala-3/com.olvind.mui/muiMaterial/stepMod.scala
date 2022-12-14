package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStepTypeMapdiv
import com.olvind.mui.muiMaterial.stepStepClassesMod.StepClasses
import com.olvind.mui.muiMaterial.stepStepContextMod.StepContextType
import com.olvind.mui.react.mod.Context
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod {
  
  @JSImport("@mui/material/Step", JSImport.Namespace)
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
    * - [Step API](https://mui.com/material-ui/api/step/)
    */
  @JSImport("@mui/material/Step", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsStepTypeMapdiv, Element] = js.native
  
  /**
    * Provides information about the current step in Stepper.
    */
  @JSImport("@mui/material/Step", "StepContext")
  @js.native
  val StepContext: Context[js.Object | StepContextType] = js.native
  
  inline def getStepUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Step", "stepClasses")
  @js.native
  val stepClasses: StepClasses = js.native
  
  inline def useStepContext(): StepContextType | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useStepContext")().asInstanceOf[StepContextType | js.Object]
}
