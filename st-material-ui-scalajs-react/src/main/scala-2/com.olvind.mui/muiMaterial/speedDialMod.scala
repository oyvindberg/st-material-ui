package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.speedDialClassesMod.SpeedDialClasses
import com.olvind.mui.muiMaterial.speedDialSpeedDialMod.SpeedDialProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedDialMod {
  
  @JSImport("@mui/material/SpeedDial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: SpeedDialProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getSpeedDialUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/SpeedDial", "speedDialClasses")
  @js.native
  val speedDialClasses: SpeedDialClasses = js.native
}
