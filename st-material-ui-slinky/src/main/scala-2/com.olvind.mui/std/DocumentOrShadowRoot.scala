package com.olvind.mui.std

import org.scalajs.dom.Range
import org.scalajs.dom.Selection
import org.scalajs.dom.StyleSheetList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentOrShadowRoot extends StObject {
  
  /* standard dom */
  val activeElement: org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  def caretPositionFromPoint(x: Double, y: Double): CaretPosition | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  def caretRangeFromPoint(x: Double, y: Double): Range = js.native
  
  /* standard dom */
  def elementFromPoint(x: Double, y: Double): org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  def elementsFromPoint(x: Double, y: Double): js.Array[org.scalajs.dom.Element] = js.native
  
  /**
    * Returns document's fullscreen element.
    */
  /* standard dom */
  val fullscreenElement: org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  def getSelection(): Selection | Null = js.native
  
  /* standard dom */
  val pointerLockElement: org.scalajs.dom.Element | Null = js.native
  
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  /* standard dom */
  val styleSheets: StyleSheetList = js.native
}
object DocumentOrShadowRoot {
  
  @scala.inline
  def apply(
    caretPositionFromPoint: (Double, Double) => CaretPosition | Null,
    caretRangeFromPoint: (Double, Double) => Range,
    elementFromPoint: (Double, Double) => org.scalajs.dom.Element | Null,
    elementsFromPoint: (Double, Double) => js.Array[org.scalajs.dom.Element],
    getSelection: () => Selection | Null,
    styleSheets: StyleSheetList
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(caretPositionFromPoint = js.Any.fromFunction2(caretPositionFromPoint), caretRangeFromPoint = js.Any.fromFunction2(caretRangeFromPoint), elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getSelection = js.Any.fromFunction0(getSelection), styleSheets = styleSheets.asInstanceOf[js.Any], activeElement = null, fullscreenElement = null, pointerLockElement = null)
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
  
  @scala.inline
  implicit class DocumentOrShadowRootMutableBuilder[Self <: DocumentOrShadowRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveElementNull: Self = StObject.set(x, "activeElement", null)
    
    @scala.inline
    def setCaretPositionFromPoint(value: (Double, Double) => CaretPosition | Null): Self = StObject.set(x, "caretPositionFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCaretRangeFromPoint(value: (Double, Double) => Range): Self = StObject.set(x, "caretRangeFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setElementFromPoint(value: (Double, Double) => org.scalajs.dom.Element | Null): Self = StObject.set(x, "elementFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setElementsFromPoint(value: (Double, Double) => js.Array[org.scalajs.dom.Element]): Self = StObject.set(x, "elementsFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFullscreenElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenElementNull: Self = StObject.set(x, "fullscreenElement", null)
    
    @scala.inline
    def setGetSelection(value: () => Selection | Null): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPointerLockElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "pointerLockElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerLockElementNull: Self = StObject.set(x, "pointerLockElement", null)
    
    @scala.inline
    def setStyleSheets(value: StyleSheetList): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
  }
}
