package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioAspectRatioClassesMod {
  
  @JSImport("@mui/joy/AspectRatio/aspectRatioClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/AspectRatio/aspectRatioClasses", JSImport.Default)
  @js.native
  val default: AspectRatioClasses = js.native
  
  inline def getAspectRatioUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAspectRatioUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AspectRatioClassKey = "root" | "content" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid"
  
  trait AspectRatioClasses extends StObject {
    
    /** Styles applied to the content element if `color="danger"`. */
    var colorDanger: String
    
    /** Styles applied to the content element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the content element if `color="neutral"`. */
    var colorNeutral: String
    
    /** Styles applied to the content element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the content element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the content element if `color="warning"`. */
    var colorWarning: String
    
    /** Styles applied to the content element. */
    var content: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the content element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the content element if `variant="plain"`. */
    var variantPlain: String
    
    /** Styles applied to the content element if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the content element if `variant="solid"`. */
    var variantSolid: String
  }
  object AspectRatioClasses {
    
    inline def apply(
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      content: String,
      root: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): AspectRatioClasses = {
      val __obj = js.Dynamic.literal(colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AspectRatioClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AspectRatioClasses] (val x: Self) extends AnyVal {
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
