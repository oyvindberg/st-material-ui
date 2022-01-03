package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.toggleButtonGroupClassesMod.ToggleButtonGroupClasses
import com.olvind.mui.muiMaterial.toggleButtonGroupToggleButtonGroupMod.ToggleButtonGroupProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonGroupMod {
  
  @JSImport("@mui/material/ToggleButtonGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ToggleButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getToggleButtonGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToggleButtonGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ToggleButtonGroup", "toggleButtonGroupClasses")
  @js.native
  val toggleButtonGroupClasses: ToggleButtonGroupClasses = js.native
}
