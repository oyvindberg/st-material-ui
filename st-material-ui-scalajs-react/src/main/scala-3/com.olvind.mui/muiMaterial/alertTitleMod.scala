package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.alertTitleAlertTitleMod.AlertTitleProps
import com.olvind.mui.muiMaterial.alertTitleClassesMod.AlertTitleClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertTitleMod {
  
  @JSImport("@mui/material/AlertTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AlertTitleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/AlertTitle", "alertTitleClasses")
  @js.native
  val alertTitleClasses: AlertTitleClasses = js.native
  
  inline def getAlertTitleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertTitleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
