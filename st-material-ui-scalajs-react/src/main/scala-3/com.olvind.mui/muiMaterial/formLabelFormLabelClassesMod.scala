package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelFormLabelClassesMod {
  
  @JSImport("@mui/material/FormLabel/formLabelClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/FormLabel/formLabelClasses", JSImport.Default)
  @js.native
  val default: FormLabelClasses = js.native
  
  inline def getFormLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type FormLabelClassKey = "root" | "colorSecondary" | "focused" | "disabled" | "error" | "filled" | "required" | "asterisk"
  
  trait FormLabelClasses extends StObject {
    
    /** Styles applied to the asterisk element. */
    var asterisk: String
    
    /** Styles applied to the root element if the color is secondary. */
    var colorSecondary: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root element if `error={true}`. */
    var error: String
    
    /** State class applied to the root element if `filled={true}`. */
    var filled: String
    
    /** State class applied to the root element if `focused={true}`. */
    var focused: String
    
    /** State class applied to the root element if `required={true}`. */
    var required: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object FormLabelClasses {
    
    inline def apply(
      asterisk: String,
      colorSecondary: String,
      disabled: String,
      error: String,
      filled: String,
      focused: String,
      required: String,
      root: String
    ): FormLabelClasses = {
      val __obj = js.Dynamic.literal(asterisk = asterisk.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormLabelClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormLabelClasses] (val x: Self) extends AnyVal {
      
      inline def setAsterisk(value: String): Self = StObject.set(x, "asterisk", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
