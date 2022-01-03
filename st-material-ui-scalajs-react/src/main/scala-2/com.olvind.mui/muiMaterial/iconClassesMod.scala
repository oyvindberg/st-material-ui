package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconClassesMod {
  
  @JSImport("@mui/material/Icon/iconClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Icon/iconClasses", JSImport.Default)
  @js.native
  val default: IconClasses = js.native
  
  @scala.inline
  def getIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorAction
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorError
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorDisabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fontSizeInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fontSizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fontSizeLarge
  */
  trait IconClassKey extends StObject
  
  @js.native
  trait IconClasses extends StObject {
    
    /** Styles applied to the root element if `color="action"`. */
    var colorAction: String = js.native
    
    /** Styles applied to the root element if `color="disabled"`. */
    var colorDisabled: String = js.native
    
    /** Styles applied to the root element if `color="error"`. */
    var colorError: String = js.native
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String = js.native
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String = js.native
    
    /** Styles applied to the root element if `fontSize="inherit"`. */
    var fontSizeInherit: String = js.native
    
    /** Styles applied to the root element if `fontSize="large"`. */
    var fontSizeLarge: String = js.native
    
    /** Styles applied to the root element if `fontSize="small"`. */
    var fontSizeSmall: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object IconClasses {
    
    @scala.inline
    def apply(
      colorAction: String,
      colorDisabled: String,
      colorError: String,
      colorPrimary: String,
      colorSecondary: String,
      fontSizeInherit: String,
      fontSizeLarge: String,
      fontSizeSmall: String,
      root: String
    ): IconClasses = {
      val __obj = js.Dynamic.literal(colorAction = colorAction.asInstanceOf[js.Any], colorDisabled = colorDisabled.asInstanceOf[js.Any], colorError = colorError.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], fontSizeInherit = fontSizeInherit.asInstanceOf[js.Any], fontSizeLarge = fontSizeLarge.asInstanceOf[js.Any], fontSizeSmall = fontSizeSmall.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconClasses]
    }
    
    @scala.inline
    implicit class IconClassesMutableBuilder[Self <: IconClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorAction(value: String): Self = StObject.set(x, "colorAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorDisabled(value: String): Self = StObject.set(x, "colorDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorError(value: String): Self = StObject.set(x, "colorError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeInherit(value: String): Self = StObject.set(x, "fontSizeInherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeLarge(value: String): Self = StObject.set(x, "fontSizeLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeSmall(value: String): Self = StObject.set(x, "fontSizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
