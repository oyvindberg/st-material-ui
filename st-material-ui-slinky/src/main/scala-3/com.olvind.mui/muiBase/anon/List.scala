package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.optionGroupUnstyledOptionGroupUnstyledDottypesMod.OptionGroupUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.optionGroupUnstyledOptionGroupUnstyledDottypesMod.OptionGroupUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List extends StObject {
  
  var label: js.UndefOr[
    SlotComponentProps["span", OptionGroupUnstyledComponentsPropsOverrides, OptionGroupUnstyledOwnerState]
  ] = js.undefined
  
  var list: js.UndefOr[
    SlotComponentProps["ul", OptionGroupUnstyledComponentsPropsOverrides, OptionGroupUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["li", OptionGroupUnstyledComponentsPropsOverrides, OptionGroupUnstyledOwnerState]
  ] = js.undefined
}
object List {
  
  inline def apply(): com.olvind.mui.muiBase.anon.List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[com.olvind.mui.muiBase.anon.List]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: com.olvind.mui.muiBase.anon.List] (val x: Self) extends AnyVal {
    
    inline def setLabel(
      value: SlotComponentProps["span", OptionGroupUnstyledComponentsPropsOverrides, OptionGroupUnstyledOwnerState]
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(
      value: OptionGroupUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & OptionGroupUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setList(
      value: SlotComponentProps["ul", OptionGroupUnstyledComponentsPropsOverrides, OptionGroupUnstyledOwnerState]
    ): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListFunction1(
      value: OptionGroupUnstyledOwnerState => Partial[ComponentPropsWithRef["ul"]] & OptionGroupUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps["li", OptionGroupUnstyledComponentsPropsOverrides, OptionGroupUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: OptionGroupUnstyledOwnerState => Partial[ComponentPropsWithRef["li"]] & OptionGroupUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
