package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalDialogModalDialogClassesMod {
  
  @JSImport("@mui/joy/ModalDialog/modalDialogClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ModalDialog/modalDialogClasses", JSImport.Default)
  @js.native
  val default: ModalDialogClasses = js.native
  
  inline def getModalDialogUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModalDialogUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ModalDialogClassKey = "root" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid" | "sizeSm" | "sizeMd" | "sizeLg" | "layoutCenter" | "layoutFullscreen"
  
  trait ModalDialogClasses extends StObject {
    
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
    
    /** Styles applied to the root element if `layout="center"`. */
    var layoutCenter: String
    
    /** Styles applied to the root element if `layout="fullscreen"`. */
    var layoutFullscreen: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** Styles applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object ModalDialogClasses {
    
    inline def apply(
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      layoutCenter: String,
      layoutFullscreen: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): ModalDialogClasses = {
      val __obj = js.Dynamic.literal(colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], layoutCenter = layoutCenter.asInstanceOf[js.Any], layoutFullscreen = layoutFullscreen.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalDialogClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalDialogClasses] (val x: Self) extends AnyVal {
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setLayoutCenter(value: String): Self = StObject.set(x, "layoutCenter", value.asInstanceOf[js.Any])
      
      inline def setLayoutFullscreen(value: String): Self = StObject.set(x, "layoutFullscreen", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
