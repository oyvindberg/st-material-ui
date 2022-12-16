package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupButtonGroupClassesMod {
  
  @JSImport("@mui/material/ButtonGroup/buttonGroupClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ButtonGroup/buttonGroupClasses", JSImport.Default)
  @js.native
  val default: ButtonGroupClasses = js.native
  
  inline def getButtonGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ButtonGroupClassKey = "root" | "contained" | "outlined" | "text" | "disableElevation" | "disabled" | "fullWidth" | "vertical" | "grouped" | "groupedHorizontal" | "groupedVertical" | "groupedText" | "groupedTextHorizontal" | "groupedTextVertical" | "groupedTextPrimary" | "groupedTextSecondary" | "groupedOutlined" | "groupedOutlinedHorizontal" | "groupedOutlinedVertical" | "groupedOutlinedPrimary" | "groupedOutlinedSecondary" | "groupedContained" | "groupedContainedHorizontal" | "groupedContainedVertical" | "groupedContainedPrimary" | "groupedContainedSecondary"
  
  trait ButtonGroupClasses extends StObject {
    
    /** Styles applied to the root element if `variant="contained"`. */
    var contained: String
    
    /** Styles applied to the root element if `disableElevation={true}`. */
    var disableElevation: String
    
    /** State class applied to the child elements if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the root element if `fullWidth={true}`. */
    var fullWidth: String
    
    /** Styles applied to the children. */
    var grouped: String
    
    /** Styles applied to the children if `variant="contained"`. */
    var groupedContained: String
    
    /** Styles applied to the children if `variant="contained"` and `orientation="horizontal"`. */
    var groupedContainedHorizontal: String
    
    /** Styles applied to the children if `variant="contained"` and `color="primary"`. */
    var groupedContainedPrimary: String
    
    /** Styles applied to the children if `variant="contained"` and `color="secondary"`. */
    var groupedContainedSecondary: String
    
    /** Styles applied to the children if `variant="contained"` and `orientation="vertical"`. */
    var groupedContainedVertical: String
    
    /** Styles applied to the children if `orientation="horizontal"`. */
    var groupedHorizontal: String
    
    /** Styles applied to the children if `variant="outlined"`. */
    var groupedOutlined: String
    
    /** Styles applied to the children if `variant="outlined"` and `orientation="horizontal"`. */
    var groupedOutlinedHorizontal: String
    
    /** Styles applied to the children if `variant="outlined"` and `color="primary"`. */
    var groupedOutlinedPrimary: String
    
    /** Styles applied to the children if `variant="outlined"` and `color="secondary"`. */
    var groupedOutlinedSecondary: String
    
    /** Styles applied to the children if `variant="outlined"` and `orientation="vertical"`. */
    var groupedOutlinedVertical: String
    
    /** Styles applied to the children if `variant="text"`. */
    var groupedText: String
    
    /** Styles applied to the children if `variant="text"` and `orientation="horizontal"`. */
    var groupedTextHorizontal: String
    
    /** Styles applied to the children if `variant="text"` and `color="primary"`. */
    var groupedTextPrimary: String
    
    /** Styles applied to the children if `variant="text"` and `color="secondary"`. */
    var groupedTextSecondary: String
    
    /** Styles applied to the children if `variant="text"` and `orientation="vertical"`. */
    var groupedTextVertical: String
    
    /** Styles applied to the children if `orientation="vertical"`. */
    var groupedVertical: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `variant="text"`. */
    var text: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object ButtonGroupClasses {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ButtonGroupClasses] (val x: Self) extends AnyVal {
      
      inline def setContained(value: String): Self = StObject.set(x, "contained", value.asInstanceOf[js.Any])
      
      inline def setDisableElevation(value: String): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setGrouped(value: String): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      inline def setGroupedContained(value: String): Self = StObject.set(x, "groupedContained", value.asInstanceOf[js.Any])
      
      inline def setGroupedContainedHorizontal(value: String): Self = StObject.set(x, "groupedContainedHorizontal", value.asInstanceOf[js.Any])
      
      inline def setGroupedContainedPrimary(value: String): Self = StObject.set(x, "groupedContainedPrimary", value.asInstanceOf[js.Any])
      
      inline def setGroupedContainedSecondary(value: String): Self = StObject.set(x, "groupedContainedSecondary", value.asInstanceOf[js.Any])
      
      inline def setGroupedContainedVertical(value: String): Self = StObject.set(x, "groupedContainedVertical", value.asInstanceOf[js.Any])
      
      inline def setGroupedHorizontal(value: String): Self = StObject.set(x, "groupedHorizontal", value.asInstanceOf[js.Any])
      
      inline def setGroupedOutlined(value: String): Self = StObject.set(x, "groupedOutlined", value.asInstanceOf[js.Any])
      
      inline def setGroupedOutlinedHorizontal(value: String): Self = StObject.set(x, "groupedOutlinedHorizontal", value.asInstanceOf[js.Any])
      
      inline def setGroupedOutlinedPrimary(value: String): Self = StObject.set(x, "groupedOutlinedPrimary", value.asInstanceOf[js.Any])
      
      inline def setGroupedOutlinedSecondary(value: String): Self = StObject.set(x, "groupedOutlinedSecondary", value.asInstanceOf[js.Any])
      
      inline def setGroupedOutlinedVertical(value: String): Self = StObject.set(x, "groupedOutlinedVertical", value.asInstanceOf[js.Any])
      
      inline def setGroupedText(value: String): Self = StObject.set(x, "groupedText", value.asInstanceOf[js.Any])
      
      inline def setGroupedTextHorizontal(value: String): Self = StObject.set(x, "groupedTextHorizontal", value.asInstanceOf[js.Any])
      
      inline def setGroupedTextPrimary(value: String): Self = StObject.set(x, "groupedTextPrimary", value.asInstanceOf[js.Any])
      
      inline def setGroupedTextSecondary(value: String): Self = StObject.set(x, "groupedTextSecondary", value.asInstanceOf[js.Any])
      
      inline def setGroupedTextVertical(value: String): Self = StObject.set(x, "groupedTextVertical", value.asInstanceOf[js.Any])
      
      inline def setGroupedVertical(value: String): Self = StObject.set(x, "groupedVertical", value.asInstanceOf[js.Any])
      
      inline def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
