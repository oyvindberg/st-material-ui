package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.inputBaseInputBaseClassesMod.InputBaseClasses
import com.olvind.mui.muiMaterial.inputBaseInputBaseMod.InputBaseProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputBaseMod {
  
  @JSImport("@mui/material/InputBase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: InputBaseProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getInputBaseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputBaseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/InputBase", "inputBaseClasses")
  @js.native
  val inputBaseClasses: InputBaseClasses = js.native
}
