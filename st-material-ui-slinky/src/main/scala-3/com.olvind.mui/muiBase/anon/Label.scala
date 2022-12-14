package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.optionGroupUnstyledOptionGroupUnstyledDottypesMod.OptionGroupUnstyledLabelSlotPropsOverrides
import com.olvind.mui.muiBase.optionGroupUnstyledOptionGroupUnstyledDottypesMod.OptionGroupUnstyledListSlotPropsOverrides
import com.olvind.mui.muiBase.optionGroupUnstyledOptionGroupUnstyledDottypesMod.OptionGroupUnstyledOwnerState
import com.olvind.mui.muiBase.optionGroupUnstyledOptionGroupUnstyledDottypesMod.OptionGroupUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var label: js.UndefOr[
    SlotComponentProps["span", OptionGroupUnstyledLabelSlotPropsOverrides, OptionGroupUnstyledOwnerState]
  ] = js.undefined
  
  var list: js.UndefOr[
    SlotComponentProps["ul", OptionGroupUnstyledListSlotPropsOverrides, OptionGroupUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["li", OptionGroupUnstyledRootSlotPropsOverrides, OptionGroupUnstyledOwnerState]
  ] = js.undefined
}
object Label {
  
  inline def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    inline def setLabel(
      value: SlotComponentProps["span", OptionGroupUnstyledLabelSlotPropsOverrides, OptionGroupUnstyledOwnerState]
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(
      value: OptionGroupUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & OptionGroupUnstyledLabelSlotPropsOverrides
    ): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setList(
      value: SlotComponentProps["ul", OptionGroupUnstyledListSlotPropsOverrides, OptionGroupUnstyledOwnerState]
    ): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListFunction1(
      value: OptionGroupUnstyledOwnerState => Partial[ComponentPropsWithRef["ul"]] & OptionGroupUnstyledListSlotPropsOverrides
    ): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps["li", OptionGroupUnstyledRootSlotPropsOverrides, OptionGroupUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: OptionGroupUnstyledOwnerState => Partial[ComponentPropsWithRef["li"]] & OptionGroupUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
