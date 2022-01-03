package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypActive
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTabl
import com.olvind.mui.muiMaterial.tableSortLabelClassesMod.TableSortLabelClasses
import japgolly.scalajs.react.facade.React.Element
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
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableSortLabel API](https://mui.com/api/table-sort-label/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/TableSortLabel", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTabl | DefaultComponentPropsExtendButtonBaseTypActive, 
    Element | Null
  ] = js.native
  
  inline def getTableSortLabelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableSortLabelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TableSortLabel", "tableSortLabelClasses")
  @js.native
  val tableSortLabelClasses: TableSortLabelClasses = js.native
}
