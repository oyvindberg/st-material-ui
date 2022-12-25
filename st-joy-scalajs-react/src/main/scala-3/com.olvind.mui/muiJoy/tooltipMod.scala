package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTooltipTypeMapdiv
import com.olvind.mui.muiJoy.tooltipTooltipClassesMod.TooltipClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@mui/joy/Tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Tooltip", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTooltipTypeMapdiv, Element | Null] = js.native
  
  inline def getTooltipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Tooltip", "tooltipClasses")
  @js.native
  val tooltipClasses: TooltipClasses = js.native
}
