package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemePickDetailedHTM
import com.olvind.mui.muiJoy.anon.OverridePropsExtendButtonTypeMapButtonTy
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonButtonMod extends Shortcut {
  
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
  @JSImport("@mui/joy/Button/Button", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ OverridePropsExtendButtonTypeMapButtonTy, Element] = js.native
  
  @JSImport("@mui/joy/Button/Button", "ButtonRoot")
  @js.native
  val ButtonRoot: js.Function1[
    /* props */ MUIStyledCommonPropsThemePickDetailedHTM, 
    japgolly.scalajs.react.facade.React.Element | Null
  ] = js.native
  
  type _To = js.Function1[/* props */ OverridePropsExtendButtonTypeMapButtonTy, Element]
  
  /* This means you don't have to write `default`, but can instead just say `buttonButtonMod.foo` */
  override def _to: js.Function1[/* props */ OverridePropsExtendButtonTypeMapButtonTy, Element] = default
}
