package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.alertAlertClassesMod.AlertClasses
import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAlertTypeMapdiv
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("@mui/joy/Alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Alert", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAlertTypeMapdiv, Element | Null] = js.native
  
  @JSImport("@mui/joy/Alert", "alertClasses")
  @js.native
  val alertClasses: AlertClasses = js.native
  
  inline def getAlertUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
