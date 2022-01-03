package com.olvind.mui.std

import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The HTML <meter> elements expose the HTMLMeterElement interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of <meter> elements. */
@js.native
trait HTMLMeterElement
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
  var high: Double = js.native
  
  /* standard dom */
  val labels: NodeList[HTMLLabelElement & org.scalajs.dom.Node] = js.native
  
  /* standard dom */
  var low: Double = js.native
  
  /* standard dom */
  var max: Double = js.native
  
  /* standard dom */
  var min: Double = js.native
  
  /* standard dom */
  var optimum: Double = js.native
  
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
  var value: Double = js.native
}
