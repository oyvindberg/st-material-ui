package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.multiSelectUnstyledMultiSelectUnstyledDottypesMod.MultiSelectUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.multiSelectUnstyledMultiSelectUnstyledDottypesMod.MultiSelectUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Popper[TValue /* <: js.Object */] extends StObject {
  
  var listbox: js.UndefOr[
    SlotComponentProps[
      "button", 
      MultiSelectUnstyledComponentsPropsOverrides, 
      MultiSelectUnstyledOwnerState[TValue]
    ]
  ] = js.undefined
  
  var popper: js.UndefOr[
    SlotComponentProps[
      js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
      MultiSelectUnstyledComponentsPropsOverrides, 
      MultiSelectUnstyledOwnerState[TValue]
    ]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps[
      "button", 
      MultiSelectUnstyledComponentsPropsOverrides, 
      MultiSelectUnstyledOwnerState[TValue]
    ]
  ] = js.undefined
}
object Popper {
  
  inline def apply[TValue /* <: js.Object */](): Popper[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Popper[TValue]]
  }
  
  extension [Self <: Popper[?], TValue /* <: js.Object */](x: Self & Popper[TValue]) {
    
    inline def setListbox(
      value: SlotComponentProps[
          "button", 
          MultiSelectUnstyledComponentsPropsOverrides, 
          MultiSelectUnstyledOwnerState[TValue]
        ]
    ): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxFunction1(
      value: MultiSelectUnstyledOwnerState[TValue] => Partial[ComponentPropsWithRef["button"]] & MultiSelectUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "listbox", js.Any.fromFunction1(value))
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setPopper(
      value: SlotComponentProps[
          js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
          MultiSelectUnstyledComponentsPropsOverrides, 
          MultiSelectUnstyledOwnerState[TValue]
        ]
    ): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperFunction1(
      value: MultiSelectUnstyledOwnerState[TValue] => (Partial[
          ComponentPropsWithRef[
            js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null]
          ]
        ]) & MultiSelectUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "popper", js.Any.fromFunction1(value))
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps[
          "button", 
          MultiSelectUnstyledComponentsPropsOverrides, 
          MultiSelectUnstyledOwnerState[TValue]
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: MultiSelectUnstyledOwnerState[TValue] => Partial[ComponentPropsWithRef["button"]] & MultiSelectUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
