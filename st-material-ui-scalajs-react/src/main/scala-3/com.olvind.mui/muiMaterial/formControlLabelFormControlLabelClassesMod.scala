package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlLabelFormControlLabelClassesMod {
  
  @JSImport("@mui/material/FormControlLabel/formControlLabelClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/FormControlLabel/formControlLabelClasses", JSImport.Default)
  @js.native
  val default: FormControlLabelClasses = js.native
  
  inline def getFormControlLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormControlLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type FormControlLabelClassKey = "root" | "labelPlacementStart" | "labelPlacementTop" | "labelPlacementBottom" | "disabled" | "label" | "error"
  
  trait FormControlLabelClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root element if `error={true}`. */
    var error: String
    
    /** Styles applied to the label's Typography component. */
    var label: String
    
    /** Styles applied to the root element if `labelPlacement="bottom"`. */
    var labelPlacementBottom: String
    
    /** Styles applied to the root element if `labelPlacement="start"`. */
    var labelPlacementStart: String
    
    /** Styles applied to the root element if `labelPlacement="top"`. */
    var labelPlacementTop: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object FormControlLabelClasses {
    
    inline def apply(
      disabled: String,
      error: String,
      label: String,
      labelPlacementBottom: String,
      labelPlacementStart: String,
      labelPlacementTop: String,
      root: String
    ): FormControlLabelClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPlacementBottom = labelPlacementBottom.asInstanceOf[js.Any], labelPlacementStart = labelPlacementStart.asInstanceOf[js.Any], labelPlacementTop = labelPlacementTop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormControlLabelClasses]
    }
    
    extension [Self <: FormControlLabelClasses](x: Self) {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementBottom(value: String): Self = StObject.set(x, "labelPlacementBottom", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementStart(value: String): Self = StObject.set(x, "labelPlacementStart", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementTop(value: String): Self = StObject.set(x, "labelPlacementTop", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
