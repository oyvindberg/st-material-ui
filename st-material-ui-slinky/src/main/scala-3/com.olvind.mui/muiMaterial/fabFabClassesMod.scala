package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabFabClassesMod {
  
  @JSImport("@mui/material/Fab/fabClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Fab/fabClasses", JSImport.Default)
  @js.native
  val default: FabClasses = js.native
  
  inline def getFabUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFabUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type FabClassKey = "root" | "primary" | "secondary" | "extended" | "circular" | "focusVisible" | "disabled" | "colorInherit" | "sizeSmall" | "sizeMedium"
  
  trait FabClasses extends StObject {
    
    /** Styles applied to the root element if `variant="circular"`. */
    var circular: String
    
    /** Styles applied to the root element if `color="inherit"`. */
    var colorInherit: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the root element if `variant="extended"`. */
    var extended: String
    
    /** State class applied to the ButtonBase root element if the button is keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var primary: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `color="secondary"`. */
    var secondary: String
    
    /** Styles applied to the root element if `size="medium"``. */
    var sizeMedium: String
    
    /** Styles applied to the root element if `size="small"``. */
    var sizeSmall: String
  }
  object FabClasses {
    
    inline def apply(
      circular: String,
      colorInherit: String,
      disabled: String,
      extended: String,
      focusVisible: String,
      primary: String,
      root: String,
      secondary: String,
      sizeMedium: String,
      sizeSmall: String
    ): FabClasses = {
      val __obj = js.Dynamic.literal(circular = circular.asInstanceOf[js.Any], colorInherit = colorInherit.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], extended = extended.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[FabClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FabClasses] (val x: Self) extends AnyVal {
      
      inline def setCircular(value: String): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setColorInherit(value: String): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setExtended(value: String): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
    }
  }
}
