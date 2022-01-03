package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.tabScrollButtonClassesMod.TabScrollButtonClasses
import com.olvind.mui.muiMaterial.tabScrollButtonTabScrollButtonMod.TabScrollButtonProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabScrollButtonMod {
  
  @JSImport("@mui/material/TabScrollButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TabScrollButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getTabScrollButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabScrollButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/TabScrollButton", "tabScrollButtonClasses")
  @js.native
  val tabScrollButtonClasses: TabScrollButtonClasses = js.native
}
