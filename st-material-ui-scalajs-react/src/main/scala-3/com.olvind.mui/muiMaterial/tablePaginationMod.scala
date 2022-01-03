package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTablePaginationType
import com.olvind.mui.muiMaterial.tablePaginationClassesMod.TablePaginationClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablePaginationMod {
  
  @JSImport("@mui/material/TablePagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A `TableCell` based component for placing inside `TableFooter` for pagination.
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TablePagination API](https://mui.com/api/table-pagination/)
    * - inherits [TableCell API](https://mui.com/api/table-cell/)
    */
  @JSImport("@mui/material/TablePagination", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTablePaginationType, Element] = js.native
  
  inline def getTablePaginationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTablePaginationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TablePagination", "tablePaginationClasses")
  @js.native
  val tablePaginationClasses: TablePaginationClasses = js.native
}
