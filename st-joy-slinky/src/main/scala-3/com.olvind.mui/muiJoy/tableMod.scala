package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTableTypeMaptable
import com.olvind.mui.muiJoy.tableTableClassesMod.TableClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("@mui/joy/Table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Table](https://mui.com/joy-ui/react-table/)
    *
    * API:
    *
    * - [Table API](https://mui.com/joy-ui/api/table/)
    */
  @JSImport("@mui/joy/Table", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element | Null] = js.native
  
  inline def getTableUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Table", "tableClasses")
  @js.native
  val tableClasses: TableClasses = js.native
}
