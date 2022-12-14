package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTabsTypeMapdiv
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/joy-ui/react-tabs/)
    *
    * API:
    *
    * - [Tabs API](https://mui.com/joy-ui/api/tabs/)
    */
  @JSImport("@mui/joy/Tabs/Tabs", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTabsTypeMapdiv, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTabsTypeMapdiv, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `tabsTabsMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTabsTypeMapdiv, Element | Null] = default
}
