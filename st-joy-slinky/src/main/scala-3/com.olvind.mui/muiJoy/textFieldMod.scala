package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTextFieldTypeMapdiv
import com.olvind.mui.muiJoy.textFieldTextFieldClassesMod.TextFieldClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod {
  
  @JSImport("@mui/joy/TextField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/TextField", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTextFieldTypeMapdiv, Element | Null] = js.native
  
  inline def getTextFieldUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextFieldUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/TextField", "textFieldClasses")
  @js.native
  val textFieldClasses: TextFieldClasses = js.native
}
