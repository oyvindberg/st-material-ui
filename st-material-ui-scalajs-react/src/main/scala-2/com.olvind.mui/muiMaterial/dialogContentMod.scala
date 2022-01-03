package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.dialogContentClassesMod.DialogContentClasses
import com.olvind.mui.muiMaterial.dialogContentDialogContentMod.DialogContentProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentMod {
  
  @JSImport("@mui/material/DialogContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: DialogContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/DialogContent", "dialogContentClasses")
  @js.native
  val dialogContentClasses: DialogContentClasses = js.native
  
  @scala.inline
  def getDialogContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
