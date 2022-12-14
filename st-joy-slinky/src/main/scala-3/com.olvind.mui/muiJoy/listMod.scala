package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsListTypeMapul
import com.olvind.mui.muiJoy.listListClassesMod.ListClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@mui/joy/List", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/joy-ui/react-list/)
    *
    * API:
    *
    * - [List API](https://mui.com/joy-ui/api/list/)
    */
  @JSImport("@mui/joy/List", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListTypeMapul, Element | Null] = js.native
  
  inline def getListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/List", "listClasses")
  @js.native
  val listClasses: ListClasses = js.native
}
