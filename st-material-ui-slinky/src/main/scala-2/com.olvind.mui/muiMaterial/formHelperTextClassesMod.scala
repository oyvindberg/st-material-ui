package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formHelperTextClassesMod {
  
  @JSImport("@mui/material/FormHelperText/formHelperTextClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/FormHelperText/formHelperTextClasses", JSImport.Default)
  @js.native
  val default: FormHelperTextClasses = js.native
  
  @scala.inline
  def getFormHelperTextUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormHelperTextUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.error
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.contained
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focused
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.filled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.required
  */
  trait FormHelperTextClassKey extends StObject
  
  @js.native
  trait FormHelperTextClasses extends StObject {
    
    /** Styles applied to the root element if `variant="filled"` or `variant="outlined"`. */
    var contained: String = js.native
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** State class applied to the root element if `error={true}`. */
    var error: String = js.native
    
    /** State class applied to the root element if `filled={true}`. */
    var filled: String = js.native
    
    /** State class applied to the root element if `focused={true}`. */
    var focused: String = js.native
    
    /** State class applied to the root element if `required={true}`. */
    var required: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String = js.native
  }
  object FormHelperTextClasses {
    
    @scala.inline
    def apply(
      contained: String,
      disabled: String,
      error: String,
      filled: String,
      focused: String,
      required: String,
      root: String,
      sizeSmall: String
    ): FormHelperTextClasses = {
      val __obj = js.Dynamic.literal(contained = contained.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormHelperTextClasses]
    }
    
    @scala.inline
    implicit class FormHelperTextClassesMutableBuilder[Self <: FormHelperTextClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContained(value: String): Self = StObject.set(x, "contained", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
    }
  }
}
