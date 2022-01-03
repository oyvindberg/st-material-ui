package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.alertAlertMod.AlertProps
import com.olvind.mui.muiMaterial.alertClassesMod.AlertClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("@mui/material/Alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: AlertProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/Alert", "alertClasses")
  @js.native
  val alertClasses: AlertClasses = js.native
  
  @scala.inline
  def getAlertUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
