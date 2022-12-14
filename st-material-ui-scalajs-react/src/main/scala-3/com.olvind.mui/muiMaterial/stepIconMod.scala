package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stepIconStepIconClassesMod.StepIconClasses
import com.olvind.mui.muiMaterial.stepIconStepIconMod.StepIconProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepIconMod {
  
  @JSImport("@mui/material/StepIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: StepIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getStepIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/StepIcon", "stepIconClasses")
  @js.native
  val stepIconClasses: StepIconClasses = js.native
}
