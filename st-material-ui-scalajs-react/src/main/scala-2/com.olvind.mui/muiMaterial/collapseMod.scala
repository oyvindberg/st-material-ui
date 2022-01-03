package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.collapseClassesMod.CollapseClasses
import com.olvind.mui.muiMaterial.collapseCollapseMod.CollapseProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod {
  
  @JSImport("@mui/material/Collapse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: CollapseProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/Collapse", "collapseClasses")
  @js.native
  val collapseClasses: CollapseClasses = js.native
  
  @scala.inline
  def getCollapseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCollapseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
