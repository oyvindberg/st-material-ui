package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipClassesMod {
  
  @JSImport("@mui/joy/Tooltip/tooltipClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Tooltip/tooltipClasses", JSImport.Default)
  @js.native
  val default: TooltipClasses = js.native
  
  inline def getTooltipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TooltipClassKey = "root" | "tooltipArrow" | "arrow" | "touch" | "placementLeft" | "placementRight" | "placementTop" | "placementBottom" | "colorPrimary" | "colorDanger" | "colorInfo" | "colorNeutral" | "colorSuccess" | "colorWarning" | "sizeSm" | "sizeMd" | "sizeLg" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid"
  
  trait TooltipClasses extends StObject {
    
    /** Styles applied to the arrow element. */
    var arrow: String
    
    /** Styles applied to the root element if `color="danger"`. */
    var colorDanger: String
    
    /** Styles applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the root element if `color="neutral"`. */
    var colorNeutral: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** Styles applied to the root element if `placement` contains "bottom". */
    var placementBottom: String
    
    /** Styles applied to the root element if `placement` contains "left". */
    var placementLeft: String
    
    /** Styles applied to the root element if `placement` contains "right". */
    var placementRight: String
    
    /** Styles applied to the root element if `placement` contains "top". */
    var placementTop: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Styles applied to the root element if `arrow={true}`. */
    var tooltipArrow: String
    
    /** Styles applied to the root element if the tooltip is opened by touch. */
    var touch: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** Styles applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object TooltipClasses {
    
    inline def apply(
      arrow: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      placementBottom: String,
      placementLeft: String,
      placementRight: String,
      placementTop: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      tooltipArrow: String,
      touch: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): TooltipClasses = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], placementBottom = placementBottom.asInstanceOf[js.Any], placementLeft = placementLeft.asInstanceOf[js.Any], placementRight = placementRight.asInstanceOf[js.Any], placementTop = placementTop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], tooltipArrow = tooltipArrow.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipClasses] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: String): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setPlacementBottom(value: String): Self = StObject.set(x, "placementBottom", value.asInstanceOf[js.Any])
      
      inline def setPlacementLeft(value: String): Self = StObject.set(x, "placementLeft", value.asInstanceOf[js.Any])
      
      inline def setPlacementRight(value: String): Self = StObject.set(x, "placementRight", value.asInstanceOf[js.Any])
      
      inline def setPlacementTop(value: String): Self = StObject.set(x, "placementTop", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
      
      inline def setTooltipArrow(value: String): Self = StObject.set(x, "tooltipArrow", value.asInstanceOf[js.Any])
      
      inline def setTouch(value: String): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
