package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsSheetTypeMapdiv
import com.olvind.mui.muiJoy.sheetSheetClassesMod.SheetClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sheetMod {
  
  @JSImport("@mui/joy/Sheet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Sheet](https://mui.com/joy-ui/react-sheet/)
    *
    * API:
    *
    * - [Sheet API](https://mui.com/joy-ui/api/sheet/)
    */
  @JSImport("@mui/joy/Sheet", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSheetTypeMapdiv, Element | Null] = js.native
  
  inline def getSheetUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSheetUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Sheet", "sheetClasses")
  @js.native
  val sheetClasses: SheetClasses = js.native
}
