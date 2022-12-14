package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.buttonUnstyledButtonUnstyledDottypesMod.ButtonUnstyledOwnerState
import com.olvind.mui.muiBase.buttonUnstyledButtonUnstyledDottypesMod.ButtonUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["button", ButtonUnstyledRootSlotPropsOverrides, ButtonUnstyledOwnerState]
  ] = js.undefined
}
object Root {
  
  inline def apply(): Root = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Root]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
    
    inline def setRoot(
      value: SlotComponentProps["button", ButtonUnstyledRootSlotPropsOverrides, ButtonUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ButtonUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & ButtonUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
