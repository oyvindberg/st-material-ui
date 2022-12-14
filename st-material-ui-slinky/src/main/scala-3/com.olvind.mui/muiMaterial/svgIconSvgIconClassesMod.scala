package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconSvgIconClassesMod {
  
  @JSImport("@mui/material/SvgIcon/svgIconClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/SvgIcon/svgIconClasses", JSImport.Default)
  @js.native
  val default: SvgIconClasses = js.native
  
  inline def getSvgIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSvgIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SvgIconClassKey = "root" | "colorPrimary" | "colorSecondary" | "colorAction" | "colorError" | "colorDisabled" | "fontSizeInherit" | "fontSizeSmall" | "fontSizeMedium" | "fontSizeLarge"
  
  trait SvgIconClasses extends StObject {
    
    /** Styles applied to the root element if `color="action"`. */
    var colorAction: String
    
    /** Styles applied to the root element if `color="disabled"`. */
    var colorDisabled: String
    
    /** Styles applied to the root element if `color="error"`. */
    var colorError: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String
    
    /** Styles applied to the root element if `fontSize="inherit"`. */
    var fontSizeInherit: String
    
    /** Styles applied to the root element if `fontSize="large"`. */
    var fontSizeLarge: String
    
    /** Styles applied to the root element if `fontSize="medium"`. */
    var fontSizeMedium: String
    
    /** Styles applied to the root element if `fontSize="small"`. */
    var fontSizeSmall: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object SvgIconClasses {
    
    inline def apply(
      colorAction: String,
      colorDisabled: String,
      colorError: String,
      colorPrimary: String,
      colorSecondary: String,
      fontSizeInherit: String,
      fontSizeLarge: String,
      fontSizeMedium: String,
      fontSizeSmall: String,
      root: String
    ): SvgIconClasses = {
      val __obj = js.Dynamic.literal(colorAction = colorAction.asInstanceOf[js.Any], colorDisabled = colorDisabled.asInstanceOf[js.Any], colorError = colorError.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], fontSizeInherit = fontSizeInherit.asInstanceOf[js.Any], fontSizeLarge = fontSizeLarge.asInstanceOf[js.Any], fontSizeMedium = fontSizeMedium.asInstanceOf[js.Any], fontSizeSmall = fontSizeSmall.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgIconClasses]
    }
    
    extension [Self <: SvgIconClasses](x: Self) {
      
      inline def setColorAction(value: String): Self = StObject.set(x, "colorAction", value.asInstanceOf[js.Any])
      
      inline def setColorDisabled(value: String): Self = StObject.set(x, "colorDisabled", value.asInstanceOf[js.Any])
      
      inline def setColorError(value: String): Self = StObject.set(x, "colorError", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setFontSizeInherit(value: String): Self = StObject.set(x, "fontSizeInherit", value.asInstanceOf[js.Any])
      
      inline def setFontSizeLarge(value: String): Self = StObject.set(x, "fontSizeLarge", value.asInstanceOf[js.Any])
      
      inline def setFontSizeMedium(value: String): Self = StObject.set(x, "fontSizeMedium", value.asInstanceOf[js.Any])
      
      inline def setFontSizeSmall(value: String): Self = StObject.set(x, "fontSizeSmall", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
