package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipClassesMod {
  
  @JSImport("@mui/material/Tooltip/tooltipClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Tooltip/tooltipClasses", JSImport.Default)
  @js.native
  val default: TooltipClasses = js.native
  
  inline def getTooltipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TooltipClassKey = "popper" | "popperInteractive" | "popperArrow" | "popperClose" | "tooltip" | "tooltipArrow" | "arrow" | "touch" | "tooltipPlacementLeft" | "tooltipPlacementRight" | "tooltipPlacementTop" | "tooltipPlacementBottom"
  
  trait TooltipClasses extends StObject {
    
    /** Styles applied to the arrow element. */
    var arrow: String
    
    /** Styles applied to the Popper component. */
    var popper: String
    
    /** Styles applied to the Popper component if `arrow={true}`. */
    var popperArrow: String
    
    /** Styles applied to the Popper component unless the tooltip is open. */
    var popperClose: String
    
    /** Styles applied to the Popper component unless `disableInteractive={true}`. */
    var popperInteractive: String
    
    /** Styles applied to the tooltip (label wrapper) element. */
    var tooltip: String
    
    /** Styles applied to the tooltip (label wrapper) element if `arrow={true}`. */
    var tooltipArrow: String
    
    /** Styles applied to the tooltip (label wrapper) element if `placement` contains "bottom". */
    var tooltipPlacementBottom: String
    
    /** Styles applied to the tooltip (label wrapper) element if `placement` contains "left". */
    var tooltipPlacementLeft: String
    
    /** Styles applied to the tooltip (label wrapper) element if `placement` contains "right". */
    var tooltipPlacementRight: String
    
    /** Styles applied to the tooltip (label wrapper) element if `placement` contains "top". */
    var tooltipPlacementTop: String
    
    /** Styles applied to the tooltip (label wrapper) element if the tooltip is opened by touch. */
    var touch: String
  }
  object TooltipClasses {
    
    inline def apply(
      arrow: String,
      popper: String,
      popperArrow: String,
      popperClose: String,
      popperInteractive: String,
      tooltip: String,
      tooltipArrow: String,
      tooltipPlacementBottom: String,
      tooltipPlacementLeft: String,
      tooltipPlacementRight: String,
      tooltipPlacementTop: String,
      touch: String
    ): TooltipClasses = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], popperArrow = popperArrow.asInstanceOf[js.Any], popperClose = popperClose.asInstanceOf[js.Any], popperInteractive = popperInteractive.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipArrow = tooltipArrow.asInstanceOf[js.Any], tooltipPlacementBottom = tooltipPlacementBottom.asInstanceOf[js.Any], tooltipPlacementLeft = tooltipPlacementLeft.asInstanceOf[js.Any], tooltipPlacementRight = tooltipPlacementRight.asInstanceOf[js.Any], tooltipPlacementTop = tooltipPlacementTop.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipClasses]
    }
    
    extension [Self <: TooltipClasses](x: Self) {
      
      inline def setArrow(value: String): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setPopper(value: String): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setPopperArrow(value: String): Self = StObject.set(x, "popperArrow", value.asInstanceOf[js.Any])
      
      inline def setPopperClose(value: String): Self = StObject.set(x, "popperClose", value.asInstanceOf[js.Any])
      
      inline def setPopperInteractive(value: String): Self = StObject.set(x, "popperInteractive", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipArrow(value: String): Self = StObject.set(x, "tooltipArrow", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementBottom(value: String): Self = StObject.set(x, "tooltipPlacementBottom", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementLeft(value: String): Self = StObject.set(x, "tooltipPlacementLeft", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementRight(value: String): Self = StObject.set(x, "tooltipPlacementRight", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementTop(value: String): Self = StObject.set(x, "tooltipPlacementTop", value.asInstanceOf[js.Any])
      
      inline def setTouch(value: String): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    }
  }
}
