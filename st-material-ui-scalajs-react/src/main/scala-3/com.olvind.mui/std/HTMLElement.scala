package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it. */
@js.native
trait HTMLElement
  extends StObject
     with Element
     with DocumentAndElementEventHandlers
     with ElementCSSInlineStyle
     with ElementContentEditable
     with GlobalEventHandlers
     with HTMLOrSVGElement {
  
  /* standard dom */
  var accessKey: java.lang.String = js.native
  
  /* standard dom */
  val accessKeyLabel: java.lang.String = js.native
  
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
  var autocapitalize: java.lang.String = js.native
  
  /* standard dom */
  def click(): Unit = js.native
  
  /* standard dom */
  var dir: java.lang.String = js.native
  
  /* standard dom */
  var draggable: Boolean = js.native
  
  /* standard dom */
  var hidden: Boolean = js.native
  
  /* standard dom */
  var innerText: java.lang.String = js.native
  
  /* standard dom */
  var lang: java.lang.String = js.native
  
  /* standard dom */
  val offsetHeight: Double = js.native
  
  /* standard dom */
  val offsetLeft: Double = js.native
  
  /* standard dom */
  val offsetParent: org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  val offsetTop: Double = js.native
  
  /* standard dom */
  val offsetWidth: Double = js.native
  
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
  var spellcheck: Boolean = js.native
  
  /* standard dom */
  var title: java.lang.String = js.native
  
  /* standard dom */
  var translate: Boolean = js.native
}
