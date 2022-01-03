package com.olvind.mui.muiMaterial.anon

import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node[T] extends StObject {
  
  var node: HTMLInputElement = js.native
  
  var value: js.UndefOr[T] = js.native
}
object Node {
  
  @scala.inline
  def apply[T](node: HTMLInputElement): Node[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[T]]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node[_], T] (val x: Self with Node[T]) extends AnyVal {
    
    @scala.inline
    def setNode(value: HTMLInputElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
