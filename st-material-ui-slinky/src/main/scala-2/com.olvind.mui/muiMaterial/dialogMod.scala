package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.dialogClassesMod.DialogClasses
import com.olvind.mui.muiMaterial.dialogDialogMod.DialogProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("@mui/material/Dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: DialogProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/Dialog", "dialogClasses")
  @js.native
  val dialogClasses: DialogClasses = js.native
  
  @scala.inline
  def getDialogUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
