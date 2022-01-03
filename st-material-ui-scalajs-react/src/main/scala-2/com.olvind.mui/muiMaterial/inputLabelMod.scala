package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.inputLabelClassesMod.InputLabelClasses
import com.olvind.mui.muiMaterial.inputLabelInputLabelMod.InputLabelProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputLabelMod {
  
  @JSImport("@mui/material/InputLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: InputLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getInputLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/InputLabel", "inputLabelClasses")
  @js.native
  val inputLabelClasses: InputLabelClasses = js.native
}
