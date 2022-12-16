package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.tabPanelUnstyledTabPanelUnstyledDottypesMod.TabPanelUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.tabPanelUnstyledTabPanelUnstyledDottypesMod.TabPanelUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["div", TabPanelUnstyledComponentsPropsOverrides, TabPanelUnstyledOwnerState]
  ] = js.undefined
}
object `11` {
  
  inline def apply(): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `11`] (val x: Self) extends AnyVal {
    
    inline def setRoot(
      value: SlotComponentProps["div", TabPanelUnstyledComponentsPropsOverrides, TabPanelUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TabPanelUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & TabPanelUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
