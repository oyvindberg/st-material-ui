package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   thumb :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   track :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>} ]:? react.react.ElementType<any>} */
trait StartDecoratorThumb extends StObject {
  
  var action: js.UndefOr[ElementType] = js.undefined
  
  var endDecorator: js.UndefOr[ElementType] = js.undefined
  
  var input: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
  
  var startDecorator: js.UndefOr[ElementType] = js.undefined
  
  var thumb: js.UndefOr[ElementType] = js.undefined
  
  var track: js.UndefOr[ElementType] = js.undefined
}
object StartDecoratorThumb {
  
  inline def apply(): StartDecoratorThumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDecoratorThumb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDecoratorThumb] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ElementType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setEndDecorator(value: ElementType): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setInput(value: ElementType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: ElementType): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
    inline def setThumb(value: ElementType): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: ElementType): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
