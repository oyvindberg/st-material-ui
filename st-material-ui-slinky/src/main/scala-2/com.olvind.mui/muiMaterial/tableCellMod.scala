package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.tableCellClassesMod.TableCellClasses
import com.olvind.mui.muiMaterial.tableCellTableCellMod.TableCellProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellMod {
  
  @JSImport("@mui/material/TableCell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: TableCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getTableCellUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableCellUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TableCell", "tableCellClasses")
  @js.native
  val tableCellClasses: TableCellClasses = js.native
}
