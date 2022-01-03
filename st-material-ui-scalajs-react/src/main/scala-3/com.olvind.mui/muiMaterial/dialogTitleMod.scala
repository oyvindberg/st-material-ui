package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.dialogTitleClassesMod.DialogTitleClasses
import com.olvind.mui.muiMaterial.dialogTitleDialogTitleMod.DialogTitleProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogTitleMod {
  
  @JSImport("@mui/material/DialogTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: DialogTitleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/DialogTitle", "dialogTitleClasses")
  @js.native
  val dialogTitleClasses: DialogTitleClasses = js.native
  
  inline def getDialogTitleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogTitleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
