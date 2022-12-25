package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   checkbox :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>,   label :@mui/joy.@mui/joy/utils/types.SlotProps<'label', {}, @mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxOwnerState>} ]:? react.react.ElementType<any>} */
trait Checkbox extends StObject {
  
  var action: js.UndefOr[ReactElement] = js.undefined
  
  var checkbox: js.UndefOr[ReactElement] = js.undefined
  
  var input: js.UndefOr[ReactElement] = js.undefined
  
  var label: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object Checkbox {
  
  inline def apply(): Checkbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checkbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkbox] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCheckbox(value: ReactElement): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    inline def setInput(value: ReactElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
