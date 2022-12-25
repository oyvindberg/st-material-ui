package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsFormControlTypeMapd
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemePickDetailedHTMAbout
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlFormControlMod extends Shortcut {
  
  @JSImport("@mui/joy/FormControl/FormControl", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element | Null] = js.native
  
  @JSImport("@mui/joy/FormControl/FormControl", "FormControlRoot")
  @js.native
  val FormControlRoot: js.Function1[
    /* props */ MUIStyledCommonPropsThemePickDetailedHTMAbout, 
    japgolly.scalajs.react.facade.React.Element | Null
  ] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `formControlFormControlMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element | Null] = default
}
