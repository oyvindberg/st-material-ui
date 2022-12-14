package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var listbox: js.UndefOr[
    SlotComponentProps["ul", MenuUnstyledComponentsPropsOverrides, MenuUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps[
      js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
      MenuUnstyledComponentsPropsOverrides, 
      MenuUnstyledOwnerState
    ]
  ] = js.undefined
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setListbox(value: SlotComponentProps["ul", MenuUnstyledComponentsPropsOverrides, MenuUnstyledOwnerState]): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxFunction1(
      value: MenuUnstyledOwnerState => Partial[ComponentPropsWithRef["ul"]] & MenuUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "listbox", js.Any.fromFunction1(value))
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps[
          js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
          MenuUnstyledComponentsPropsOverrides, 
          MenuUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: MenuUnstyledOwnerState => (Partial[
          ComponentPropsWithRef[
            js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null]
          ]
        ]) & MenuUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
