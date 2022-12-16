package com.olvind.mui.std

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Range
import org.scalajs.dom.Selection
import org.scalajs.dom.StyleSheetList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOrShadowRoot extends StObject {
  
  /* standard dom */
  val activeElement: org.scalajs.dom.Element | Null
  
  /* standard dom */
  def caretPositionFromPoint(x: Double, y: Double): CaretPosition | Null
  
  /** @deprecated */
  /* standard dom */
  def caretRangeFromPoint(x: Double, y: Double): Range
  
  /* standard dom */
  def elementFromPoint(x: Double, y: Double): org.scalajs.dom.Element | Null
  
  /* standard dom */
  def elementsFromPoint(x: Double, y: Double): js.Array[org.scalajs.dom.Element]
  
  /**
    * Returns document's fullscreen element.
    */
  /* standard dom */
  val fullscreenElement: org.scalajs.dom.Element | Null
  
  /* standard dom */
  def getSelection(): Selection | Null
  
  /* standard dom */
  val pointerLockElement: org.scalajs.dom.Element | Null
  
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  /* standard dom */
  val styleSheets: StyleSheetList
}
object DocumentOrShadowRoot {
  
  inline def apply(
    caretPositionFromPoint: (Double, Double) => CaretPosition | Null,
    caretRangeFromPoint: (Double, Double) => Range,
    elementFromPoint: (Double, Double) => org.scalajs.dom.Element | Null,
    elementsFromPoint: (Double, Double) => js.Array[org.scalajs.dom.Element],
    getSelection: CallbackTo[Selection | Null],
    styleSheets: StyleSheetList
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(caretPositionFromPoint = js.Any.fromFunction2(caretPositionFromPoint), caretRangeFromPoint = js.Any.fromFunction2(caretRangeFromPoint), elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getSelection = getSelection.toJsFn, styleSheets = styleSheets.asInstanceOf[js.Any], activeElement = null, fullscreenElement = null, pointerLockElement = null)
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentOrShadowRoot] (val x: Self) extends AnyVal {
    
    inline def setActiveElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
    
    inline def setActiveElementNull: Self = StObject.set(x, "activeElement", null)
    
    inline def setCaretPositionFromPoint(value: (Double, Double) => CaretPosition | Null): Self = StObject.set(x, "caretPositionFromPoint", js.Any.fromFunction2(value))
    
    inline def setCaretRangeFromPoint(value: (Double, Double) => Range): Self = StObject.set(x, "caretRangeFromPoint", js.Any.fromFunction2(value))
    
    inline def setElementFromPoint(value: (Double, Double) => org.scalajs.dom.Element | Null): Self = StObject.set(x, "elementFromPoint", js.Any.fromFunction2(value))
    
    inline def setElementsFromPoint(value: (Double, Double) => js.Array[org.scalajs.dom.Element]): Self = StObject.set(x, "elementsFromPoint", js.Any.fromFunction2(value))
    
    inline def setFullscreenElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
    
    inline def setFullscreenElementNull: Self = StObject.set(x, "fullscreenElement", null)
    
    inline def setGetSelection(value: CallbackTo[Selection | Null]): Self = StObject.set(x, "getSelection", value.toJsFn)
    
    inline def setPointerLockElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "pointerLockElement", value.asInstanceOf[js.Any])
    
    inline def setPointerLockElementNull: Self = StObject.set(x, "pointerLockElement", null)
    
    inline def setStyleSheets(value: StyleSheetList): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
  }
}
