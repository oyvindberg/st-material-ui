package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.OverridePropsExtendButtonTypeMapButtonTy
import com.olvind.mui.muiJoy.buttonButtonClassesMod.ButtonClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("@mui/joy/Button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Button](https://mui.com/joy-ui/react-button/)
    *
    * API:
    *
    * - [Button API](https://mui.com/joy-ui/api/button/)
    */
  @JSImport("@mui/joy/Button", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ OverridePropsExtendButtonTypeMapButtonTy, Element] = js.native
  
  @JSImport("@mui/joy/Button", "buttonClasses")
  @js.native
  val buttonClasses: ButtonClasses = js.native
  
  inline def getButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
