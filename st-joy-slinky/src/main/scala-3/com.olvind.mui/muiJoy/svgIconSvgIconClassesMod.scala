package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconSvgIconClassesMod {
  
  @JSImport("@mui/joy/SvgIcon/svgIconClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/SvgIcon/svgIconClasses", JSImport.Default)
  @js.native
  val default: SvgIconClasses = js.native
  
  inline def getSvgIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSvgIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SvgIconClassKey = "root" | "colorInherit" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "fontSizeInherit" | "fontSizeXs" | "fontSizeSm" | "fontSizeMd" | "fontSizeLg" | "fontSizeXl" | "fontSizeXl2" | "fontSizeXl3" | "fontSizeXl4" | "fontSizeXl5" | "fontSizeXl6"
  
  trait SvgIconClasses extends StObject {
    
    /** Styles applied to the root element if `color="danger"`. */
    var colorDanger: String
    
    /** Styles applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the root element if `color="inherit"`. */
    var colorInherit: String
    
    /** Styles applied to the root element if `color="neutral"`. */
    var colorNeutral: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** Styles applied to the root element if `fontSize="inherit"`. */
    var fontSizeInherit: String
    
    /** Styles applied to the root element if `fontSize="lg"`. */
    var fontSizeLg: String
    
    /** Styles applied to the root element if `fontSize="md"`. */
    var fontSizeMd: String
    
    /** Styles applied to the root element if `fontSize="sm"`. */
    var fontSizeSm: String
    
    /** Styles applied to the root element if `fontSize="xl"`. */
    var fontSizeXl: String
    
    /** Styles applied to the root element if `fontSize="xl2"`. */
    var fontSizeXl2: String
    
    /** Styles applied to the root element if `fontSize="xl3"`. */
    var fontSizeXl3: String
    
    /** Styles applied to the root element if `fontSize="xl4"`. */
    var fontSizeXl4: String
    
    /** Styles applied to the root element if `fontSize="xl5"`. */
    var fontSizeXl5: String
    
    /** Styles applied to the root element if `fontSize="xl6"`. */
    var fontSizeXl6: String
    
    /** Styles applied to the root element if `fontSize="xs"`. */
    var fontSizeXs: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object SvgIconClasses {
    
    inline def apply(
      colorDanger: String,
      colorInfo: String,
      colorInherit: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      fontSizeInherit: String,
      fontSizeLg: String,
      fontSizeMd: String,
      fontSizeSm: String,
      fontSizeXl: String,
      fontSizeXl2: String,
      fontSizeXl3: String,
      fontSizeXl4: String,
      fontSizeXl5: String,
      fontSizeXl6: String,
      fontSizeXs: String,
      root: String
    ): SvgIconClasses = {
      val __obj = js.Dynamic.literal(colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorInherit = colorInherit.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], fontSizeInherit = fontSizeInherit.asInstanceOf[js.Any], fontSizeLg = fontSizeLg.asInstanceOf[js.Any], fontSizeMd = fontSizeMd.asInstanceOf[js.Any], fontSizeSm = fontSizeSm.asInstanceOf[js.Any], fontSizeXl = fontSizeXl.asInstanceOf[js.Any], fontSizeXl2 = fontSizeXl2.asInstanceOf[js.Any], fontSizeXl3 = fontSizeXl3.asInstanceOf[js.Any], fontSizeXl4 = fontSizeXl4.asInstanceOf[js.Any], fontSizeXl5 = fontSizeXl5.asInstanceOf[js.Any], fontSizeXl6 = fontSizeXl6.asInstanceOf[js.Any], fontSizeXs = fontSizeXs.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgIconClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SvgIconClasses] (val x: Self) extends AnyVal {
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorInherit(value: String): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setFontSizeInherit(value: String): Self = StObject.set(x, "fontSizeInherit", value.asInstanceOf[js.Any])
      
      inline def setFontSizeLg(value: String): Self = StObject.set(x, "fontSizeLg", value.asInstanceOf[js.Any])
      
      inline def setFontSizeMd(value: String): Self = StObject.set(x, "fontSizeMd", value.asInstanceOf[js.Any])
      
      inline def setFontSizeSm(value: String): Self = StObject.set(x, "fontSizeSm", value.asInstanceOf[js.Any])
      
      inline def setFontSizeXl(value: String): Self = StObject.set(x, "fontSizeXl", value.asInstanceOf[js.Any])
      
      inline def setFontSizeXl2(value: String): Self = StObject.set(x, "fontSizeXl2", value.asInstanceOf[js.Any])
      
      inline def setFontSizeXl3(value: String): Self = StObject.set(x, "fontSizeXl3", value.asInstanceOf[js.Any])
      
      inline def setFontSizeXl4(value: String): Self = StObject.set(x, "fontSizeXl4", value.asInstanceOf[js.Any])
      
      inline def setFontSizeXl5(value: String): Self = StObject.set(x, "fontSizeXl5", value.asInstanceOf[js.Any])
      
      inline def setFontSizeXl6(value: String): Self = StObject.set(x, "fontSizeXl6", value.asInstanceOf[js.Any])
      
      inline def setFontSizeXs(value: String): Self = StObject.set(x, "fontSizeXs", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
