package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsChipDeleteTypeMapbu
import com.olvind.mui.muiJoy.chipDeleteChipDeleteClassesMod.ChipDeleteClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipDeleteMod {
  
  @JSImport("@mui/joy/ChipDelete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Chip](https://mui.com/joy-ui/react-chip/)
    *
    * API:
    *
    * - [ChipDelete API](https://mui.com/joy-ui/api/chip-delete/)
    */
  @JSImport("@mui/joy/ChipDelete", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsChipDeleteTypeMapbu, Element | Null] = js.native
  
  @JSImport("@mui/joy/ChipDelete", "chipDeleteClasses")
  @js.native
  val chipDeleteClasses: ChipDeleteClasses = js.native
  
  inline def getChipDeleteUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getChipDeleteUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
