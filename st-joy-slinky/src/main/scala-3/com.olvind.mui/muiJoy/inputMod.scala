package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsInputTypeMapdiv
import com.olvind.mui.muiJoy.inputInputClassesMod.InputClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@mui/joy/Input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Input", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsInputTypeMapdiv, Element | Null] = js.native
  
  inline def getInputUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Input", "inputClasses")
  @js.native
  val inputClasses: InputClasses = js.native
}
