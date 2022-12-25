package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.radioRadioPropsMod.RadioOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionIcon extends StObject {
  
  var action: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState]
  
  var icon: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState]
  
  var input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, RadioOwnerState]
  
  var label: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, RadioOwnerState]
  
  var radio: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState]
}
object ActionIcon {
  
  inline def apply(
    action: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState],
    icon: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState],
    input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, RadioOwnerState],
    label: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, RadioOwnerState],
    radio: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState]
  ): ActionIcon = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionIcon] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(
      value: RadioOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setIcon(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(
      value: RadioOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setInput(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, RadioOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: RadioOwnerState => (Omit[ComponentPropsWithRef["input"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setLabel(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, RadioOwnerState]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(
      value: RadioOwnerState => (Omit[ComponentPropsWithRef["label"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setRadio(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState]): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setRadioFunction1(
      value: RadioOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "radio", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, RadioOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: RadioOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
  }
}
