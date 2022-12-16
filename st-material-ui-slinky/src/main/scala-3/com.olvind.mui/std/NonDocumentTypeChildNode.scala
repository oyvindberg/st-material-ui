package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonDocumentTypeChildNode extends StObject {
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* standard dom */
  val nextElementSibling: org.scalajs.dom.Element | Null
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* standard dom */
  val previousElementSibling: org.scalajs.dom.Element | Null
}
object NonDocumentTypeChildNode {
  
  inline def apply(): NonDocumentTypeChildNode = {
    val __obj = js.Dynamic.literal(nextElementSibling = null, previousElementSibling = null)
    __obj.asInstanceOf[NonDocumentTypeChildNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonDocumentTypeChildNode] (val x: Self) extends AnyVal {
    
    inline def setNextElementSibling(value: org.scalajs.dom.Element): Self = StObject.set(x, "nextElementSibling", value.asInstanceOf[js.Any])
    
    inline def setNextElementSiblingNull: Self = StObject.set(x, "nextElementSibling", null)
    
    inline def setPreviousElementSibling(value: org.scalajs.dom.Element): Self = StObject.set(x, "previousElementSibling", value.asInstanceOf[js.Any])
    
    inline def setPreviousElementSiblingNull: Self = StObject.set(x, "previousElementSibling", null)
  }
}
