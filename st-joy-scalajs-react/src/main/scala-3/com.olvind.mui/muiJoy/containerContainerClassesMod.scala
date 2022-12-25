package com.olvind.mui.muiJoy

import com.olvind.mui.muiSystem.containerContainerClassesMod.ContainerClasses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerContainerClassesMod {
  
  @JSImport("@mui/joy/Container/containerClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Container/containerClasses", JSImport.Default)
  @js.native
  val default: ContainerClasses = js.native
  
  inline def getContainerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
