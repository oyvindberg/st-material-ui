package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDialogContentTextTy
import com.olvind.mui.muiMaterial.dialogContentTextClassesMod.DialogContentTextClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentTextMod {
  
  @JSImport("@mui/material/DialogContentText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Dialogs](https://mui.com/components/dialogs/)
    *
    * API:
    *
    * - [DialogContentText API](https://mui.com/api/dialog-content-text/)
    * - inherits [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@mui/material/DialogContentText", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDialogContentTextTy, Element] = js.native
  
  @JSImport("@mui/material/DialogContentText", "dialogContentTextClasses")
  @js.native
  val dialogContentTextClasses: DialogContentTextClasses = js.native
  
  inline def getDialogContentTextUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogContentTextUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
