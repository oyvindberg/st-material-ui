package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTableTypeMaptable
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Table](https://mui.com/joy-ui/react-table/)
    *
    * API:
    *
    * - [Table API](https://mui.com/joy-ui/api/table/)
    */
  @JSImport("@mui/joy/Table/Table", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `tableTableMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element | Null] = default
}
