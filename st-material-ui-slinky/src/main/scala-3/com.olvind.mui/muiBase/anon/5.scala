package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.menuItemUnstyledMenuItemUnstyledDottypesMod.MenuItemUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.menuItemUnstyledMenuItemUnstyledDottypesMod.MenuItemUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["li", MenuItemUnstyledComponentsPropsOverrides, MenuItemUnstyledOwnerState]
  ] = js.undefined
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setRoot(
      value: SlotComponentProps["li", MenuItemUnstyledComponentsPropsOverrides, MenuItemUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: MenuItemUnstyledOwnerState => Partial[ComponentPropsWithRef["li"]] & MenuItemUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
