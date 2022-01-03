package com.olvind.mui.muiMaterial.anon

import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node[T] extends StObject {
  
  var node: HTMLInputElement
  
  var value: js.UndefOr[T] = js.undefined
}
object Node {
  
  inline def apply[T](node: HTMLInputElement): Node[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[T]]
  }
  
  extension [Self <: Node[?], T](x: Self & Node[T]) {
    
    inline def setNode(value: HTMLInputElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
