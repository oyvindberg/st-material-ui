package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsChipTypeMapdiv
import com.olvind.mui.muiMaterial.chipChipClassesMod.ChipClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod {
  
  @JSImport("@mui/material/Chip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Chips represent complex entities in small blocks, such as a contact.
    *
    * Demos:
    *
    * - [Chip](https://mui.com/material-ui/react-chip/)
    *
    * API:
    *
    * - [Chip API](https://mui.com/material-ui/api/chip/)
    */
  @JSImport("@mui/material/Chip", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element] = js.native
  
  @JSImport("@mui/material/Chip", "chipClasses")
  @js.native
  val chipClasses: ChipClasses = js.native
  
  inline def getChipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getChipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
