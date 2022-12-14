package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledMod.PopperUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledMod.PopperUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["div", PopperUnstyledComponentsPropsOverrides, PopperUnstyledOwnerState]
  ] = js.undefined
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setRoot(value: SlotComponentProps["div", PopperUnstyledComponentsPropsOverrides, PopperUnstyledOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: PopperUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & PopperUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
