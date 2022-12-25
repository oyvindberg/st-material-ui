package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsStackTypeMapdiv
import com.olvind.mui.muiSystem.stackStackClassesMod.StackClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@mui/joy/Stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Stack", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element | Null] = js.native
  
  inline def getStackUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Stack", "stackClasses")
  @js.native
  val stackClasses: StackClasses = js.native
}
