package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsSwitchTypeMapdiv
import com.olvind.mui.muiJoy.switchSwitchClassesMod.SwitchClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod {
  
  @JSImport("@mui/joy/Switch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Switch](https://mui.com/joy-ui/react-switch/)
    *
    * API:
    *
    * - [Switch API](https://mui.com/joy-ui/api/switch/)
    */
  @JSImport("@mui/joy/Switch", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSwitchTypeMapdiv, Element | Null] = js.native
  
  inline def getSwitchUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Switch", "switchClasses")
  @js.native
  val switchClasses: SwitchClasses = js.native
}
