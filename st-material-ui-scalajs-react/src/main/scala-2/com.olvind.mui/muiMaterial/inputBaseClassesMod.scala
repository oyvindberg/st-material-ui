package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputBaseClassesMod {
  
  @JSImport("@mui/material/InputBase/inputBaseClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/InputBase/inputBaseClasses", JSImport.Default)
  @js.native
  val default: InputBaseClasses = js.native
  
  @scala.inline
  def getInputBaseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputBaseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.formControl
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focused
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.adornedStart
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.adornedEnd
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.error
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.multiline
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fullWidth
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.hiddenLabel
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.input
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputSizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputMultiline
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputTypeSearch
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputAdornedStart
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputAdornedEnd
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputHiddenLabel
  */
  trait InputBaseClassKey extends StObject
  
  @js.native
  trait InputBaseClasses extends StObject {
    
    /** Styles applied to the root element if `endAdornment` is provided. */
    var adornedEnd: String = js.native
    
    /** Styles applied to the root element if `startAdornment` is provided. */
    var adornedStart: String = js.native
    
    /** Styles applied to the root element if the color is secondary. */
    var colorSecondary: String = js.native
    
    /** Styles applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** State class applied to the root element if `error={true}`. */
    var error: String = js.native
    
    /** Styles applied to the root element if the component is focused. */
    var focused: String = js.native
    
    /** Styles applied to the root element if the component is a descendant of `FormControl`. */
    var formControl: String = js.native
    
    /** Styles applied to the root element if `fullWidth={true}`. */
    var fullWidth: String = js.native
    
    /** Styles applied to the root element if `hiddenLabel={true}`. */
    var hiddenLabel: String = js.native
    
    /** Styles applied to the input element. */
    var input: String = js.native
    
    /** Styles applied to the input element if `endAdornment` is provided. */
    var inputAdornedEnd: String = js.native
    
    /** Styles applied to the input element if `startAdornment` is provided. */
    var inputAdornedStart: String = js.native
    
    /** Styles applied to the input element if `hiddenLabel={true}`. */
    var inputHiddenLabel: String = js.native
    
    /** Styles applied to the input element if `multiline={true}`. */
    var inputMultiline: String = js.native
    
    /** Styles applied to the input element if `size="small"`. */
    var inputSizeSmall: String = js.native
    
    /** Styles applied to the input element if `type="search"`. */
    var inputTypeSearch: String = js.native
    
    /** Styles applied to the root element if `multiline={true}`. */
    var multiline: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the input element if `size="small"`. */
    var sizeSmall: String = js.native
  }
  object InputBaseClasses {
    
    @scala.inline
    def apply(
      adornedEnd: String,
      adornedStart: String,
      colorSecondary: String,
      disabled: String,
      error: String,
      focused: String,
      formControl: String,
      fullWidth: String,
      hiddenLabel: String,
      input: String,
      inputAdornedEnd: String,
      inputAdornedStart: String,
      inputHiddenLabel: String,
      inputMultiline: String,
      inputSizeSmall: String,
      inputTypeSearch: String,
      multiline: String,
      root: String,
      sizeSmall: String
    ): InputBaseClasses = {
      val __obj = js.Dynamic.literal(adornedEnd = adornedEnd.asInstanceOf[js.Any], adornedStart = adornedStart.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], formControl = formControl.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], hiddenLabel = hiddenLabel.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputAdornedEnd = inputAdornedEnd.asInstanceOf[js.Any], inputAdornedStart = inputAdornedStart.asInstanceOf[js.Any], inputHiddenLabel = inputHiddenLabel.asInstanceOf[js.Any], inputMultiline = inputMultiline.asInstanceOf[js.Any], inputSizeSmall = inputSizeSmall.asInstanceOf[js.Any], inputTypeSearch = inputTypeSearch.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputBaseClasses]
    }
    
    @scala.inline
    implicit class InputBaseClassesMutableBuilder[Self <: InputBaseClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdornedEnd(value: String): Self = StObject.set(x, "adornedEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdornedStart(value: String): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormControl(value: String): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenLabel(value: String): Self = StObject.set(x, "hiddenLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputAdornedEnd(value: String): Self = StObject.set(x, "inputAdornedEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputAdornedStart(value: String): Self = StObject.set(x, "inputAdornedStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputHiddenLabel(value: String): Self = StObject.set(x, "inputHiddenLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputMultiline(value: String): Self = StObject.set(x, "inputMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSizeSmall(value: String): Self = StObject.set(x, "inputSizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTypeSearch(value: String): Self = StObject.set(x, "inputTypeSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiline(value: String): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
    }
  }
}
