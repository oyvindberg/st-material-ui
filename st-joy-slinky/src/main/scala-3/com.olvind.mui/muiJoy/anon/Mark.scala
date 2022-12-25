package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   track :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   rail :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   thumb :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   mark :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState & {  percent :number | undefined}>,   markLabel :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   valueLabel :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>} ]:? react.react.ElementType<any>} */
trait Mark extends StObject {
  
  var input: js.UndefOr[ReactElement] = js.undefined
  
  var mark: js.UndefOr[ReactElement] = js.undefined
  
  var markLabel: js.UndefOr[ReactElement] = js.undefined
  
  var rail: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
  
  var thumb: js.UndefOr[ReactElement] = js.undefined
  
  var track: js.UndefOr[ReactElement] = js.undefined
  
  var valueLabel: js.UndefOr[ReactElement] = js.undefined
}
object Mark {
  
  inline def apply(): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
    
    inline def setInput(value: ReactElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMark(value: ReactElement): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkLabel(value: ReactElement): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
    
    inline def setMarkLabelUndefined: Self = StObject.set(x, "markLabel", js.undefined)
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setRail(value: ReactElement): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: ReactElement): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValueLabel(value: ReactElement): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    inline def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
  }
}
