package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stepConnectorClassesMod.StepConnectorClasses
import com.olvind.mui.muiMaterial.stepConnectorStepConnectorMod.StepConnectorProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepConnectorMod {
  
  @JSImport("@mui/material/StepConnector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: StepConnectorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getStepConnectorUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepConnectorUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/StepConnector", "stepConnectorClasses")
  @js.native
  val stepConnectorClasses: StepConnectorClasses = js.native
}
