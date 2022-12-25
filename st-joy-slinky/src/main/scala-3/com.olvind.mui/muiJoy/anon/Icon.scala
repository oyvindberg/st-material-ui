package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Radio/RadioProps.RadioOwnerState>,   radio :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Radio/RadioProps.RadioOwnerState>,   icon :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Radio/RadioProps.RadioOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Radio/RadioProps.RadioOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Radio/RadioProps.RadioOwnerState>,   label :@mui/joy.@mui/joy/utils/types.SlotProps<'label', {}, @mui/joy.@mui/joy/Radio/RadioProps.RadioOwnerState>} ]:? react.react.ElementType<any>} */
trait Icon extends StObject {
  
  var action: js.UndefOr[ReactElement] = js.undefined
  
  var icon: js.UndefOr[ReactElement] = js.undefined
  
  var input: js.UndefOr[ReactElement] = js.undefined
  
  var label: js.UndefOr[ReactElement] = js.undefined
  
  var radio: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object Icon {
  
  inline def apply(): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInput(value: ReactElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRadio(value: ReactElement): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
