package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemButtonListItemButtonClassesMod {
  
  @JSImport("@mui/material/ListItemButton/listItemButtonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItemButton/listItemButtonClasses", JSImport.Default)
  @js.native
  val default: ListItemButtonClasses = js.native
  
  inline def getListItemButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListItemButtonClassKey = "root" | "focusVisible" | "dense" | "alignItemsFlexStart" | "disabled" | "divider" | "gutters" | "selected"
  
  trait ListItemButtonClasses extends StObject {
    
    /** Styles applied to the component element if `alignItems="flex-start"`. */
    var alignItemsFlexStart: String
    
    /** Styles applied to the component element if dense. */
    var dense: String
    
    /** State class applied to the inner `component` element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the inner `component` element if `divider={true}`. */
    var divider: String
    
    /** State class applied to the `component`'s `focusVisibleClassName` prop. */
    var focusVisible: String
    
    /** Styles applied to the inner `component` element unless `disableGutters={true}`. */
    var gutters: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** State class applied to the root element if `selected={true}`. */
    var selected: String
  }
  object ListItemButtonClasses {
    
    inline def apply(
      alignItemsFlexStart: String,
      dense: String,
      disabled: String,
      divider: String,
      focusVisible: String,
      gutters: String,
      root: String,
      selected: String
    ): ListItemButtonClasses = {
      val __obj = js.Dynamic.literal(alignItemsFlexStart = alignItemsFlexStart.asInstanceOf[js.Any], dense = dense.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemButtonClasses]
    }
    
    extension [Self <: ListItemButtonClasses](x: Self) {
      
      inline def setAlignItemsFlexStart(value: String): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
      
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
