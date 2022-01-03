package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.paginationClassesMod.PaginationClasses
import com.olvind.mui.muiMaterial.paginationPaginationMod.PaginationProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("@mui/material/Pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: PaginationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getPaginationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Pagination", "paginationClasses")
  @js.native
  val paginationClasses: PaginationClasses = js.native
}
