package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsPaginationItemTypeM
import com.olvind.mui.muiMaterial.paginationItemPaginationItemClassesMod.PaginationItemClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemMod {
  
  @JSImport("@mui/material/PaginationItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://mui.com/material-ui/react-pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://mui.com/material-ui/api/pagination-item/)
    */
  @JSImport("@mui/material/PaginationItem", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsPaginationItemTypeM, Element] = js.native
  
  inline def getPaginationItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/PaginationItem", "paginationItemClasses")
  @js.native
  val paginationItemClasses: PaginationItemClasses = js.native
}
