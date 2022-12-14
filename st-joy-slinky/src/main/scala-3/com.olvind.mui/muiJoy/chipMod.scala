package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsChipTypeMapdiv
import com.olvind.mui.muiJoy.chipChipClassesMod.ChipClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod {
  
  @JSImport("@mui/joy/Chip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("@mui/joy/Chip", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element | Null] = js.native
  
  @JSImport("@mui/joy/Chip", "chipClasses")
  @js.native
  val chipClasses: ChipClasses = js.native
  
  inline def getChipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getChipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
