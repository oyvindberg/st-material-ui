package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.OverridePropsExtendOptionTypeMapOptionTy
import com.olvind.mui.muiJoy.optionOptionClassesMod.OptionClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionMod {
  
  @JSImport("@mui/joy/Option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Select](https://mui.com/joy-ui/react-select/)
    *
    * API:
    *
    * - [Option API](https://mui.com/joy-ui/api/option/)
    */
  @JSImport("@mui/joy/Option", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ OverridePropsExtendOptionTypeMapOptionTy, Element] = js.native
  
  inline def getOptionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Option", "optionClasses")
  @js.native
  val optionClasses: OptionClasses = js.native
}
