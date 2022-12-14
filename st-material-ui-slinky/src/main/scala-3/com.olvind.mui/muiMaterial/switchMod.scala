package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.switchSwitchClassesMod.SwitchClasses
import com.olvind.mui.muiMaterial.switchSwitchMod.SwitchProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod {
  
  @JSImport("@mui/material/Switch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getSwitchUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Switch", "switchClasses")
  @js.native
  val switchClasses: SwitchClasses = js.native
}
