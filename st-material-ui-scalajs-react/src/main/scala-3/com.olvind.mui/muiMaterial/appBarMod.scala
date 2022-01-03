package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsAppBarTypeMapheader
import com.olvind.mui.muiMaterial.appBarClassesMod.AppBarClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarMod {
  
  @JSImport("@mui/material/AppBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [App Bar](https://mui.com/components/app-bar/)
    *
    * API:
    *
    * - [AppBar API](https://mui.com/api/app-bar/)
    * - inherits [Paper API](https://mui.com/api/paper/)
    */
  @JSImport("@mui/material/AppBar", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAppBarTypeMapheader, Element] = js.native
  
  @JSImport("@mui/material/AppBar", "appBarClasses")
  @js.native
  val appBarClasses: AppBarClasses = js.native
  
  inline def getAppBarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppBarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
