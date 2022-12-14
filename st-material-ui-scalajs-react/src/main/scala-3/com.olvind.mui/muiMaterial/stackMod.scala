package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStackTypeMapdiv
import com.olvind.mui.muiSystem.stackStackClassesMod.StackClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@mui/material/Stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Stack](https://mui.com/material-ui/react-stack/)
    *
    * API:
    *
    * - [Stack API](https://mui.com/material-ui/api/stack/)
    */
  @JSImport("@mui/material/Stack", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element] = js.native
  
  inline def getStackUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Stack", "stackClasses")
  @js.native
  val stackClasses: StackClasses = js.native
}
