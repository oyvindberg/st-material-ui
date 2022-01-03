package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.dense
import com.olvind.mui.muiMaterial.muiMaterialStrings.filled
import com.olvind.mui.muiMaterial.muiMaterialStrings.none
import com.olvind.mui.muiMaterial.muiMaterialStrings.normal
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFormControlMod {
  
  @JSImport("@mui/material/FormControl/useFormControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.UndefOr[FormControlState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[FormControlState]]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.error
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fullWidth
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.hiddenLabel
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.margin
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.required
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.variant
  */
  trait ContextFromPropsKey extends StObject
  object ContextFromPropsKey {
    
    @scala.inline
    def disabled: com.olvind.mui.muiMaterial.muiMaterialStrings.disabled = "disabled".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.disabled]
    
    @scala.inline
    def error: com.olvind.mui.muiMaterial.muiMaterialStrings.error = "error".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.error]
    
    @scala.inline
    def fullWidth: com.olvind.mui.muiMaterial.muiMaterialStrings.fullWidth = "fullWidth".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.fullWidth]
    
    @scala.inline
    def hiddenLabel: com.olvind.mui.muiMaterial.muiMaterialStrings.hiddenLabel = "hiddenLabel".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.hiddenLabel]
    
    @scala.inline
    def margin: com.olvind.mui.muiMaterial.muiMaterialStrings.margin = "margin".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.margin]
    
    @scala.inline
    def required: com.olvind.mui.muiMaterial.muiMaterialStrings.required = "required".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.required]
    
    @scala.inline
    def variant: com.olvind.mui.muiMaterial.muiMaterialStrings.variant = "variant".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.variant]
  }
  
  /* Inlined parent std.Pick<@mui/material.@mui/material/FormControl/FormControl.FormControlProps<@mui/material.@mui/material/FormControl/FormControl.FormControlTypeMap<{}, 'div'>['defaultComponent'], {}>, @mui/material.@mui/material/FormControl/useFormControl.ContextFromPropsKey> */
  @js.native
  trait FormControlState extends StObject {
    
    var adornedStart: Boolean = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var filled: Boolean = js.native
    
    var focused: Boolean = js.native
    
    var fullWidth: js.UndefOr[Boolean] = js.native
    
    var hiddenLabel: js.UndefOr[Boolean] = js.native
    
    var margin: js.UndefOr[dense | normal | none] = js.native
    
    def onBlur(): Unit = js.native
    
    def onEmpty(): Unit = js.native
    
    def onFilled(): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var variant: js.UndefOr[standard | outlined | filled] = js.native
  }
  object FormControlState {
    
    @scala.inline
    def apply(
      adornedStart: Boolean,
      filled: Boolean,
      focused: Boolean,
      onBlur: () => Unit,
      onEmpty: () => Unit,
      onFilled: () => Unit,
      onFocus: () => Unit
    ): FormControlState = {
      val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onEmpty = js.Any.fromFunction0(onEmpty), onFilled = js.Any.fromFunction0(onFilled), onFocus = js.Any.fromFunction0(onFocus))
      __obj.asInstanceOf[FormControlState]
    }
    
    @scala.inline
    implicit class FormControlStateMutableBuilder[Self <: FormControlState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdornedStart(value: Boolean): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      @scala.inline
      def setHiddenLabel(value: Boolean): Self = StObject.set(x, "hiddenLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenLabelUndefined: Self = StObject.set(x, "hiddenLabel", js.undefined)
      
      @scala.inline
      def setMargin(value: dense | normal | none): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEmpty(value: () => Unit): Self = StObject.set(x, "onEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFilled(value: () => Unit): Self = StObject.set(x, "onFilled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
