package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.popoverClassesMod.PopoverClasses
import com.olvind.mui.muiMaterial.popoverPopoverMod.PopoverProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("@mui/material/Popover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: PopoverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getPopoverUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Popover", "popoverClasses")
  @js.native
  val popoverClasses: PopoverClasses = js.native
}
