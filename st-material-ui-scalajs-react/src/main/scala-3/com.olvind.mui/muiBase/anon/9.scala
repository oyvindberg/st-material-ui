package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.tabUnstyledTabUnstyledDottypesMod.TabUnstyledOwnerState
import com.olvind.mui.muiBase.tabUnstyledTabUnstyledDottypesMod.TabUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["button", TabUnstyledRootSlotPropsOverrides, TabUnstyledOwnerState]
  ] = js.undefined
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: SlotComponentProps["button", TabUnstyledRootSlotPropsOverrides, TabUnstyledOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TabUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & TabUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
