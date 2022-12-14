package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stepLabelStepLabelClassesMod.StepLabelClasses
import com.olvind.mui.muiMaterial.stepLabelStepLabelMod.StepLabelProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepLabelMod {
  
  @JSImport("@mui/material/StepLabel", JSImport.Namespace)
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
    * - [StepLabel API](https://mui.com/material-ui/api/step-label/)
    */
  /* Inlined (props : @mui/material.@mui/material/StepLabel/StepLabel.StepLabelProps): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    inline def apply(props: StepLabelProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/StepLabel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/StepLabel", "default.muiName")
    @js.native
    def muiName: String = js.native
    inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  inline def getStepLabelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepLabelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/StepLabel", "stepLabelClasses")
  @js.native
  val stepLabelClasses: StepLabelClasses = js.native
}
