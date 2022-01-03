package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemClassesMod {
  
  @JSImport("@mui/material/ListItem/listItemClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItem/listItemClasses", JSImport.Default)
  @js.native
  val default: ListItemClasses = js.native
  
  @scala.inline
  def getListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.container
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusVisible
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dense
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignItemsFlexStart
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.divider
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.gutters
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.padding
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.button
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.secondaryAction
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.selected
  */
  trait ListItemClassKey extends StObject
  
  @js.native
  trait ListItemClasses extends StObject {
    
    /** Styles applied to the component element if `alignItems="flex-start"`. */
    var alignItemsFlexStart: String = js.native
    
    /** Styles applied to the inner `component` element if `button={true}`. */
    var button: String = js.native
    
    /** Styles applied to the container element if `children` includes `ListItemSecondaryAction`. */
    var container: String = js.native
    
    /** Styles applied to the component element if dense. */
    var dense: String = js.native
    
    /** State class applied to the inner `component` element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** Styles applied to the inner `component` element if `divider={true}`. */
    var divider: String = js.native
    
    /** State class applied to the `component`'s `focusVisibleClassName` prop if `button={true}`. */
    var focusVisible: String = js.native
    
    /** Styles applied to the inner `component` element unless `disableGutters={true}`. */
    var gutters: String = js.native
    
    /** Styles applied to the root element unless `disablePadding={true}`. */
    var padding: String = js.native
    
    /** Styles applied to the (normally root) `component` element. May be wrapped by a `container`. */
    var root: String = js.native
    
    /** Styles applied to the component element if `children` includes `ListItemSecondaryAction`. */
    var secondaryAction: String = js.native
    
    /** State class applied to the root element if `selected={true}`. */
    var selected: String = js.native
  }
  object ListItemClasses {
    
    @scala.inline
    def apply(
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
    implicit class ListItemClassesMutableBuilder[Self <: ListItemClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignItemsFlexStart(value: String): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryAction(value: String): Self = StObject.set(x, "secondaryAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
