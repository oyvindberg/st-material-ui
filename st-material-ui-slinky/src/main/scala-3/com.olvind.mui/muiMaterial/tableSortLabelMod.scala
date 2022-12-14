package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypActive
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTabl
import com.olvind.mui.muiMaterial.tableSortLabelTableSortLabelClassesMod.TableSortLabelClasses
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSortLabelMod {
  
  @JSImport("@mui/material/TableSortLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A button based label for placing inside `TableCell` for column sorting.
    *
    * Demos:
    *
    * - [Table](https://mui.com/material-ui/react-table/)
    *
    * API:
    *
    * - [TableSortLabel API](https://mui.com/material-ui/api/table-sort-label/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/TableSortLabel", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTabl | DefaultComponentPropsExtendButtonBaseTypActive, 
    ReactElement | Null
  ] = js.native
  
  inline def getTableSortLabelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableSortLabelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TableSortLabel", "tableSortLabelClasses")
  @js.native
  val tableSortLabelClasses: TableSortLabelClasses = js.native
}
