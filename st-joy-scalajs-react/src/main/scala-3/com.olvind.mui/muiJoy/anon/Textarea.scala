package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>,   textarea :@mui/joy.@mui/joy/utils/types.SlotProps<'textarea', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>} ]:? react.react.ElementType<any>} */
trait Textarea extends StObject {
  
  var endDecorator: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
  
  var startDecorator: js.UndefOr[ElementType] = js.undefined
  
  var textarea: js.UndefOr[ElementType] = js.undefined
}
object Textarea {
  
  inline def apply(): Textarea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Textarea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Textarea] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: ElementType): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: ElementType): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
    inline def setTextarea(value: ElementType): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    inline def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
  }
}
