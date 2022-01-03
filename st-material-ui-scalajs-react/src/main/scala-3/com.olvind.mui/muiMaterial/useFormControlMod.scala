package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.dense
import com.olvind.mui.muiMaterial.muiMaterialStrings.filled
import com.olvind.mui.muiMaterial.muiMaterialStrings.none
import com.olvind.mui.muiMaterial.muiMaterialStrings.normal
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFormControlMod {
  
  @JSImport("@mui/material/FormControl/useFormControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[FormControlState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[FormControlState]]
  
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
    
    inline def disabled: com.olvind.mui.muiMaterial.muiMaterialStrings.disabled = "disabled".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.disabled]
    
    inline def error: com.olvind.mui.muiMaterial.muiMaterialStrings.error = "error".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.error]
    
    inline def fullWidth: com.olvind.mui.muiMaterial.muiMaterialStrings.fullWidth = "fullWidth".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.fullWidth]
    
    inline def hiddenLabel: com.olvind.mui.muiMaterial.muiMaterialStrings.hiddenLabel = "hiddenLabel".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.hiddenLabel]
    
    inline def margin: com.olvind.mui.muiMaterial.muiMaterialStrings.margin = "margin".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.margin]
    
    inline def required: com.olvind.mui.muiMaterial.muiMaterialStrings.required = "required".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.required]
    
    inline def variant: com.olvind.mui.muiMaterial.muiMaterialStrings.variant = "variant".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.variant]
  }
  
  /* Inlined parent std.Pick<@mui/material.@mui/material/FormControl/FormControl.FormControlProps<@mui/material.@mui/material/FormControl/FormControl.FormControlTypeMap<{}, 'div'>['defaultComponent'], {}>, @mui/material.@mui/material/FormControl/useFormControl.ContextFromPropsKey> */
  trait FormControlState extends StObject {
    
    var adornedStart: Boolean
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var filled: Boolean
    
    var focused: Boolean
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    var hiddenLabel: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[dense | normal | none] = js.undefined
    
    def onBlur(): Unit
    
    def onEmpty(): Unit
    
    def onFilled(): Unit
    
    def onFocus(): Unit
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var variant: js.UndefOr[standard | outlined | filled] = js.undefined
  }
  object FormControlState {
    
    inline def apply(
      adornedStart: Boolean,
      filled: Boolean,
      focused: Boolean,
      onBlur: Callback,
      onEmpty: Callback,
      onFilled: Callback,
      onFocus: Callback
    ): FormControlState = {
      val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onEmpty = onEmpty.toJsFn, onFilled = onFilled.toJsFn, onFocus = onFocus.toJsFn)
      __obj.asInstanceOf[FormControlState]
    }
    
    extension [Self <: FormControlState](x: Self) {
      
      inline def setAdornedStart(value: Boolean): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setHiddenLabel(value: Boolean): Self = StObject.set(x, "hiddenLabel", value.asInstanceOf[js.Any])
      
      inline def setHiddenLabelUndefined: Self = StObject.set(x, "hiddenLabel", js.undefined)
      
      inline def setMargin(value: dense | normal | none): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnEmpty(value: Callback): Self = StObject.set(x, "onEmpty", value.toJsFn)
      
      inline def setOnFilled(value: Callback): Self = StObject.set(x, "onFilled", value.toJsFn)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
