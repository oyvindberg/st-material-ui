package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   button :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   indicator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   listbox :@mui/joy.@mui/joy/utils/types.SlotProps<'ul', {} & Omit<PopperUnstyledOwnProps, 'slots' | 'slotProps' | 'open'>, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>} ]:? react.react.ElementType<any>} */
trait Indicator extends StObject {
  
  var button: js.UndefOr[ElementType] = js.undefined
  
  var endDecorator: js.UndefOr[ElementType] = js.undefined
  
  var indicator: js.UndefOr[ElementType] = js.undefined
  
  var listbox: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
  
  var startDecorator: js.UndefOr[ElementType] = js.undefined
}
object Indicator {
  
  inline def apply(): Indicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indicator] (val x: Self) extends AnyVal {
    
    inline def setButton(value: ElementType): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setEndDecorator(value: ElementType): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setIndicator(value: ElementType): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    inline def setListbox(value: ElementType): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: ElementType): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
  }
}
