package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsChipTypeMapdiv
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipChipMod extends Shortcut {
  
  /**
    * Chips represent complex entities in small blocks, such as a contact.
    *
    * Demos:
    *
    * - [Chip](https://mui.com/joy-ui/react-chip/)
    *
    * API:
    *
    * - [Chip API](https://mui.com/joy-ui/api/chip/)
    */
  @JSImport("@mui/joy/Chip/Chip", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `chipChipMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element | Null] = default
}
