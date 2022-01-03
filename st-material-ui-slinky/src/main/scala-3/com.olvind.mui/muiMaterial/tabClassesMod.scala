package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabClassesMod {
  
  @JSImport("@mui/material/Tab/tabClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Tab/tabClasses", JSImport.Default)
  @js.native
  val default: TabClasses = js.native
  
  inline def getTabUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.labelIcon
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textColorInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textColorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textColorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.selected
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fullWidth
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.wrapped
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconWrapper
  */
  trait TabClassKey extends StObject
  
  trait TabClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}` (controlled by the Tabs component). */
    var disabled: String
    
    /** Styles applied to the root element if `fullWidth={true}` (controlled by the Tabs component). */
    var fullWidth: String
    
    /** Styles applied to the wrapper element of `icon` if `icon` is provided. */
    var iconWrapper: String
    
    /** Styles applied to the root element if both `icon` and `label` are provided. */
    var labelIcon: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** State class applied to the root element if `selected={true}` (controlled by the Tabs component). */
    var selected: String
    
    /** Styles applied to the root element if the parent [`Tabs`](/api/tabs/) has `textColor="inherit"`. */
    var textColorInherit: String
    
    /** Styles applied to the root element if the parent [`Tabs`](/api/tabs/) has `textColor="primary"`. */
    var textColorPrimary: String
    
    /** Styles applied to the root element if the parent [`Tabs`](/api/tabs/) has `textColor="secondary"`. */
    var textColorSecondary: String
    
    /** Styles applied to the root element if `wrapped={true}`. */
    var wrapped: String
  }
  object TabClasses {
    
    inline def apply(
      disabled: String,
      fullWidth: String,
      iconWrapper: String,
      labelIcon: String,
      root: String,
      selected: String,
      textColorInherit: String,
      textColorPrimary: String,
      textColorSecondary: String,
      wrapped: String
    ): TabClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], iconWrapper = iconWrapper.asInstanceOf[js.Any], labelIcon = labelIcon.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], textColorInherit = textColorInherit.asInstanceOf[js.Any], textColorPrimary = textColorPrimary.asInstanceOf[js.Any], textColorSecondary = textColorSecondary.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabClasses]
    }
    
    extension [Self <: TabClasses](x: Self) {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setIconWrapper(value: String): Self = StObject.set(x, "iconWrapper", value.asInstanceOf[js.Any])
      
      inline def setLabelIcon(value: String): Self = StObject.set(x, "labelIcon", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTextColorInherit(value: String): Self = StObject.set(x, "textColorInherit", value.asInstanceOf[js.Any])
      
      inline def setTextColorPrimary(value: String): Self = StObject.set(x, "textColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setTextColorSecondary(value: String): Self = StObject.set(x, "textColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setWrapped(value: String): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    }
  }
}
