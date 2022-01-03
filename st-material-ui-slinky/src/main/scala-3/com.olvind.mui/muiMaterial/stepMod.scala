package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stepClassesMod.StepClasses
import com.olvind.mui.muiMaterial.stepStepMod.StepProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod {
  
  @JSImport("@mui/material/Step", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: StepProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getStepUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Step", "stepClasses")
  @js.native
  val stepClasses: StepClasses = js.native
}
