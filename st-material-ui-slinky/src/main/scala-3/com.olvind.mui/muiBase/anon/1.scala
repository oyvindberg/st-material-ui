package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.FormControlUnstyledOwnerState
import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.FormControlUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["div", FormControlUnstyledRootSlotPropsOverrides, FormControlUnstyledOwnerState]
  ] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setRoot(
      value: SlotComponentProps["div", FormControlUnstyledRootSlotPropsOverrides, FormControlUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: FormControlUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & FormControlUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
