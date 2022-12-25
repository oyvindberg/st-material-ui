package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsSheetTypeMapdiv
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemePickDetailedHTMAccessKey
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sheetSheetMod extends Shortcut {
  
  @JSImport("@mui/joy/Sheet/Sheet", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSheetTypeMapdiv, Element | Null] = js.native
  
  @JSImport("@mui/joy/Sheet/Sheet", "SheetRoot")
  @js.native
  val SheetRoot: js.Function1[/* props */ MUIStyledCommonPropsThemePickDetailedHTMAccessKey, ReactElement | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsSheetTypeMapdiv, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `sheetSheetMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsSheetTypeMapdiv, Element | Null] = default
}
