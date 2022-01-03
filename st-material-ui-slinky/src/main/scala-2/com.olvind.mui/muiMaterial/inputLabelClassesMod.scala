package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputLabelClassesMod {
  
  @JSImport("@mui/material/InputLabel/inputLabelClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/InputLabel/inputLabelClasses", JSImport.Default)
  @js.native
  val default: InputLabelClasses = js.native
  
  @scala.inline
  def getInputLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focused
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.error
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.required
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.asterisk
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.formControl
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.shrink
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.animated
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.filled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlined
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.standard
  */
  trait InputLabelClassKey extends StObject
  
  @js.native
  trait InputLabelClasses extends StObject {
    
    /** Styles applied to the input element unless `disableAnimation={true}`. */
    var animated: String = js.native
    
    /** State class applied to the asterisk element. */
    var asterisk: String = js.native
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** State class applied to the root element if `error={true}`. */
    var error: String = js.native
    
    /** Styles applied to the root element if `variant="filled"`. */
    var filled: String = js.native
    
    /** State class applied to the root element if `focused={true}`. */
    var focused: String = js.native
    
    /** Styles applied to the root element if the component is a descendant of `FormControl`. */
    var formControl: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String = js.native
    
    /** State class applied to the root element if `required={true}`. */
    var required: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the input element if `shrink={true}`. */
    var shrink: String = js.native
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String = js.native
    
    /** Styles applied to the root element if `variant="standard"`. */
    var standard: String = js.native
  }
  object InputLabelClasses {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class InputLabelClassesMutableBuilder[Self <: InputLabelClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: String): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsterisk(value: String): Self = StObject.set(x, "asterisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormControl(value: String): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShrink(value: String): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
