package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsRadioGroupTypeMapdi
import com.olvind.mui.muiJoy.radioGroupRadioGroupClassesMod.RadioGroupClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod {
  
  @JSImport("@mui/joy/RadioGroup", JSImport.Namespace)
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
    * - [RadioGroup API](https://mui.com/joy-ui/api/radio-group/)
    */
  @JSImport("@mui/joy/RadioGroup", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsRadioGroupTypeMapdi, Element | Null] = js.native
  
  inline def getRadioGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/RadioGroup", "radioGroupClasses")
  @js.native
  val radioGroupClasses: RadioGroupClasses = js.native
}
