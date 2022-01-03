package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.drawerClassesMod.DrawerClasses
import com.olvind.mui.muiMaterial.drawerDrawerMod.DrawerProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod {
  
  @JSImport("@mui/material/Drawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: DrawerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/Drawer", "drawerClasses")
  @js.native
  val drawerClasses: DrawerClasses = js.native
  
  @scala.inline
  def getDrawerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDrawerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
