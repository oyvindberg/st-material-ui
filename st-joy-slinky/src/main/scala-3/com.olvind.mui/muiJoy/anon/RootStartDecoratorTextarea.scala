package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.textareaTextareaPropsMod.TextareaOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootStartDecoratorTextarea extends StObject {
  
  var endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]
  
  var startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]
  
  var textarea: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["textarea", js.Object, TextareaOwnerState]
}
object RootStartDecoratorTextarea {
  
  inline def apply(
    endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState],
    startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState],
    textarea: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["textarea", js.Object, TextareaOwnerState]
  ): RootStartDecoratorTextarea = {
    val __obj = js.Dynamic.literal(endDecorator = endDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootStartDecoratorTextarea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootStartDecoratorTextarea] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: TextareaOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TextareaOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, TextareaOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: TextareaOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setTextarea(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["textarea", js.Object, TextareaOwnerState]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    inline def setTextareaFunction1(
      value: TextareaOwnerState => (Omit[ComponentPropsWithRef["textarea"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "textarea", js.Any.fromFunction1(value))
  }
}
