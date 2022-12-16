package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.FormControlUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.FormControlUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var root: js.UndefOr[
    SlotComponentProps["div", FormControlUnstyledComponentsPropsOverrides, FormControlUnstyledOwnerState]
  ] = js.undefined
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setRoot(
      value: SlotComponentProps["div", FormControlUnstyledComponentsPropsOverrides, FormControlUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: FormControlUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & FormControlUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
