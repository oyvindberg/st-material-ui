package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.tabsListUnstyledTabsListUnstyledDottypesMod.TabsListUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.tabsListUnstyledTabsListUnstyledDottypesMod.TabsListUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["div", TabsListUnstyledComponentsPropsOverrides, TabsListUnstyledOwnerState]
  ] = js.undefined
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setRoot(
      value: SlotComponentProps["div", TabsListUnstyledComponentsPropsOverrides, TabsListUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TabsListUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & TabsListUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
