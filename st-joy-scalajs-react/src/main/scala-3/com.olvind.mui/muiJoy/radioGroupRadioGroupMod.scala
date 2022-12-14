package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsRadioGroupTypeMapdi
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupRadioGroupMod extends Shortcut {
  
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
  @JSImport("@mui/joy/RadioGroup/RadioGroup", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsRadioGroupTypeMapdi, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsRadioGroupTypeMapdi, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `radioGroupRadioGroupMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsRadioGroupTypeMapdi, Element | Null] = default
}
