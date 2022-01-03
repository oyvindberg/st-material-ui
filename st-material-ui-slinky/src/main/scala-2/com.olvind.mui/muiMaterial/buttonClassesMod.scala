package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonClassesMod {
  
  @JSImport("@mui/material/Button/buttonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Button/buttonClasses", JSImport.Default)
  @js.native
  val default: ButtonClasses = js.native
  
  @scala.inline
  def getButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.text
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlined
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.contained
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.containedInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.containedPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.containedSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disableElevation
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusVisible
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textSizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textSizeMedium
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textSizeLarge
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedSizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedSizeMedium
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedSizeLarge
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.containedSizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.containedSizeMedium
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.containedSizeLarge
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeMedium
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeLarge
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fullWidth
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.startIcon
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.endIcon
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconSizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconSizeMedium
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconSizeLarge
  */
  trait ButtonClassKey extends StObject
  
  @js.native
  trait ButtonClasses extends StObject {
    
    /** Styles applied to the root element if `color="inherit"`. */
    var colorInherit: String = js.native
    
    /** Styles applied to the root element if `variant="contained"`. */
    var contained: String = js.native
    
    /** Styles applied to the root element if `variant="contained"` and `color="inherit"`. */
    var containedInherit: String = js.native
    
    /** Styles applied to the root element if `variant="contained"` and `color="primary"`. */
    var containedPrimary: String = js.native
    
    /** Styles applied to the root element if `variant="contained"` and `color="secondary"`. */
    var containedSecondary: String = js.native
    
    /** Styles applied to the root element if `size="large"` and `variant="contained"`. */
    var containedSizeLarge: String = js.native
    
    /** Styles applied to the root element if `size="small"` and `variant="contained"`. */
    var containedSizeMedium: String = js.native
    
    /** Styles applied to the root element if `size="small"` and `variant="contained"`. */
    var containedSizeSmall: String = js.native
    
    /** Styles applied to the root element if `disableElevation={true}`. */
    var disableElevation: String = js.native
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** Styles applied to the endIcon element if supplied. */
    var endIcon: String = js.native
    
    /** State class applied to the ButtonBase root element if the button is keyboard focused. */
    var focusVisible: String = js.native
    
    /** Styles applied to the root element if `fullWidth={true}`. */
    var fullWidth: String = js.native
    
    /** Styles applied to the icon element if supplied and `size="large"`. */
    var iconSizeLarge: String = js.native
    
    /** Styles applied to the icon element if supplied and `size="medium"`. */
    var iconSizeMedium: String = js.native
    
    /** Styles applied to the icon element if supplied and `size="small"`. */
    var iconSizeSmall: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"` and `color="inherit"`. */
    var outlinedInherit: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"` and `color="primary"`. */
    var outlinedPrimary: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"` and `color="secondary"`. */
    var outlinedSecondary: String = js.native
    
    /** Styles applied to the root element if `size="large"` and `variant="outlined"`. */
    var outlinedSizeLarge: String = js.native
    
    /** Styles applied to the root element if `size="medium"` and `variant="outlined"`. */
    var outlinedSizeMedium: String = js.native
    
    /** Styles applied to the root element if `size="small"` and `variant="outlined"`. */
    var outlinedSizeSmall: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `size="large"`. */
    var sizeLarge: String = js.native
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String = js.native
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String = js.native
    
    /** Styles applied to the startIcon element if supplied. */
    var startIcon: String = js.native
    
    /** Styles applied to the root element if `variant="text"`. */
    var text: String = js.native
    
    /** Styles applied to the root element if `variant="text"` and `color="inherit"`. */
    var textInherit: String = js.native
    
    /** Styles applied to the root element if `variant="text"` and `color="primary"`. */
    var textPrimary: String = js.native
    
    /** Styles applied to the root element if `variant="text"` and `color="secondary"`. */
    var textSecondary: String = js.native
    
    /** Styles applied to the root element if `size="large"` and `variant="text"`. */
    var textSizeLarge: String = js.native
    
    /** Styles applied to the root element if `size="medium"` and `variant="text"`. */
    var textSizeMedium: String = js.native
    
    /** Styles applied to the root element if `size="small"` and `variant="text"`. */
    var textSizeSmall: String = js.native
  }
  object ButtonClasses {
    
    @scala.inline
    def apply(
      colorInherit: String,
      contained: String,
      containedInherit: String,
      containedPrimary: String,
      containedSecondary: String,
      containedSizeLarge: String,
      containedSizeMedium: String,
      containedSizeSmall: String,
      disableElevation: String,
      disabled: String,
      endIcon: String,
      focusVisible: String,
      fullWidth: String,
      iconSizeLarge: String,
      iconSizeMedium: String,
      iconSizeSmall: String,
      outlined: String,
      outlinedInherit: String,
      outlinedPrimary: String,
      outlinedSecondary: String,
      outlinedSizeLarge: String,
      outlinedSizeMedium: String,
      outlinedSizeSmall: String,
      root: String,
      sizeLarge: String,
      sizeMedium: String,
      sizeSmall: String,
      startIcon: String,
      text: String,
      textInherit: String,
      textPrimary: String,
      textSecondary: String,
      textSizeLarge: String,
      textSizeMedium: String,
      textSizeSmall: String
    ): ButtonClasses = {
      val __obj = js.Dynamic.literal(colorInherit = colorInherit.asInstanceOf[js.Any], contained = contained.asInstanceOf[js.Any], containedInherit = containedInherit.asInstanceOf[js.Any], containedPrimary = containedPrimary.asInstanceOf[js.Any], containedSecondary = containedSecondary.asInstanceOf[js.Any], containedSizeLarge = containedSizeLarge.asInstanceOf[js.Any], containedSizeMedium = containedSizeMedium.asInstanceOf[js.Any], containedSizeSmall = containedSizeSmall.asInstanceOf[js.Any], disableElevation = disableElevation.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], endIcon = endIcon.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], iconSizeLarge = iconSizeLarge.asInstanceOf[js.Any], iconSizeMedium = iconSizeMedium.asInstanceOf[js.Any], iconSizeSmall = iconSizeSmall.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], outlinedInherit = outlinedInherit.asInstanceOf[js.Any], outlinedPrimary = outlinedPrimary.asInstanceOf[js.Any], outlinedSecondary = outlinedSecondary.asInstanceOf[js.Any], outlinedSizeLarge = outlinedSizeLarge.asInstanceOf[js.Any], outlinedSizeMedium = outlinedSizeMedium.asInstanceOf[js.Any], outlinedSizeSmall = outlinedSizeSmall.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLarge = sizeLarge.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], startIcon = startIcon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textInherit = textInherit.asInstanceOf[js.Any], textPrimary = textPrimary.asInstanceOf[js.Any], textSecondary = textSecondary.asInstanceOf[js.Any], textSizeLarge = textSizeLarge.asInstanceOf[js.Any], textSizeMedium = textSizeMedium.asInstanceOf[js.Any], textSizeSmall = textSizeSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonClasses]
    }
    
    @scala.inline
    implicit class ButtonClassesMutableBuilder[Self <: ButtonClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorInherit(value: String): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContained(value: String): Self = StObject.set(x, "contained", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainedInherit(value: String): Self = StObject.set(x, "containedInherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainedPrimary(value: String): Self = StObject.set(x, "containedPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainedSecondary(value: String): Self = StObject.set(x, "containedSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainedSizeLarge(value: String): Self = StObject.set(x, "containedSizeLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainedSizeMedium(value: String): Self = StObject.set(x, "containedSizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainedSizeSmall(value: String): Self = StObject.set(x, "containedSizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableElevation(value: String): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndIcon(value: String): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeLarge(value: String): Self = StObject.set(x, "iconSizeLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeMedium(value: String): Self = StObject.set(x, "iconSizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeSmall(value: String): Self = StObject.set(x, "iconSizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedInherit(value: String): Self = StObject.set(x, "outlinedInherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedPrimary(value: String): Self = StObject.set(x, "outlinedPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedSecondary(value: String): Self = StObject.set(x, "outlinedSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedSizeLarge(value: String): Self = StObject.set(x, "outlinedSizeLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedSizeMedium(value: String): Self = StObject.set(x, "outlinedSizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedSizeSmall(value: String): Self = StObject.set(x, "outlinedSizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLarge(value: String): Self = StObject.set(x, "sizeLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIcon(value: String): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextInherit(value: String): Self = StObject.set(x, "textInherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPrimary(value: String): Self = StObject.set(x, "textPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSecondary(value: String): Self = StObject.set(x, "textSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeLarge(value: String): Self = StObject.set(x, "textSizeLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeMedium(value: String): Self = StObject.set(x, "textSizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeSmall(value: String): Self = StObject.set(x, "textSizeSmall", value.asInstanceOf[js.Any])
    }
  }
}
