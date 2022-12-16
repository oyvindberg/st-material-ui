package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemListItemClassesMod {
  
  @JSImport("@mui/material/ListItem/listItemClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItem/listItemClasses", JSImport.Default)
  @js.native
  val default: ListItemClasses = js.native
  
  inline def getListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListItemClassKey = "root" | "container" | "focusVisible" | "dense" | "alignItemsFlexStart" | "disabled" | "divider" | "gutters" | "padding" | "button" | "secondaryAction" | "selected"
  
  trait ListItemClasses extends StObject {
    
    /** Styles applied to the component element if `alignItems="flex-start"`. */
    var alignItemsFlexStart: String
    
    /** Styles applied to the inner `component` element if `button={true}`. */
    var button: String
    
    /** Styles applied to the container element if `children` includes `ListItemSecondaryAction`. */
    var container: String
    
    /** Styles applied to the component element if dense. */
    var dense: String
    
    /** State class applied to the inner `component` element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the inner `component` element if `divider={true}`. */
    var divider: String
    
    /** State class applied to the `component`'s `focusVisibleClassName` prop if `button={true}`. */
    var focusVisible: String
    
    /** Styles applied to the inner `component` element unless `disableGutters={true}`. */
    var gutters: String
    
    /** Styles applied to the root element unless `disablePadding={true}`. */
    var padding: String
    
    /** Styles applied to the (normally root) `component` element. May be wrapped by a `container`. */
    var root: String
    
    /** Styles applied to the component element if `children` includes `ListItemSecondaryAction`. */
    var secondaryAction: String
    
    /** State class applied to the root element if `selected={true}`. */
    var selected: String
  }
  object ListItemClasses {
    
    inline def apply(
      alignItemsFlexStart: String,
      button: String,
      container: String,
      dense: String,
      disabled: String,
      divider: String,
      focusVisible: String,
      gutters: String,
      padding: String,
      root: String,
      secondaryAction: String,
      selected: String
    ): ListItemClasses = {
      val __obj = js.Dynamic.literal(alignItemsFlexStart = alignItemsFlexStart.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], dense = dense.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondaryAction = secondaryAction.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemClasses] (val x: Self) extends AnyVal {
      
      inline def setAlignItemsFlexStart(value: String): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSecondaryAction(value: String): Self = StObject.set(x, "secondaryAction", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
