package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.modalUnstyledModalUnstyledDottypesMod.ModalUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.modalUnstyledModalUnstyledDottypesMod.ModalUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backdrop extends StObject {
  
  var backdrop: js.UndefOr[
    SlotComponentProps["div", ModalUnstyledComponentsPropsOverrides, ModalUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["div", ModalUnstyledComponentsPropsOverrides, ModalUnstyledOwnerState]
  ] = js.undefined
}
object Backdrop {
  
  inline def apply(): Backdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backdrop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backdrop] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: SlotComponentProps["div", ModalUnstyledComponentsPropsOverrides, ModalUnstyledOwnerState]): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropFunction1(
      value: ModalUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & ModalUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "backdrop", js.Any.fromFunction1(value))
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setRoot(value: SlotComponentProps["div", ModalUnstyledComponentsPropsOverrides, ModalUnstyledOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ModalUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & ModalUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
