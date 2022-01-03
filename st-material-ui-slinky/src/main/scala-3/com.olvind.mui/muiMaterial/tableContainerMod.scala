package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableContainerTypeM
import com.olvind.mui.muiMaterial.tableContainerClassesMod.TableContainerClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContainerMod {
  
  @JSImport("@mui/material/TableContainer", JSImport.Namespace)
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
    * - [TableContainer API](https://mui.com/api/table-container/)
    */
  @JSImport("@mui/material/TableContainer", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableContainerTypeM, Element] = js.native
  
  inline def getTableContainerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableContainerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TableContainer", "tableContainerClasses")
  @js.native
  val tableContainerClasses: TableContainerClasses = js.native
}
