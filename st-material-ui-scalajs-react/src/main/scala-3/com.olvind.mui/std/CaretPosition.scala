package com.olvind.mui.std

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaretPosition extends StObject {
  
  /* standard dom */
  def getClientRect(): DOMRect | Null
  
  /* standard dom */
  val offset: Double
  
  /* standard dom */
  val offsetNode: org.scalajs.dom.Node
}
object CaretPosition {
  
  inline def apply(getClientRect: CallbackTo[DOMRect | Null], offset: Double, offsetNode: org.scalajs.dom.Node): CaretPosition = {
    val __obj = js.Dynamic.literal(getClientRect = getClientRect.toJsFn, offset = offset.asInstanceOf[js.Any], offsetNode = offsetNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaretPosition]
  }
  
  extension [Self <: CaretPosition](x: Self) {
    
    inline def setGetClientRect(value: CallbackTo[DOMRect | Null]): Self = StObject.set(x, "getClientRect", value.toJsFn)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNode(value: org.scalajs.dom.Node): Self = StObject.set(x, "offsetNode", value.asInstanceOf[js.Any])
  }
}
