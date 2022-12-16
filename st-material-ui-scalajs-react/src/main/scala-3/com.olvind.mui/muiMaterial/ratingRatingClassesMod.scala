package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingRatingClassesMod {
  
  @JSImport("@mui/material/Rating/ratingClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Rating/ratingClasses", JSImport.Default)
  @js.native
  val default: RatingClasses = js.native
  
  inline def getRatingUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRatingUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type RatingClassKey = "root" | "sizeSmall" | "sizeMedium" | "sizeLarge" | "readOnly" | "disabled" | "focusVisible" | "visuallyHidden" | "label" | "labelEmptyValueActive" | "icon" | "iconEmpty" | "iconFilled" | "iconHover" | "iconFocus" | "iconActive" | "decimal"
  
  trait RatingClasses extends StObject {
    
    /** Styles applied to the icon wrapping elements when decimals are necessary. */
    var decimal: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root element if keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the icon wrapping elements. */
    var icon: String
    
    /** Styles applied to the icon wrapping elements when active. */
    var iconActive: String
    
    /** Styles applied to the icon wrapping elements when empty. */
    var iconEmpty: String
    
    /** Styles applied to the icon wrapping elements when filled. */
    var iconFilled: String
    
    /** Styles applied to the icon wrapping elements when focus. */
    var iconFocus: String
    
    /** Styles applied to the icon wrapping elements when hover. */
    var iconHover: String
    
    /** Styles applied to the label elements. */
    var label: String
    
    /** Styles applied to the label of the "no value" input when it is active. */
    var labelEmptyValueActive: String
    
    /** Styles applied to the root element if `readOnly={true}`. */
    var readOnly: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="large"`. */
    var sizeLarge: String
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String
    
    /** Visually hide an element. */
    var visuallyHidden: String
  }
  object RatingClasses {
    
    inline def apply(
      decimal: String,
      disabled: String,
      focusVisible: String,
      icon: String,
      iconActive: String,
      iconEmpty: String,
      iconFilled: String,
      iconFocus: String,
      iconHover: String,
      label: String,
      labelEmptyValueActive: String,
      readOnly: String,
      root: String,
      sizeLarge: String,
      sizeMedium: String,
      sizeSmall: String,
      visuallyHidden: String
    ): RatingClasses = {
      val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconActive = iconActive.asInstanceOf[js.Any], iconEmpty = iconEmpty.asInstanceOf[js.Any], iconFilled = iconFilled.asInstanceOf[js.Any], iconFocus = iconFocus.asInstanceOf[js.Any], iconHover = iconHover.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelEmptyValueActive = labelEmptyValueActive.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLarge = sizeLarge.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], visuallyHidden = visuallyHidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatingClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatingClasses] (val x: Self) extends AnyVal {
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconActive(value: String): Self = StObject.set(x, "iconActive", value.asInstanceOf[js.Any])
      
      inline def setIconEmpty(value: String): Self = StObject.set(x, "iconEmpty", value.asInstanceOf[js.Any])
      
      inline def setIconFilled(value: String): Self = StObject.set(x, "iconFilled", value.asInstanceOf[js.Any])
      
      inline def setIconFocus(value: String): Self = StObject.set(x, "iconFocus", value.asInstanceOf[js.Any])
      
      inline def setIconHover(value: String): Self = StObject.set(x, "iconHover", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelEmptyValueActive(value: String): Self = StObject.set(x, "labelEmptyValueActive", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: String): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLarge(value: String): Self = StObject.set(x, "sizeLarge", value.asInstanceOf[js.Any])
      
      inline def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      inline def setVisuallyHidden(value: String): Self = StObject.set(x, "visuallyHidden", value.asInstanceOf[js.Any])
    }
  }
}
