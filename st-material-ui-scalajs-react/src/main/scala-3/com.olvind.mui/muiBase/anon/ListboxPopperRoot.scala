package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledPopperSlotProps
import com.olvind.mui.react.mod.ComponentType
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListboxPopperRoot[TValue /* <: js.Object */] extends StObject {
  
  var listbox: js.UndefOr[ElementType] = js.undefined
  
  var popper: js.UndefOr[ComponentType[SelectUnstyledPopperSlotProps[TValue]]] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object ListboxPopperRoot {
  
  inline def apply[TValue /* <: js.Object */](): ListboxPopperRoot[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListboxPopperRoot[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListboxPopperRoot[?], TValue /* <: js.Object */] (val x: Self & ListboxPopperRoot[TValue]) extends AnyVal {
    
    inline def setListbox(value: ElementType): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setPopper(value: ComponentType[SelectUnstyledPopperSlotProps[TValue]]): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
