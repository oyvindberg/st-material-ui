package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.speedDialActionClassesMod.SpeedDialActionClasses
import com.olvind.mui.muiMaterial.speedDialActionSpeedDialActionMod.SpeedDialActionProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedDialActionMod {
  
  @JSImport("@mui/material/SpeedDialAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: SpeedDialActionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getSpeedDialActionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialActionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/SpeedDialAction", "speedDialActionClasses")
  @js.native
  val speedDialActionClasses: SpeedDialActionClasses = js.native
}
