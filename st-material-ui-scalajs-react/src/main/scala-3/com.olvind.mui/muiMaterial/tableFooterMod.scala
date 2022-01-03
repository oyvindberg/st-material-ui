package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableFooterTypeMapt
import com.olvind.mui.muiMaterial.tableFooterClassesMod.TableFooterClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableFooterMod {
  
  @JSImport("@mui/material/TableFooter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableFooter API](https://mui.com/api/table-footer/)
    */
  @JSImport("@mui/material/TableFooter", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableFooterTypeMapt, Element] = js.native
  
  inline def getTableFooterUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableFooterUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TableFooter", "tableFooterClasses")
  @js.native
  val tableFooterClasses: TableFooterClasses = js.native
}
