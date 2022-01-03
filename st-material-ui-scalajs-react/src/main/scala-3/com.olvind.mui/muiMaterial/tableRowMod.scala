package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableRowTypeMaptr
import com.olvind.mui.muiMaterial.tableRowClassesMod.TableRowClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowMod {
  
  @JSImport("@mui/material/TableRow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Will automatically set dynamic row height
    * based on the material table element parent (head, body, etc).
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableRow API](https://mui.com/api/table-row/)
    */
  @JSImport("@mui/material/TableRow", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableRowTypeMaptr, Element] = js.native
  
  inline def getTableRowUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableRowUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TableRow", "tableRowClasses")
  @js.native
  val tableRowClasses: TableRowClasses = js.native
}
