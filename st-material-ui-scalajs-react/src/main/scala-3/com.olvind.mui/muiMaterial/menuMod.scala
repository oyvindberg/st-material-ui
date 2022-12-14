package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.menuMenuClassesMod.MenuClasses
import com.olvind.mui.muiMaterial.menuMenuMod.MenuProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("@mui/material/Menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getMenuUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Menu", "menuClasses")
  @js.native
  val menuClasses: MenuClasses = js.native
}
