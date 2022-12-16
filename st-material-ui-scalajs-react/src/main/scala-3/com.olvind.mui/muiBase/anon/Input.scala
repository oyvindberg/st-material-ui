package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.inputUnstyledInputUnstyledDottypesMod.InputUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.inputUnstyledInputUnstyledDottypesMod.InputUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var input: js.UndefOr[
    SlotComponentProps["input", InputUnstyledComponentsPropsOverrides, InputUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["div", InputUnstyledComponentsPropsOverrides, InputUnstyledOwnerState]
  ] = js.undefined
}
object Input {
  
  inline def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    inline def setInput(value: SlotComponentProps["input", InputUnstyledComponentsPropsOverrides, InputUnstyledOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: InputUnstyledOwnerState => Partial[ComponentPropsWithRef["input"]] & InputUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: SlotComponentProps["div", InputUnstyledComponentsPropsOverrides, InputUnstyledOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: InputUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & InputUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
