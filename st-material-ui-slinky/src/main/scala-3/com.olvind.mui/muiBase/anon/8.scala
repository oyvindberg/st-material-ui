package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.tabPanelUnstyledTabPanelUnstyledDottypesMod.TabPanelUnstyledOwnerState
import com.olvind.mui.muiBase.tabPanelUnstyledTabPanelUnstyledDottypesMod.TabPanelUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["div", TabPanelUnstyledRootSlotPropsOverrides, TabPanelUnstyledOwnerState]
  ] = js.undefined
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`] (val x: Self) extends AnyVal {
    
    inline def setRoot(
      value: SlotComponentProps["div", TabPanelUnstyledRootSlotPropsOverrides, TabPanelUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TabPanelUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & TabPanelUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
