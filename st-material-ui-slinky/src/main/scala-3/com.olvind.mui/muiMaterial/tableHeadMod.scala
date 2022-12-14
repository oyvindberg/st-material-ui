package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableHeadTypeMapthe
import com.olvind.mui.muiMaterial.tableHeadTableHeadClassesMod.TableHeadClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeadMod {
  
  @JSImport("@mui/material/TableHead", JSImport.Namespace)
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
    * - [TableHead API](https://mui.com/material-ui/api/table-head/)
    */
  @JSImport("@mui/material/TableHead", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableHeadTypeMapthe, Element] = js.native
  
  inline def getTableHeadUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableHeadUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TableHead", "tableHeadClasses")
  @js.native
  val tableHeadClasses: TableHeadClasses = js.native
}
