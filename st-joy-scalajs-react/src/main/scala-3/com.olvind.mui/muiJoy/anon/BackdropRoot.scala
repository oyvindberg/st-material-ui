package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.modalModalPropsMod.ModalOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackdropRoot extends StObject {
  
  var backdrop: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ModalOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ModalOwnerState]
}
object BackdropRoot {
  
  inline def apply(
    backdrop: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ModalOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ModalOwnerState]
  ): BackdropRoot = {
    val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackdropRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackdropRoot] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ModalOwnerState]): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropFunction1(
      value: ModalOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "backdrop", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ModalOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ModalOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
  }
}
