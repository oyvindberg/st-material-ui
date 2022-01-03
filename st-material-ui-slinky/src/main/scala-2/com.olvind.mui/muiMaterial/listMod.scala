package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendListTypeMapLi
import com.olvind.mui.muiMaterial.listClassesMod.ListClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@mui/material/List", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    * - [Transfer List](https://mui.com/components/transfer-list/)
    *
    * API:
    *
    * - [List API](https://mui.com/api/list/)
    */
  @JSImport("@mui/material/List", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapLi, Element] = js.native
  
  @scala.inline
  def getListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/List", "listClasses")
  @js.native
  val listClasses: ListClasses = js.native
}
