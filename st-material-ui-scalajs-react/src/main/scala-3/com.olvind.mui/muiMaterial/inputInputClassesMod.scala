package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputClassesMod {
  
  @JSImport("@mui/material/Input/inputClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Input/inputClasses", JSImport.Default)
  @js.native
  val default: InputClasses = js.native
  
  inline def getInputUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type InputClassKey = "root" | "formControl" | "focused" | "disabled" | "colorSecondary" | "underline" | "error" | "sizeSmall" | "multiline" | "fullWidth" | "input" | "inputSizeSmall" | "inputMultiline" | "inputTypeSearch"
  
  trait InputClasses extends StObject {
    
    /** Styles applied to the root element if color secondary. */
    var colorSecondary: String
    
    /** Styles applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root element if `error={true}`. */
    var error: String
    
    /** Styles applied to the root element if the component is focused. */
    var focused: String
    
    /** Styles applied to the root element if the component is a descendant of `FormControl`. */
    var formControl: String
    
    /** Styles applied to the root element if `fullWidth={true}`. */
    var fullWidth: String
    
    /** Styles applied to the input element. */
    var input: String
    
    /** Styles applied to the input element if `multiline={true}`. */
    var inputMultiline: String
    
    /** Styles applied to the input element if `size="small"`. */
    var inputSizeSmall: String
    
    /** Styles applied to the input element if `type="search"`. */
    var inputTypeSearch: String
    
    /** Styles applied to the root element if `multiline={true}`. */
    var multiline: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the input element if `size="small"`. */
    var sizeSmall: String
    
    /** Styles applied to the root element unless `disableUnderline={true}`. */
    var underline: String
  }
  object InputClasses {
    
    inline def apply(
      colorSecondary: String,
      disabled: String,
      error: String,
      focused: String,
      formControl: String,
      fullWidth: String,
      input: String,
      inputMultiline: String,
      inputSizeSmall: String,
      inputTypeSearch: String,
      multiline: String,
      root: String,
      sizeSmall: String,
      underline: String
    ): InputClasses = {
      val __obj = js.Dynamic.literal(colorSecondary = colorSecondary.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], formControl = formControl.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputMultiline = inputMultiline.asInstanceOf[js.Any], inputSizeSmall = inputSizeSmall.asInstanceOf[js.Any], inputTypeSearch = inputTypeSearch.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputClasses] (val x: Self) extends AnyVal {
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFormControl(value: String): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputMultiline(value: String): Self = StObject.set(x, "inputMultiline", value.asInstanceOf[js.Any])
      
      inline def setInputSizeSmall(value: String): Self = StObject.set(x, "inputSizeSmall", value.asInstanceOf[js.Any])
      
      inline def setInputTypeSearch(value: String): Self = StObject.set(x, "inputTypeSearch", value.asInstanceOf[js.Any])
      
      inline def setMultiline(value: String): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      inline def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    }
  }
}
