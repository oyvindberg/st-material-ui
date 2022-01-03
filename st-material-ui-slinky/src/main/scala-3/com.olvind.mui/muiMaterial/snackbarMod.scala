package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.snackbarClassesMod.SnackbarClasses
import com.olvind.mui.muiMaterial.snackbarSnackbarMod.SnackbarProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarMod {
  
  @JSImport("@mui/material/Snackbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SnackbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getSnackbarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnackbarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Snackbar", "snackbarClasses")
  @js.native
  val snackbarClasses: SnackbarClasses = js.native
}
