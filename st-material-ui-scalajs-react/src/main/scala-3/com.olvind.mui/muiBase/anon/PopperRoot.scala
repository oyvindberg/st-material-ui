package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopperRoot[TValue /* <: js.Object */] extends StObject {
  
  var listbox: js.UndefOr[
    SlotComponentProps["button", SelectUnstyledComponentsPropsOverrides, SelectUnstyledOwnerState[TValue]]
  ] = js.undefined
  
  var popper: js.UndefOr[
    SlotComponentProps[
      js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
      SelectUnstyledComponentsPropsOverrides, 
      SelectUnstyledOwnerState[TValue]
    ]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["button", SelectUnstyledComponentsPropsOverrides, SelectUnstyledOwnerState[TValue]]
  ] = js.undefined
}
object PopperRoot {
  
  inline def apply[TValue /* <: js.Object */](): PopperRoot[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopperRoot[TValue]]
  }
  
  extension [Self <: PopperRoot[?], TValue /* <: js.Object */](x: Self & PopperRoot[TValue]) {
    
    inline def setListbox(
      value: SlotComponentProps["button", SelectUnstyledComponentsPropsOverrides, SelectUnstyledOwnerState[TValue]]
    ): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxFunction1(
      value: SelectUnstyledOwnerState[TValue] => Partial[ComponentPropsWithRef["button"]] & SelectUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "listbox", js.Any.fromFunction1(value))
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setPopper(
      value: SlotComponentProps[
          js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
          SelectUnstyledComponentsPropsOverrides, 
          SelectUnstyledOwnerState[TValue]
        ]
    ): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperFunction1(
      value: SelectUnstyledOwnerState[TValue] => (Partial[
          ComponentPropsWithRef[
            js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null]
          ]
        ]) & SelectUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "popper", js.Any.fromFunction1(value))
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps["button", SelectUnstyledComponentsPropsOverrides, SelectUnstyledOwnerState[TValue]]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SelectUnstyledOwnerState[TValue] => Partial[ComponentPropsWithRef["button"]] & SelectUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
