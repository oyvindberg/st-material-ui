package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.multiSelectUnstyledMultiSelectUnstyledDottypesMod.MultiSelectUnstyledPopperSlotProps
import com.olvind.mui.react.mod.ComponentType
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListboxPopper[TValue /* <: js.Object */] extends StObject {
  
  var listbox: js.UndefOr[ElementType] = js.undefined
  
  var popper: js.UndefOr[ComponentType[MultiSelectUnstyledPopperSlotProps[TValue]]] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object ListboxPopper {
  
  inline def apply[TValue /* <: js.Object */](): ListboxPopper[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListboxPopper[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListboxPopper[?], TValue /* <: js.Object */] (val x: Self & ListboxPopper[TValue]) extends AnyVal {
    
    inline def setListbox(value: ElementType): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setPopper(value: ComponentType[MultiSelectUnstyledPopperSlotProps[TValue]]): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
