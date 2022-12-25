package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.chipChipPropsMod.ChipOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelRoot extends StObject {
  
  var action: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", Href, ChipOwnerState]
  
  var endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]
  
  var label: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ChipOwnerState]
  
  var startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]
}
object LabelRoot {
  
  inline def apply(
    action: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", Href, ChipOwnerState],
    endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState],
    label: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ChipOwnerState],
    startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]
  ): LabelRoot = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelRoot] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", Href, ChipOwnerState]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["button"], "color"]) & Href & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setLabel(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ChipOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
  }
}
