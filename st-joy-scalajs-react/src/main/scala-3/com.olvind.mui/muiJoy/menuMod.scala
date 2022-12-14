package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsMenuTypeMapul
import com.olvind.mui.muiJoy.menuMenuClassesMod.MenuClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("@mui/joy/Menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Menu](https://mui.com/joy-ui/react-menu/)
    *
    * API:
    *
    * - [Menu API](https://mui.com/joy-ui/api/menu/)
    * - inherits [PopperUnstyled API](https://mui.com/base/api/popper-unstyled/)
    */
  @JSImport("@mui/joy/Menu", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsMenuTypeMapul, Element | Null] = js.native
  
  inline def getMenuUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Menu", "menuClasses")
  @js.native
  val menuClasses: MenuClasses = js.native
}
