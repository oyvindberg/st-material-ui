package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.tooltipTooltipClassesMod.TooltipClasses
import com.olvind.mui.muiMaterial.tooltipTooltipMod.TooltipProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@mui/material/Tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getTooltipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Tooltip", "tooltipClasses")
  @js.native
  val tooltipClasses: TooltipClasses = js.native
}
