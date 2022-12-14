package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.menuItemUnstyledMenuItemUnstyledDottypesMod.MenuItemUnstyledOwnerState
import com.olvind.mui.muiBase.menuItemUnstyledMenuItemUnstyledDottypesMod.MenuItemUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["li", MenuItemUnstyledRootSlotPropsOverrides, MenuItemUnstyledOwnerState]
  ] = js.undefined
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setRoot(
      value: SlotComponentProps["li", MenuItemUnstyledRootSlotPropsOverrides, MenuItemUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: MenuItemUnstyledOwnerState => Partial[ComponentPropsWithRef["li"]] & MenuItemUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
