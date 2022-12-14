package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRef extends StObject {
  
  var component: js.UndefOr[ElementType] = js.undefined
  
  var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[Any]] = js.undefined
}
object ComponentRef {
  
  inline def apply(): ComponentRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentRef] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
