package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   label :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {  href :string | undefined,   to :string | undefined}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>} ]:? react.react.ElementType<any>} */
trait ActionEndDecorator extends StObject {
  
  var action: js.UndefOr[ReactElement] = js.undefined
  
  var endDecorator: js.UndefOr[ReactElement] = js.undefined
  
  var label: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
  
  var startDecorator: js.UndefOr[ReactElement] = js.undefined
}
object ActionEndDecorator {
  
  inline def apply(): ActionEndDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionEndDecorator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionEndDecorator] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setEndDecorator(value: ReactElement): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: ReactElement): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
  }
}
