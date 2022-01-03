package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelClassesMod {
  
  @JSImport("@mui/material/FormLabel/formLabelClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/FormLabel/formLabelClasses", JSImport.Default)
  @js.native
  val default: FormLabelClasses = js.native
  
  @scala.inline
  def getFormLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focused
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.error
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.filled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.required
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.asterisk
  */
  trait FormLabelClassKey extends StObject
  
  @js.native
  trait FormLabelClasses extends StObject {
    
    /** Styles applied to the asterisk element. */
    var asterisk: String = js.native
    
    /** Styles applied to the root element if the color is secondary. */
    var colorSecondary: String = js.native
    
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
  }
  object FormLabelClasses {
    
    @scala.inline
    def apply(
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
    implicit class FormLabelClassesMutableBuilder[Self <: FormLabelClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsterisk(value: String): Self = StObject.set(x, "asterisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
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
    }
  }
}
