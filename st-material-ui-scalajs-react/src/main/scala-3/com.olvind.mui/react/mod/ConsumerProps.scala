package com.olvind.mui.react.mod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerProps[T] extends StObject {
  
  def children(value: T): Node
}
object ConsumerProps {
  
  inline def apply[T](children: T => Node): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  
  extension [Self <: ConsumerProps[?], T](x: Self & ConsumerProps[T]) {
    
    inline def setChildren(value: T => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
