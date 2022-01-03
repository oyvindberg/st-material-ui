package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.formControl
    - `com.olvind.mui`.muiBase.muiBaseStrings.adornedStart
    - `com.olvind.mui`.muiBase.muiBaseStrings.adornedEnd
    - `com.olvind.mui`.muiBase.muiBaseStrings.focused
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
    - `com.olvind.mui`.muiBase.muiBaseStrings.error
    - `com.olvind.mui`.muiBase.muiBaseStrings.multiline
    - `com.olvind.mui`.muiBase.muiBaseStrings.input
    - `com.olvind.mui`.muiBase.muiBaseStrings.inputMultiline
    - `com.olvind.mui`.muiBase.muiBaseStrings.inputTypeSearch
  */
  trait InputUnstyledClassKey extends StObject
  
  trait InputUnstyledClasses extends StObject {
    
    /** Styles applied to the root element if `endAdornment` is provided. */
    var adornedEnd: String
    
    /** Styles applied to the root element if `startAdornment` is provided. */
    var adornedStart: String
    
    /** Styles applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root element if `error={true}`. */
    var error: String
    
    /** Styles applied to the root element if the component is focused. */
    var focused: String
    
    /** Styles applied to the root element if the component is a descendant of `FormControl`. */
    var formControl: String
    
    /** Styles applied to the input element. */
    var input: String
    
    /** Styles applied to the input element if `multiline={true}`. */
    var inputMultiline: String
    
    /** Styles applied to the input element if `type="search"`. */
    var inputTypeSearch: String
    
    /** Styles applied to the root element if `multiline={true}`. */
    var multiline: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object InputUnstyledClasses {
    
    inline def apply(
      adornedEnd: String,
      adornedStart: String,
      disabled: String,
      error: String,
      focused: String,
      formControl: String,
      input: String,
      inputMultiline: String,
      inputTypeSearch: String,
      multiline: String,
      root: String
    ): InputUnstyledClasses = {
      val __obj = js.Dynamic.literal(adornedEnd = adornedEnd.asInstanceOf[js.Any], adornedStart = adornedStart.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], formControl = formControl.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputMultiline = inputMultiline.asInstanceOf[js.Any], inputTypeSearch = inputTypeSearch.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputUnstyledClasses]
    }
    
    extension [Self <: InputUnstyledClasses](x: Self) {
      
      inline def setAdornedEnd(value: String): Self = StObject.set(x, "adornedEnd", value.asInstanceOf[js.Any])
      
      inline def setAdornedStart(value: String): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFormControl(value: String): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputMultiline(value: String): Self = StObject.set(x, "inputMultiline", value.asInstanceOf[js.Any])
      
      inline def setInputTypeSearch(value: String): Self = StObject.set(x, "inputTypeSearch", value.asInstanceOf[js.Any])
      
      inline def setMultiline(value: String): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
