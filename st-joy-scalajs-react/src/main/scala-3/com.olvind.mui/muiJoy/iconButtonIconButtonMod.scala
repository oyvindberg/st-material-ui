package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemeDetailedHTMLProAbout
import com.olvind.mui.muiJoy.anon.OverridePropsExtendIconButtonTypeMapIcon
import com.olvind.mui.muiJoy.anon.PickMUIStyledCommonPropsThemeClassAttrib
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonIconButtonMod extends Shortcut {
  
  @JSImport("@mui/joy/IconButton/IconButton", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ OverridePropsExtendIconButtonTypeMapIcon, Element] = js.native
  
  @JSImport("@mui/joy/IconButton/IconButton", "IconButtonRoot")
  @js.native
  val IconButtonRoot: js.Function1[
    /* props */ PickMUIStyledCommonPropsThemeClassAttrib, 
    japgolly.scalajs.react.facade.React.Element | Null
  ] = js.native
  
  @JSImport("@mui/joy/IconButton/IconButton", "StyledIconButton")
  @js.native
  val StyledIconButton: js.Function1[
    /* props */ MUIStyledCommonPropsThemeDetailedHTMLProAbout, 
    japgolly.scalajs.react.facade.React.Element | Null
  ] = js.native
  
  type _To = js.Function1[/* props */ OverridePropsExtendIconButtonTypeMapIcon, Element]
  
  /* This means you don't have to write `default`, but can instead just say `iconButtonIconButtonMod.foo` */
  override def _to: js.Function1[/* props */ OverridePropsExtendIconButtonTypeMapIcon, Element] = default
}
