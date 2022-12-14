package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.optionUnstyledOptionUnstyledDottypesMod.OptionUnstyledOwnerState
import com.olvind.mui.muiBase.optionUnstyledOptionUnstyledDottypesMod.OptionUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[TValue] extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["li", OptionUnstyledRootSlotPropsOverrides, OptionUnstyledOwnerState[TValue]]
  ] = js.undefined
}
object `7` {
  
  inline def apply[TValue](): `7`[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`[?], TValue] (val x: Self & `7`[TValue]) extends AnyVal {
    
    inline def setRoot(
      value: SlotComponentProps["li", OptionUnstyledRootSlotPropsOverrides, OptionUnstyledOwnerState[TValue]]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: OptionUnstyledOwnerState[TValue] => Partial[ComponentPropsWithRef["li"]] & OptionUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
