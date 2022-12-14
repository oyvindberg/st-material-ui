package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsDividerTypeMaphr
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemePickDetailedHTMAbout
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerDividerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Divider](https://mui.com/joy-ui/react-divider/)
    *
    * API:
    *
    * - [Divider API](https://mui.com/joy-ui/api/divider/)
    */
  @JSImport("@mui/joy/Divider/Divider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element | Null] = js.native
  
  @JSImport("@mui/joy/Divider/Divider", "DividerRoot")
  @js.native
  val DividerRoot: js.Function1[/* props */ MUIStyledCommonPropsThemePickDetailedHTMAbout, ReactElement | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `dividerDividerMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element | Null] = default
}
