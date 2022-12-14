package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledPopperSlotProps
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListboxPopperRoot[TValue /* <: js.Object */] extends StObject {
  
  var listbox: js.UndefOr[ReactElement] = js.undefined
  
  var popper: js.UndefOr[ReactComponentClass[SelectUnstyledPopperSlotProps[TValue]]] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object ListboxPopperRoot {
  
  inline def apply[TValue /* <: js.Object */](): ListboxPopperRoot[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListboxPopperRoot[TValue]]
  }
  
  extension [Self <: ListboxPopperRoot[?], TValue /* <: js.Object */](x: Self & ListboxPopperRoot[TValue]) {
    
    inline def setListbox(value: ReactElement): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setPopper(value: ReactComponentClass[SelectUnstyledPopperSlotProps[TValue]]): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
