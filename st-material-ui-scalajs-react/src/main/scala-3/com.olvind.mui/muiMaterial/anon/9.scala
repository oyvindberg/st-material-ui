package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.muiMaterial.backdropBackdropMod.BackdropTypeMap
import com.olvind.mui.muiMaterial.modalModalMod.ModalComponentsPropsOverrides
import com.olvind.mui.muiMaterial.modalModalMod.ModalOwnerState
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableComponent
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var backdrop: js.UndefOr[
    SlotComponentProps[
      OverridableComponent[BackdropTypeMap[js.Object, "div"]], 
      ModalComponentsPropsOverrides, 
      ModalOwnerState
    ]
  ] = js.undefined
  
  var root: js.UndefOr[SlotComponentProps["div", ModalComponentsPropsOverrides, ModalOwnerState]] = js.undefined
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(
      value: SlotComponentProps[
          OverridableComponent[BackdropTypeMap[js.Object, "div"]], 
          ModalComponentsPropsOverrides, 
          ModalOwnerState
        ]
    ): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropFunction1(
      value: ModalOwnerState => (com.olvind.mui.std.Partial[ComponentPropsWithRef[OverridableComponent[BackdropTypeMap[js.Object, "div"]]]]) & ModalComponentsPropsOverrides
    ): Self = StObject.set(x, "backdrop", js.Any.fromFunction1(value))
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setRoot(value: SlotComponentProps["div", ModalComponentsPropsOverrides, ModalOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ModalOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef["div"]] & ModalComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
