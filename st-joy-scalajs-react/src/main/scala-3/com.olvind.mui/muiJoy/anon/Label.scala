package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.checkboxCheckboxPropsMod.CheckboxOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var action: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]
  
  var checkbox: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]
  
  var input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, CheckboxOwnerState]
  
  var label: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, CheckboxOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]
}
object Label {
  
  inline def apply(
    action: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState],
    checkbox: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState],
    input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, CheckboxOwnerState],
    label: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, CheckboxOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]
  ): Label = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setCheckbox(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "checkbox", js.Any.fromFunction1(value))
    
    inline def setInput(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["input"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setLabel(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["label"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CheckboxOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: CheckboxOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
  }
}
