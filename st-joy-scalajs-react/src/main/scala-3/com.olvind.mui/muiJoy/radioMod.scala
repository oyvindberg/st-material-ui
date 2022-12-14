package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsRadioTypeMapspan
import com.olvind.mui.muiJoy.radioRadioClassesMod.RadioClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  @JSImport("@mui/joy/Radio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Radio](https://mui.com/joy-ui/react-radio-button/)
    *
    * API:
    *
    * - [Radio API](https://mui.com/joy-ui/api/radio/)
    */
  @JSImport("@mui/joy/Radio", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsRadioTypeMapspan, Element | Null] = js.native
  
  inline def getRadioUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Radio", "radioClasses")
  @js.native
  val radioClasses: RadioClasses = js.native
}
