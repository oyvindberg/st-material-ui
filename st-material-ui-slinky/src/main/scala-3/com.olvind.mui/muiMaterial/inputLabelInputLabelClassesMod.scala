package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputLabelInputLabelClassesMod {
  
  @JSImport("@mui/material/InputLabel/inputLabelClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/InputLabel/inputLabelClasses", JSImport.Default)
  @js.native
  val default: InputLabelClasses = js.native
  
  inline def getInputLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type InputLabelClassKey = "root" | "focused" | "disabled" | "error" | "required" | "asterisk" | "formControl" | "sizeSmall" | "shrink" | "animated" | "filled" | "outlined" | "standard"
  
  trait InputLabelClasses extends StObject {
    
    /** Styles applied to the input element unless `disableAnimation={true}`. */
    var animated: String
    
    /** State class applied to the asterisk element. */
    var asterisk: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root element if `error={true}`. */
    var error: String
    
    /** Styles applied to the root element if `variant="filled"`. */
    var filled: String
    
    /** State class applied to the root element if `focused={true}`. */
    var focused: String
    
    /** Styles applied to the root element if the component is a descendant of `FormControl`. */
    var formControl: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String
    
    /** State class applied to the root element if `required={true}`. */
    var required: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the input element if `shrink={true}`. */
    var shrink: String
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String
    
    /** Styles applied to the root element if `variant="standard"`. */
    var standard: String
  }
  object InputLabelClasses {
    
    inline def apply(
      animated: String,
      asterisk: String,
      disabled: String,
      error: String,
      filled: String,
      focused: String,
      formControl: String,
      outlined: String,
      required: String,
      root: String,
      shrink: String,
      sizeSmall: String,
      standard: String
    ): InputLabelClasses = {
      val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], asterisk = asterisk.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], formControl = formControl.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], shrink = shrink.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputLabelClasses]
    }
    
    extension [Self <: InputLabelClasses](x: Self) {
      
      inline def setAnimated(value: String): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAsterisk(value: String): Self = StObject.set(x, "asterisk", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFormControl(value: String): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
      
      inline def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setShrink(value: String): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
