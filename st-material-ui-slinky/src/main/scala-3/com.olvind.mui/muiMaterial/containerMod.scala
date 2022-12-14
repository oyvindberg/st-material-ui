package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsContainerTypeMapdiv
import com.olvind.mui.muiSystem.containerContainerClassesMod.ContainerClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("@mui/material/Container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Container](https://mui.com/material-ui/react-container/)
    *
    * API:
    *
    * - [Container API](https://mui.com/material-ui/api/container/)
    */
  @JSImport("@mui/material/Container", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element] = js.native
  
  @JSImport("@mui/material/Container", "containerClasses")
  @js.native
  val containerClasses: ContainerClasses = js.native
  
  inline def getContainerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
