package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepLabelClassesMod {
  
  @JSImport("@mui/material/StepLabel/stepLabelClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/StepLabel/stepLabelClasses", JSImport.Default)
  @js.native
  val default: StepLabelClasses = js.native
  
  @scala.inline
  def getStepLabelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepLabelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.horizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.vertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.label
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.active
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.completed
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.error
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconContainer
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alternativeLabel
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.labelContainer
  */
  trait StepLabelClassKey extends StObject
  
  @js.native
  trait StepLabelClasses extends StObject {
    
    /** State class applied to the label element if `active={true}`. */
    var active: String = js.native
    
    /** State class applied to the root and icon container and label if `alternativeLabel={true}`. */
    var alternativeLabel: String = js.native
    
    /** State class applied to the label element if `completed={true}`. */
    var completed: String = js.native
    
    /** State class applied to the root and label elements if `disabled={true}`. */
    var disabled: String = js.native
    
    /** State class applied to the root and label elements if `error={true}`. */
    var error: String = js.native
    
    /** Styles applied to the root element if `orientation="horizontal"`. */
    var horizontal: String = js.native
    
    /** Styles applied to the `icon` container element. */
    var iconContainer: String = js.native
    
    /** Styles applied to the label element that wraps `children`. */
    var label: String = js.native
    
    /** Styles applied to the container element which wraps label and `optional`. */
    var labelContainer: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String = js.native
  }
  object StepLabelClasses {
    
    @scala.inline
    def apply(
      active: String,
      alternativeLabel: String,
      completed: String,
      disabled: String,
      error: String,
      horizontal: String,
      iconContainer: String,
      label: String,
      labelContainer: String,
      root: String,
      vertical: String
    ): StepLabelClasses = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], alternativeLabel = alternativeLabel.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], iconContainer = iconContainer.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelContainer = labelContainer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepLabelClasses]
    }
    
    @scala.inline
    implicit class StepLabelClassesMutableBuilder[Self <: StepLabelClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternativeLabel(value: String): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainer(value: String): Self = StObject.set(x, "iconContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelContainer(value: String): Self = StObject.set(x, "labelContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
