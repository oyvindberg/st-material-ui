package com.olvind.mui.std

import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.NodeList
import org.scalajs.dom.ValidityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements. */
@js.native
trait HTMLOutputElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /* standard dom */
  def checkValidity(): Boolean = js.native
  
  /* standard dom */
  var defaultValue: java.lang.String = js.native
  
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /* standard dom */
  val htmlFor: DOMTokenList = js.native
  
  /* standard dom */
  val labels: NodeList[HTMLLabelElement with org.scalajs.dom.Node] = js.native
  
  /* standard dom */
  var name: java.lang.String = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /* standard dom */
  def reportValidity(): Boolean = js.native
  
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /* standard dom */
  val `type`: java.lang.String = js.native
  
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /* standard dom */
  val validity: ValidityState = js.native
  
  /* standard dom */
  var value: java.lang.String = js.native
  
  /* standard dom */
  val willValidate: Boolean = js.native
}
