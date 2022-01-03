package com.olvind.mui.std

import org.scalajs.dom.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLAppletElement
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
  var align: java.lang.String = js.native
  
  /**
    * Sets or retrieves a text alternative to the graphic.
    */
  /** @deprecated */
  /* standard dom */
  var alt: java.lang.String = js.native
  
  /**
    * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
    */
  /** @deprecated */
  /* standard dom */
  var archive: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var code: java.lang.String = js.native
  
  /**
    * Sets or retrieves the URL of the component.
    */
  /** @deprecated */
  /* standard dom */
  var codeBase: java.lang.String = js.native
  
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /**
    * Sets or retrieves the height of the object.
    */
  /** @deprecated */
  /* standard dom */
  var height: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var hspace: Double = js.native
  
  /**
    * Sets or retrieves the shape of the object.
    */
  /** @deprecated */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var `object`: java.lang.String = js.native
  
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
  var vspace: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var width: java.lang.String = js.native
}
