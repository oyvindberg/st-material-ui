package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypActive
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTabl
import com.olvind.mui.muiMaterial.anon.`34`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSortLabelTableSortLabelMod extends Shortcut {
  
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
  @JSImport("@mui/material/TableSortLabel/TableSortLabel", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTabl | DefaultComponentPropsExtendButtonBaseTypActive, 
    ReactElement | Null
  ] = js.native
  
  type TableSortLabelProps[D /* <: ReactElement */, P] = OverrideProps[TableSortLabelTypeMap[P, D], D]
  
  type TableSortLabelTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[`34`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTabl | DefaultComponentPropsExtendButtonBaseTypActive, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `tableSortLabelTableSortLabelMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTabl | DefaultComponentPropsExtendButtonBaseTypActive, 
    ReactElement | Null
  ] = default
}
