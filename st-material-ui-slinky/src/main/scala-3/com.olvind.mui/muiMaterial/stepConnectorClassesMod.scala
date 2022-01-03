package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepConnectorClassesMod {
  
  @JSImport("@mui/material/StepConnector/stepConnectorClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/StepConnector/stepConnectorClasses", JSImport.Default)
  @js.native
  val default: StepConnectorClasses = js.native
  
  inline def getStepConnectorUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepConnectorUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.horizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.vertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alternativeLabel
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.active
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.completed
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.line
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.lineHorizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.lineVertical
  */
  trait StepConnectorClassKey extends StObject
  
  trait StepConnectorClasses extends StObject {
    
    /** State class applied to the root element if `active={true}`. */
    var active: String
    
    /** Styles applied to the root element if `alternativeLabel={true}`. */
    var alternativeLabel: String
    
    /** State class applied to the root element if `completed={true}`. */
    var completed: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the root element if `orientation="horizontal"`. */
    var horizontal: String
    
    /** Styles applied to the line element. */
    var line: String
    
    /** Styles applied to the root element if `orientation="horizontal"`. */
    var lineHorizontal: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var lineVertical: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object StepConnectorClasses {
    
    inline def apply(
      active: String,
      alternativeLabel: String,
      completed: String,
      disabled: String,
      horizontal: String,
      line: String,
      lineHorizontal: String,
      lineVertical: String,
      root: String,
      vertical: String
    ): StepConnectorClasses = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], alternativeLabel = alternativeLabel.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineHorizontal = lineHorizontal.asInstanceOf[js.Any], lineVertical = lineVertical.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepConnectorClasses]
    }
    
    extension [Self <: StepConnectorClasses](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAlternativeLabel(value: String): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineHorizontal(value: String): Self = StObject.set(x, "lineHorizontal", value.asInstanceOf[js.Any])
      
      inline def setLineVertical(value: String): Self = StObject.set(x, "lineVertical", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
