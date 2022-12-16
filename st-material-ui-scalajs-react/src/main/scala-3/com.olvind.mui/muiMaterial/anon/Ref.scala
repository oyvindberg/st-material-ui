package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[Element]] = js.undefined
}
object Ref {
  
  inline def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    inline def setRef(value: com.olvind.mui.react.mod.Ref[Element]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: Element | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Element | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
