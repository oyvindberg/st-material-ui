package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.textFieldClassesMod.TextFieldClasses
import com.olvind.mui.muiMaterial.textFieldTextFieldMod.TextFieldProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod {
  
  @JSImport("@mui/material/TextField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TextFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getTextFieldUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextFieldUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TextField", "textFieldClasses")
  @js.native
  val textFieldClasses: TextFieldClasses = js.native
}
