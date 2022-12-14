package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledListboxSlotPropsOverrides
import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledOwnerState
import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListboxRoot extends StObject {
  
  var listbox: js.UndefOr[
    SlotComponentProps["ul", MenuUnstyledListboxSlotPropsOverrides, MenuUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps[
      js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
      MenuUnstyledRootSlotPropsOverrides, 
      MenuUnstyledOwnerState
    ]
  ] = js.undefined
}
object ListboxRoot {
  
  inline def apply(): ListboxRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListboxRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListboxRoot] (val x: Self) extends AnyVal {
    
    inline def setListbox(value: SlotComponentProps["ul", MenuUnstyledListboxSlotPropsOverrides, MenuUnstyledOwnerState]): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxFunction1(
      value: MenuUnstyledOwnerState => Partial[ComponentPropsWithRef["ul"]] & MenuUnstyledListboxSlotPropsOverrides
    ): Self = StObject.set(x, "listbox", js.Any.fromFunction1(value))
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps[
          js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
          MenuUnstyledRootSlotPropsOverrides, 
          MenuUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: MenuUnstyledOwnerState => (Partial[
          ComponentPropsWithRef[
            js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null]
          ]
        ]) & MenuUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
