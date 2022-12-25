package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsContainerTypeMapdiv
import com.olvind.mui.muiSystem.containerContainerClassesMod.ContainerClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("@mui/joy/Container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Container", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element | Null] = js.native
  
  @JSImport("@mui/joy/Container", "containerClasses")
  @js.native
  val containerClasses: ContainerClasses = js.native
  
  inline def getContainerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
