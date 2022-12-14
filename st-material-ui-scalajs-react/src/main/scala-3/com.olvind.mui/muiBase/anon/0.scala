package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.buttonUnstyledButtonUnstyledDottypesMod.ButtonUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.buttonUnstyledButtonUnstyledDottypesMod.ButtonUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["button", ButtonUnstyledComponentsPropsOverrides, ButtonUnstyledOwnerState]
  ] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setRoot(
      value: SlotComponentProps["button", ButtonUnstyledComponentsPropsOverrides, ButtonUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ButtonUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & ButtonUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
