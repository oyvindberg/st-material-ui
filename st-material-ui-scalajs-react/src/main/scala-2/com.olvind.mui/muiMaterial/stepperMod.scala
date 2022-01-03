package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stepperClassesMod.StepperClasses
import com.olvind.mui.muiMaterial.stepperStepperMod.StepperProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod {
  
  @JSImport("@mui/material/Stepper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: StepperProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getStepperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Stepper", "stepperClasses")
  @js.native
  val stepperClasses: StepperClasses = js.native
}
