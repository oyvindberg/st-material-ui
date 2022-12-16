package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.optionUnstyledOptionUnstyledDottypesMod.OptionUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.optionUnstyledOptionUnstyledDottypesMod.OptionUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10`[TValue] extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["li", OptionUnstyledComponentsPropsOverrides, OptionUnstyledOwnerState[TValue]]
  ] = js.undefined
}
object `10` {
  
  inline def apply[TValue](): `10`[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`10`[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `10`[?], TValue] (val x: Self & `10`[TValue]) extends AnyVal {
    
    inline def setRoot(
      value: SlotComponentProps["li", OptionUnstyledComponentsPropsOverrides, OptionUnstyledOwnerState[TValue]]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: OptionUnstyledOwnerState[TValue] => Partial[ComponentPropsWithRef["li"]] & OptionUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
