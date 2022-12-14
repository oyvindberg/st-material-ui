package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableBodyTypeMaptbo
import com.olvind.mui.muiMaterial.tableBodyTableBodyClassesMod.TableBodyClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBodyMod {
  
  @JSImport("@mui/material/TableBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Table](https://mui.com/material-ui/react-table/)
    *
    * API:
    *
    * - [TableBody API](https://mui.com/material-ui/api/table-body/)
    */
  @JSImport("@mui/material/TableBody", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element] = js.native
  
  inline def getTableBodyUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableBodyUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TableBody", "tableBodyClasses")
  @js.native
  val tableBodyClasses: TableBodyClasses = js.native
}
