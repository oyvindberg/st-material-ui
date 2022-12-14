package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.textareaTextareaPropsMod.TextareaOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>,   textarea :@mui/joy.@mui/joy/utils/types.SlotProps<'textarea', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>,   textarea :@mui/joy.@mui/joy/utils/types.SlotProps<'textarea', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Textarea/TextareaProps.TextareaOwnerState>}[P]} */
trait Textarea extends StObject {
  
  var endDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]
  ] = js.undefined
  
  var startDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]
  ] = js.undefined
  
  var textarea: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["textarea", js.Object, TextareaOwnerState]
  ] = js.undefined
}
object Textarea {
  
  inline def apply(): Textarea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Textarea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Textarea] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: TextareaOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TextareaOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: TextareaOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
    inline def setTextarea(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["textarea", js.Object, TextareaOwnerState]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    inline def setTextareaFunction1(
      value: TextareaOwnerState => (Omit[ComponentPropsWithRef["textarea"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "textarea", js.Any.fromFunction1(value))
    
    inline def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
  }
}
