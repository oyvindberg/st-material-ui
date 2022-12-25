package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameOwnerState[OwnerState /* <: js.Object */, SlotOwnerState /* <: js.Object */] extends StObject {
  
  var className: String
  
  var ownerState: OwnerState & SlotOwnerState
}
object ClassNameOwnerState {
  
  inline def apply[OwnerState /* <: js.Object */, SlotOwnerState /* <: js.Object */](className: String, ownerState: OwnerState & SlotOwnerState): ClassNameOwnerState[OwnerState, SlotOwnerState] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ownerState = ownerState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameOwnerState[OwnerState, SlotOwnerState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassNameOwnerState[?, ?], OwnerState /* <: js.Object */, SlotOwnerState /* <: js.Object */] (val x: Self & (ClassNameOwnerState[OwnerState, SlotOwnerState])) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setOwnerState(value: OwnerState & SlotOwnerState): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
  }
}
