package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.checkboxCheckboxPropsMod.CheckboxOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   checkbox :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   label :@mui/joy.@mui/joy/utils/types.SlotProps<'label', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   checkbox :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   label :@mui/joy.@mui/joy/utils/types.SlotProps<'label', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>}[P]} */
trait Checkbox extends StObject {
  
  var action: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]
  ] = js.undefined
  
  var checkbox: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]
  ] = js.undefined
  
  var input: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, CheckboxOwnerState]
  ] = js.undefined
  
  var label: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, CheckboxOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]
  ] = js.undefined
}
object Checkbox {
  
  inline def apply(): Checkbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checkbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkbox] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCheckbox(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "checkbox", js.Any.fromFunction1(value))
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    inline def setInput(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["input"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLabel(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["label"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
