package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.dialogActionsClassesMod.DialogActionsClasses
import com.olvind.mui.muiMaterial.dialogActionsDialogActionsMod.DialogActionsProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogActionsMod {
  
  @JSImport("@mui/material/DialogActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: DialogActionsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/DialogActions", "dialogActionsClasses")
  @js.native
  val dialogActionsClasses: DialogActionsClasses = js.native
  
  inline def getDialogActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
