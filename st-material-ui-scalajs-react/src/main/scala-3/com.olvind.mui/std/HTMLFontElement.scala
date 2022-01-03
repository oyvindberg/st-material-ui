package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Implements the document object model (DOM) representation of the font element. The HTML Font Element <font> defines the font size, font face and color of text. */
@js.native
trait HTMLFontElement
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
  
  /** @deprecated */
  /* standard dom */
  var color: java.lang.String = js.native
  
  /**
    * Sets or retrieves the current typeface family.
    */
  /** @deprecated */
  /* standard dom */
  var face: java.lang.String = js.native
  
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
  
  /** @deprecated */
  /* standard dom */
  var size: java.lang.String = js.native
}
