package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stepContentClassesMod.StepContentClasses
import com.olvind.mui.muiMaterial.stepContentStepContentMod.StepContentProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepContentMod {
  
  @JSImport("@mui/material/StepContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: StepContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getStepContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/StepContent", "stepContentClasses")
  @js.native
  val stepContentClasses: StepContentClasses = js.native
}
