package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsToolbarTypeMapdiv
import com.olvind.mui.muiMaterial.toolbarClassesMod.ToolbarClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("@mui/material/Toolbar", JSImport.Namespace)
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
    * - [Toolbar API](https://mui.com/api/toolbar/)
    */
  @JSImport("@mui/material/Toolbar", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsToolbarTypeMapdiv, Element] = js.native
  
  @scala.inline
  def getToolbarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToolbarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Toolbar", "toolbarClasses")
  @js.native
  val toolbarClasses: ToolbarClasses = js.native
}
