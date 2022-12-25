package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.inputInputPropsMod.InputOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Input/InputProps.InputOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Input/InputProps.InputOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Input/InputProps.InputOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Input/InputProps.InputOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Input/InputProps.InputOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Input/InputProps.InputOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Input/InputProps.InputOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Input/InputProps.InputOwnerState>}[P]} */
trait InputRoot extends StObject {
  
  var endDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState]
  ] = js.undefined
  
  var input: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, InputOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, InputOwnerState]] = js.undefined
  
  var startDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState]
  ] = js.undefined
}
object InputRoot {
  
  inline def apply(): InputRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputRoot] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: InputOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setInput(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, InputOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: InputOwnerState => (Omit[ComponentPropsWithRef["input"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, InputOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: InputOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: InputOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
  }
}
