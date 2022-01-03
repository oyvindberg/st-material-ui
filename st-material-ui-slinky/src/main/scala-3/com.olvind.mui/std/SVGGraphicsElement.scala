package com.olvind.mui.std

import org.scalajs.dom.DOMRect
import org.scalajs.dom.SVGAnimatedTransformList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SVG elements whose primary purpose is to directly render graphics into a group. */
@js.native
trait SVGGraphicsElement
  extends StObject
     with SVGElement
     with SVGTests {
  
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
  def getBBox(): DOMRect = js.native
  def getBBox(options: SVGBoundingBoxOptions): DOMRect = js.native
  
  /* standard dom */
  def getCTM(): DOMMatrix | Null = js.native
  
  /* standard dom */
  def getScreenCTM(): DOMMatrix | Null = js.native
  
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
  val transform: SVGAnimatedTransformList = js.native
}
