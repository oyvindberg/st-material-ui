package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsListSubheaderTypeMa
import com.olvind.mui.muiJoy.listSubheaderListSubheaderClassesMod.ListSubheaderClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSubheaderMod {
  
  @JSImport("@mui/joy/ListSubheader", JSImport.Namespace)
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
    * - [ListSubheader API](https://mui.com/joy-ui/api/list-subheader/)
    */
  @JSImport("@mui/joy/ListSubheader", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListSubheaderTypeMa, Element | Null] = js.native
  
  inline def getListSubheaderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListSubheaderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/ListSubheader", "listSubheaderClasses")
  @js.native
  val listSubheaderClasses: ListSubheaderClasses = js.native
}
