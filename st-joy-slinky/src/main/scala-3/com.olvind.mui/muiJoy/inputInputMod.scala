package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsInputTypeMapdiv
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemeDetailedHTMLProAccept
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemeDetailedHTMLProAccessKey
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Input](https://mui.com/joy-ui/react-input/)
    *
    * API:
    *
    * - [Input API](https://mui.com/joy-ui/api/input/)
    */
  @JSImport("@mui/joy/Input/Input", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsInputTypeMapdiv, Element | Null] = js.native
  
  @JSImport("@mui/joy/Input/Input", "StyledInputEndDecorator")
  @js.native
  val StyledInputEndDecorator: js.Function1[
    /* props */ MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant, 
    ReactElement | Null
  ] = js.native
  
  @JSImport("@mui/joy/Input/Input", "StyledInputHtml")
  @js.native
  val StyledInputHtml: js.Function1[/* props */ MUIStyledCommonPropsThemeDetailedHTMLProAccept, ReactElement | Null] = js.native
  
  @JSImport("@mui/joy/Input/Input", "StyledInputRoot")
  @js.native
  val StyledInputRoot: js.Function1[/* props */ MUIStyledCommonPropsThemeDetailedHTMLProAccessKey, ReactElement | Null] = js.native
  
  @JSImport("@mui/joy/Input/Input", "StyledInputStartDecorator")
  @js.native
  val StyledInputStartDecorator: js.Function1[
    /* props */ MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant, 
    ReactElement | Null
  ] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsInputTypeMapdiv, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `inputInputMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsInputTypeMapdiv, Element | Null] = default
}
