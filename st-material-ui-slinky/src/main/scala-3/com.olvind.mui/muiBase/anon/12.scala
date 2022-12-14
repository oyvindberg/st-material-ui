package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.tabUnstyledTabUnstyledDottypesMod.TabUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.tabUnstyledTabUnstyledDottypesMod.TabUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["div", TabUnstyledComponentsPropsOverrides, TabUnstyledOwnerState]
  ] = js.undefined
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setRoot(value: SlotComponentProps["div", TabUnstyledComponentsPropsOverrides, TabUnstyledOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TabUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & TabUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
