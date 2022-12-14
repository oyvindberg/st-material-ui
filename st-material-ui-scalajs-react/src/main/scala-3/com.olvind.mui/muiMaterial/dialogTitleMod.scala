package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDialogTitleTypeMapT
import com.olvind.mui.muiMaterial.dialogTitleDialogTitleClassesMod.DialogTitleClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogTitleMod {
  
  @JSImport("@mui/material/DialogTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Dialog](https://mui.com/material-ui/react-dialog/)
    *
    * API:
    *
    * - [DialogTitle API](https://mui.com/material-ui/api/dialog-title/)
    */
  @JSImport("@mui/material/DialogTitle", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDialogTitleTypeMapT, Element] = js.native
  
  @JSImport("@mui/material/DialogTitle", "dialogTitleClasses")
  @js.native
  val dialogTitleClasses: DialogTitleClasses = js.native
  
  inline def getDialogTitleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogTitleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
