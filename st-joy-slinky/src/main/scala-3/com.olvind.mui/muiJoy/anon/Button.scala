package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.selectSelectPropsMod.SelectOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  var button: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", js.Object, SelectOwnerState[Any]]
  
  var endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]
  
  var indicator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]
  
  var listbox: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ul", OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl, SelectOwnerState[Any]]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SelectOwnerState[Any]]
  
  var startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]
}
object Button {
  
  inline def apply(
    button: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", js.Object, SelectOwnerState[Any]],
    endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]],
    indicator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]],
    listbox: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ul", OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl, SelectOwnerState[Any]],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SelectOwnerState[Any]],
    startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]
  ): Button = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], listbox = listbox.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    inline def setButton(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["button"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "button", js.Any.fromFunction1(value))
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setIndicator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "indicator", js.Any.fromFunction1(value))
    
    inline def setListbox(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ul", OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl, SelectOwnerState[Any]]
    ): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["ul"], "color"]) & OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "listbox", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
  }
}
