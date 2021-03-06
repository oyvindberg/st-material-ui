package com.olvind.mui.react.mod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerProps[T] extends StObject {
  
  def children(value: T): Node = js.native
}
object ConsumerProps {
  
  @scala.inline
  def apply[T](children: T => Node): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  
  @scala.inline
  implicit class ConsumerPropsMutableBuilder[Self <: ConsumerProps[_], T] (val x: Self with ConsumerProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: T => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
