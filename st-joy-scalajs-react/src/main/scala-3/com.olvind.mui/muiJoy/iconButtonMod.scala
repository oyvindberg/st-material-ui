package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.OverridePropsExtendIconButtonTypeMapIcon
import com.olvind.mui.muiJoy.iconButtonIconButtonClassesMod.IconButtonClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonMod {
  
  @JSImport("@mui/joy/IconButton", JSImport.Namespace)
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
    * - [IconButton API](https://mui.com/joy-ui/api/icon-button/)
    */
  @JSImport("@mui/joy/IconButton", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ OverridePropsExtendIconButtonTypeMapIcon, Element] = js.native
  
  inline def getIconButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/IconButton", "iconButtonClasses")
  @js.native
  val iconButtonClasses: IconButtonClasses = js.native
}
