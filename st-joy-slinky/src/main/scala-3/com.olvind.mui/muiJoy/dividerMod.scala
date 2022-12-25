package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsDividerTypeMaphr
import com.olvind.mui.muiJoy.dividerDividerClassesMod.DividerClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod {
  
  @JSImport("@mui/joy/Divider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Divider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element | Null] = js.native
  
  @JSImport("@mui/joy/Divider", "dividerClasses")
  @js.native
  val dividerClasses: DividerClasses = js.native
  
  inline def getDividerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDividerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
