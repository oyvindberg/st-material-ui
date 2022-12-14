package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledListboxSlotPropsOverrides
import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledOwnerState
import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledPopperSlotPropsOverrides
import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Popper[TValue /* <: js.Object */, Multiple /* <: Boolean */] extends StObject {
  
  var listbox: js.UndefOr[
    SlotComponentProps[
      "ul", 
      SelectUnstyledListboxSlotPropsOverrides, 
      SelectUnstyledOwnerState[TValue, Multiple]
    ]
  ] = js.undefined
  
  var popper: js.UndefOr[
    SlotComponentProps[
      js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
      SelectUnstyledPopperSlotPropsOverrides, 
      SelectUnstyledOwnerState[TValue, Multiple]
    ]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps[
      "button", 
      SelectUnstyledRootSlotPropsOverrides, 
      SelectUnstyledOwnerState[TValue, Multiple]
    ]
  ] = js.undefined
}
object Popper {
  
  inline def apply[TValue /* <: js.Object */, Multiple /* <: Boolean */](): Popper[TValue, Multiple] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Popper[TValue, Multiple]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Popper[?, ?], TValue /* <: js.Object */, Multiple /* <: Boolean */] (val x: Self & (Popper[TValue, Multiple])) extends AnyVal {
    
    inline def setListbox(
      value: SlotComponentProps[
          "ul", 
          SelectUnstyledListboxSlotPropsOverrides, 
          SelectUnstyledOwnerState[TValue, Multiple]
        ]
    ): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxFunction1(
      value: SelectUnstyledOwnerState[TValue, Multiple] => Partial[ComponentPropsWithRef["ul"]] & SelectUnstyledListboxSlotPropsOverrides
    ): Self = StObject.set(x, "listbox", js.Any.fromFunction1(value))
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setPopper(
      value: SlotComponentProps[
          js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null], 
          SelectUnstyledPopperSlotPropsOverrides, 
          SelectUnstyledOwnerState[TValue, Multiple]
        ]
    ): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperFunction1(
      value: SelectUnstyledOwnerState[TValue, Multiple] => (Partial[
          ComponentPropsWithRef[
            js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null]
          ]
        ]) & SelectUnstyledPopperSlotPropsOverrides
    ): Self = StObject.set(x, "popper", js.Any.fromFunction1(value))
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps[
          "button", 
          SelectUnstyledRootSlotPropsOverrides, 
          SelectUnstyledOwnerState[TValue, Multiple]
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SelectUnstyledOwnerState[TValue, Multiple] => Partial[ComponentPropsWithRef["button"]] & SelectUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
