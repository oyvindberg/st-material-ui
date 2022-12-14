package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.selectSelectPropsMod.SelectOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   button :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   indicator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   listbox :@mui/joy.@mui/joy/utils/types.SlotProps<'ul', {} & Omit<PopperUnstyledOwnProps, 'slots' | 'slotProps' | 'open'>, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   button :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   indicator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>,   listbox :@mui/joy.@mui/joy/utils/types.SlotProps<'ul', {} & Omit<PopperUnstyledOwnProps, 'slots' | 'slotProps' | 'open'>, @mui/joy.@mui/joy/Select/SelectProps.SelectOwnerState<any>>}[P]} */
trait Indicator extends StObject {
  
  var button: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", js.Object, SelectOwnerState[Any]]
  ] = js.undefined
  
  var endDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]
  ] = js.undefined
  
  var indicator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]
  ] = js.undefined
  
  var listbox: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ul", OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl, SelectOwnerState[Any]]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SelectOwnerState[Any]]
  ] = js.undefined
  
  var startDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]
  ] = js.undefined
}
object Indicator {
  
  inline def apply(): Indicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indicator] (val x: Self) extends AnyVal {
    
    inline def setButton(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["button"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "button", js.Any.fromFunction1(value))
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setIndicator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "indicator", js.Any.fromFunction1(value))
    
    inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    inline def setListbox(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ul", OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl, SelectOwnerState[Any]]
    ): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["ul"], "color"]) & OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "listbox", js.Any.fromFunction1(value))
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SelectOwnerState[Any]]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: SelectOwnerState[Any] => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
  }
}
