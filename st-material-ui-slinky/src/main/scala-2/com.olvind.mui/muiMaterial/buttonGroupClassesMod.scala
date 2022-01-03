package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupClassesMod {
  
  @JSImport("@mui/material/ButtonGroup/buttonGroupClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ButtonGroup/buttonGroupClasses", JSImport.Default)
  @js.native
  val default: ButtonGroupClasses = js.native
  
  @scala.inline
  def getButtonGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.contained
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlined
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.text
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disableElevation
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fullWidth
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.vertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.grouped
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedHorizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedVertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedText
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedTextHorizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedTextVertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedTextPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedTextSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedOutlined
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedOutlinedHorizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedOutlinedVertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedOutlinedPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedOutlinedSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedContained
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedContainedHorizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedContainedVertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedContainedPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.groupedContainedSecondary
  */
  trait ButtonGroupClassKey extends StObject
  
  @js.native
  trait ButtonGroupClasses extends StObject {
    
    /** Styles applied to the root element if `variant="contained"`. */
    var contained: String = js.native
    
    /** Styles applied to the root element if `disableElevation={true}`. */
    var disableElevation: String = js.native
    
    /** State class applied to the child elements if `disabled={true}`. */
    var disabled: String = js.native
    
    /** Styles applied to the root element if `fullWidth={true}`. */
    var fullWidth: String = js.native
    
    /** Styles applied to the children. */
    var grouped: String = js.native
    
    /** Styles applied to the children if `variant="contained"`. */
    var groupedContained: String = js.native
    
    /** Styles applied to the children if `variant="contained"` and `orientation="horizontal"`. */
    var groupedContainedHorizontal: String = js.native
    
    /** Styles applied to the children if `variant="contained"` and `color="primary"`. */
    var groupedContainedPrimary: String = js.native
    
    /** Styles applied to the children if `variant="contained"` and `color="secondary"`. */
    var groupedContainedSecondary: String = js.native
    
    /** Styles applied to the children if `variant="contained"` and `orientation="vertical"`. */
    var groupedContainedVertical: String = js.native
    
    /** Styles applied to the children if `orientation="horizontal"`. */
    var groupedHorizontal: String = js.native
    
    /** Styles applied to the children if `variant="outlined"`. */
    var groupedOutlined: String = js.native
    
    /** Styles applied to the children if `variant="outlined"` and `orientation="horizontal"`. */
    var groupedOutlinedHorizontal: String = js.native
    
    /** Styles applied to the children if `variant="outlined"` and `color="primary"`. */
    var groupedOutlinedPrimary: String = js.native
    
    /** Styles applied to the children if `variant="outlined"` and `color="secondary"`. */
    var groupedOutlinedSecondary: String = js.native
    
    /** Styles applied to the children if `variant="outlined"` and `orientation="vertical"`. */
    var groupedOutlinedVertical: String = js.native
    
    /** Styles applied to the children if `variant="text"`. */
    var groupedText: String = js.native
    
    /** Styles applied to the children if `variant="text"` and `orientation="horizontal"`. */
    var groupedTextHorizontal: String = js.native
    
    /** Styles applied to the children if `variant="text"` and `color="primary"`. */
    var groupedTextPrimary: String = js.native
    
    /** Styles applied to the children if `variant="text"` and `color="secondary"`. */
    var groupedTextSecondary: String = js.native
    
    /** Styles applied to the children if `variant="text"` and `orientation="vertical"`. */
    var groupedTextVertical: String = js.native
    
    /** Styles applied to the children if `orientation="vertical"`. */
    var groupedVertical: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `variant="text"`. */
    var text: String = js.native
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String = js.native
  }
  object ButtonGroupClasses {
    
    @scala.inline
    def apply(
      contained: String,
      disableElevation: String,
      disabled: String,
      fullWidth: String,
      grouped: String,
      groupedContained: String,
      groupedContainedHorizontal: String,
      groupedContainedPrimary: String,
      groupedContainedSecondary: String,
      groupedContainedVertical: String,
      groupedHorizontal: String,
      groupedOutlined: String,
      groupedOutlinedHorizontal: String,
      groupedOutlinedPrimary: String,
      groupedOutlinedSecondary: String,
      groupedOutlinedVertical: String,
      groupedText: String,
      groupedTextHorizontal: String,
      groupedTextPrimary: String,
      groupedTextSecondary: String,
      groupedTextVertical: String,
      groupedVertical: String,
      outlined: String,
      root: String,
      text: String,
      vertical: String
    ): ButtonGroupClasses = {
      val __obj = js.Dynamic.literal(contained = contained.asInstanceOf[js.Any], disableElevation = disableElevation.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], grouped = grouped.asInstanceOf[js.Any], groupedContained = groupedContained.asInstanceOf[js.Any], groupedContainedHorizontal = groupedContainedHorizontal.asInstanceOf[js.Any], groupedContainedPrimary = groupedContainedPrimary.asInstanceOf[js.Any], groupedContainedSecondary = groupedContainedSecondary.asInstanceOf[js.Any], groupedContainedVertical = groupedContainedVertical.asInstanceOf[js.Any], groupedHorizontal = groupedHorizontal.asInstanceOf[js.Any], groupedOutlined = groupedOutlined.asInstanceOf[js.Any], groupedOutlinedHorizontal = groupedOutlinedHorizontal.asInstanceOf[js.Any], groupedOutlinedPrimary = groupedOutlinedPrimary.asInstanceOf[js.Any], groupedOutlinedSecondary = groupedOutlinedSecondary.asInstanceOf[js.Any], groupedOutlinedVertical = groupedOutlinedVertical.asInstanceOf[js.Any], groupedText = groupedText.asInstanceOf[js.Any], groupedTextHorizontal = groupedTextHorizontal.asInstanceOf[js.Any], groupedTextPrimary = groupedTextPrimary.asInstanceOf[js.Any], groupedTextSecondary = groupedTextSecondary.asInstanceOf[js.Any], groupedTextVertical = groupedTextVertical.asInstanceOf[js.Any], groupedVertical = groupedVertical.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonGroupClasses]
    }
    
    @scala.inline
    implicit class ButtonGroupClassesMutableBuilder[Self <: ButtonGroupClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContained(value: String): Self = StObject.set(x, "contained", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableElevation(value: String): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrouped(value: String): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedContained(value: String): Self = StObject.set(x, "groupedContained", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedContainedHorizontal(value: String): Self = StObject.set(x, "groupedContainedHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedContainedPrimary(value: String): Self = StObject.set(x, "groupedContainedPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedContainedSecondary(value: String): Self = StObject.set(x, "groupedContainedSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedContainedVertical(value: String): Self = StObject.set(x, "groupedContainedVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedHorizontal(value: String): Self = StObject.set(x, "groupedHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedOutlined(value: String): Self = StObject.set(x, "groupedOutlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedOutlinedHorizontal(value: String): Self = StObject.set(x, "groupedOutlinedHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedOutlinedPrimary(value: String): Self = StObject.set(x, "groupedOutlinedPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedOutlinedSecondary(value: String): Self = StObject.set(x, "groupedOutlinedSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedOutlinedVertical(value: String): Self = StObject.set(x, "groupedOutlinedVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedText(value: String): Self = StObject.set(x, "groupedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedTextHorizontal(value: String): Self = StObject.set(x, "groupedTextHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedTextPrimary(value: String): Self = StObject.set(x, "groupedTextPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedTextSecondary(value: String): Self = StObject.set(x, "groupedTextSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedTextVertical(value: String): Self = StObject.set(x, "groupedTextVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedVertical(value: String): Self = StObject.set(x, "groupedVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
