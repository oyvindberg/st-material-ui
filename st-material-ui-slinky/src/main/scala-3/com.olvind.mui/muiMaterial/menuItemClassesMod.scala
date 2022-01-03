package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemClassesMod {
  
  @JSImport("@mui/material/MenuItem/menuItemClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/MenuItem/menuItemClasses", JSImport.Default)
  @js.native
  val default: MenuItemClasses = js.native
  
  inline def getMenuItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusVisible
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dense
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.divider
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.gutters
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.selected
  */
  trait MenuItemClassKey extends StObject
  
  trait MenuItemClasses extends StObject {
    
    /** Styles applied to the root element if dense. */
    var dense: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the root element if `divider={true}`. */
    var divider: String
    
    /** State class applied to the root element if keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the inner `component` element unless `disableGutters={true}`. */
    var gutters: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** State class applied to the root element if `selected={true}`. */
    var selected: String
  }
  object MenuItemClasses {
    
    inline def apply(
      dense: String,
      disabled: String,
      divider: String,
      focusVisible: String,
      gutters: String,
      root: String,
      selected: String
    ): MenuItemClasses = {
      val __obj = js.Dynamic.literal(dense = dense.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemClasses]
    }
    
    extension [Self <: MenuItemClasses](x: Self) {
      
      inline def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
