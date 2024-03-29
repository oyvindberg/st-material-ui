package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledListboxSlotPropsOverrides
import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledOwnerState
import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledDottypesMod.PopperUnstyledTypeMap
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.muiTypes.mod.OverridableComponent
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listbox extends StObject {
  
  var listbox: js.UndefOr[
    SlotComponentProps["ul", MenuUnstyledListboxSlotPropsOverrides, MenuUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps[
      OverridableComponent[PopperUnstyledTypeMap[js.Object, "div"]], 
      MenuUnstyledRootSlotPropsOverrides, 
      MenuUnstyledOwnerState
    ]
  ] = js.undefined
}
object Listbox {
  
  inline def apply(): Listbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Listbox] (val x: Self) extends AnyVal {
    
    inline def setListbox(value: SlotComponentProps["ul", MenuUnstyledListboxSlotPropsOverrides, MenuUnstyledOwnerState]): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxFunction1(
      value: MenuUnstyledOwnerState => Partial[ComponentPropsWithRef["ul"]] & MenuUnstyledListboxSlotPropsOverrides
    ): Self = StObject.set(x, "listbox", js.Any.fromFunction1(value))
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps[
          OverridableComponent[PopperUnstyledTypeMap[js.Object, "div"]], 
          MenuUnstyledRootSlotPropsOverrides, 
          MenuUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: MenuUnstyledOwnerState => (Partial[
          ComponentPropsWithRef[OverridableComponent[PopperUnstyledTypeMap[js.Object, "div"]]]
        ]) & MenuUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
