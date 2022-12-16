package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.tabsUnstyledTabsUnstyledDottypesMod.TabsUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.tabsUnstyledTabsUnstyledDottypesMod.TabsUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["div", TabsUnstyledComponentsPropsOverrides, TabsUnstyledOwnerState]
  ] = js.undefined
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `15`] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: SlotComponentProps["div", TabsUnstyledComponentsPropsOverrides, TabsUnstyledOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TabsUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & TabsUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
