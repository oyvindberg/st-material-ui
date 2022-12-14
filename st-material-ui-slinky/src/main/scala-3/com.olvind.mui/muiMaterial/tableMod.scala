package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableTypeMaptable
import com.olvind.mui.muiMaterial.tableTableClassesMod.TableClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("@mui/material/Table", JSImport.Namespace)
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
    * - [Table API](https://mui.com/material-ui/api/table/)
    */
  @JSImport("@mui/material/Table", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element] = js.native
  
  inline def getTableUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Table", "tableClasses")
  @js.native
  val tableClasses: TableClasses = js.native
}
