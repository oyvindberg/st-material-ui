package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonClassesMod {
  
  @JSImport("@mui/material/ToggleButton/toggleButtonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ToggleButton/toggleButtonClasses", JSImport.Default)
  @js.native
  val default: ToggleButtonClasses = js.native
  
  @scala.inline
  def getToggleButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToggleButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.selected
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.standard
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.primary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.secondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeMedium
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeLarge
  */
  trait ToggleButtonClassKey extends StObject
  
  @js.native
  trait ToggleButtonClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** State class applied to the root element if `color="primary"`. */
    var primary: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** State class applied to the root element if `color="secondary"`. */
    var secondary: String = js.native
    
    /** State class applied to the root element if `selected={true}`. */
    var selected: String = js.native
    
    /** Styles applied to the root element if `size="large"`. */
    var sizeLarge: String = js.native
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String = js.native
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String = js.native
    
    /** State class applied to the root element if `color="standard"`. */
    var standard: String = js.native
  }
  object ToggleButtonClasses {
    
    @scala.inline
    def apply(
      disabled: String,
      primary: String,
      root: String,
      secondary: String,
      selected: String,
      sizeLarge: String,
      sizeMedium: String,
      sizeSmall: String,
      standard: String
    ): ToggleButtonClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], sizeLarge = sizeLarge.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleButtonClasses]
    }
    
    @scala.inline
    implicit class ToggleButtonClassesMutableBuilder[Self <: ToggleButtonClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLarge(value: String): Self = StObject.set(x, "sizeLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
