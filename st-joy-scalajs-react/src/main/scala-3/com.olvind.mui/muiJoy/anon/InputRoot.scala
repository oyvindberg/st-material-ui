package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.inputInputPropsMod.InputOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputRoot extends StObject {
  
  var endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState]
  
  var input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, InputOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, InputOwnerState]
  
  var startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState]
}
object InputRoot {
  
  inline def apply(
    endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState],
    input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, InputOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, InputOwnerState],
    startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState]
  ): InputRoot = {
    val __obj = js.Dynamic.literal(endDecorator = endDecorator.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputRoot] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: InputOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setInput(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, InputOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: InputOwnerState => (Omit[ComponentPropsWithRef["input"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, InputOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: InputOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, InputOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: InputOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
  }
}
