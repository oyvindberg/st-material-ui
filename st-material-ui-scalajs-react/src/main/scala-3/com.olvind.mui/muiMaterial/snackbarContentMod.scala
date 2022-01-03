package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.snackbarContentClassesMod.SnackbarContentClasses
import com.olvind.mui.muiMaterial.snackbarContentSnackbarContentMod.SnackbarContentProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarContentMod {
  
  @JSImport("@mui/material/SnackbarContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SnackbarContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getSnackbarContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnackbarContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/SnackbarContent", "snackbarContentClasses")
  @js.native
  val snackbarContentClasses: SnackbarContentClasses = js.native
}
