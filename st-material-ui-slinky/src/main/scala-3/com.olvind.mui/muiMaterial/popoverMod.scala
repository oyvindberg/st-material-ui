package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.popoverPopoverClassesMod.PopoverClasses
import com.olvind.mui.muiMaterial.popoverPopoverMod.PopoverProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalajs.dom.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("@mui/material/Popover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: PopoverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.annotation.targetName("getOffsetLeft_center_right_left")
  inline def getOffsetLeft(rect: DOMRect, horizontal: "center" | "right" | "left"): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetLeft")(rect.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getOffsetLeft(rect: DOMRect, horizontal: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetLeft")(rect.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.annotation.targetName("getOffsetTop_center_bottom_top")
  inline def getOffsetTop(rect: DOMRect, vertical: "center" | "bottom" | "top"): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetTop")(rect.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getOffsetTop(rect: DOMRect, vertical: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetTop")(rect.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPopoverUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Popover", "popoverClasses")
  @js.native
  val popoverClasses: PopoverClasses = js.native
}
