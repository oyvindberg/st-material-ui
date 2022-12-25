package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkLinkClassesMod {
  
  @JSImport("@mui/joy/Link/linkClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Link/linkClasses", JSImport.Default)
  @js.native
  val default: LinkClasses = js.native
  
  inline def getLinkUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type LinkClassKey = "root" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "disabled" | "focusVisible" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid" | "underlineNone" | "underlineHover" | "underlineAlways" | "h1" | "h2" | "h3" | "h4" | "h5" | "h6" | "body1" | "body2" | "body3" | "startDecorator" | "endDecorator"
  
  trait LinkClasses extends StObject {
    
    /** Styles applied to the root element if `level="body1"`. */
    var body1: String
    
    /** Styles applied to the root element if `level="body2"`. */
    var body2: String
    
    /** Styles applied to the root element if `level="body3"`. */
    var body3: String
    
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
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the endDecorator element */
    var endDecorator: String
    
    /** State class applied to the root element if the link is keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the root element if `level="h1"`. */
    var h1: String
    
    /** Styles applied to the root element if `level="h2"`. */
    var h2: String
    
    /** Styles applied to the root element if `level="h3"`. */
    var h3: String
    
    /** Styles applied to the root element if `level="h4"`. */
    var h4: String
    
    /** Styles applied to the root element if `level="h5"`. */
    var h5: String
    
    /** Styles applied to the root element if `level="h6"`. */
    var h6: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the startDecorator element */
    var startDecorator: String
    
    /** Styles applied to the root element if `underline="always"`. */
    var underlineAlways: String
    
    /** Styles applied to the root element if `underline="hover"`. */
    var underlineHover: String
    
    /** Styles applied to the root element if `underline="none"`. */
    var underlineNone: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** Styles applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object LinkClasses {
    
    inline def apply(
      body1: String,
      body2: String,
      body3: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      endDecorator: String,
      focusVisible: String,
      h1: String,
      h2: String,
      h3: String,
      h4: String,
      h5: String,
      h6: String,
      root: String,
      startDecorator: String,
      underlineAlways: String,
      underlineHover: String,
      underlineNone: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): LinkClasses = {
      val __obj = js.Dynamic.literal(body1 = body1.asInstanceOf[js.Any], body2 = body2.asInstanceOf[js.Any], body3 = body3.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any], underlineAlways = underlineAlways.asInstanceOf[js.Any], underlineHover = underlineHover.asInstanceOf[js.Any], underlineNone = underlineNone.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkClasses] (val x: Self) extends AnyVal {
      
      inline def setBody1(value: String): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      inline def setBody2(value: String): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      inline def setBody3(value: String): Self = StObject.set(x, "body3", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEndDecorator(value: String): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setH1(value: String): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH2(value: String): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH3(value: String): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH4(value: String): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH5(value: String): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH6(value: String): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: String): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
      
      inline def setUnderlineAlways(value: String): Self = StObject.set(x, "underlineAlways", value.asInstanceOf[js.Any])
      
      inline def setUnderlineHover(value: String): Self = StObject.set(x, "underlineHover", value.asInstanceOf[js.Any])
      
      inline def setUnderlineNone(value: String): Self = StObject.set(x, "underlineNone", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
