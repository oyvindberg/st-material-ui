package com.olvind.mui.std

import com.olvind.mui.std.stdStrings.bounce
import com.olvind.mui.std.stdStrings.finish
import com.olvind.mui.std.stdStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods to manipulate <marquee> elements. */
@js.native
trait HTMLMarqueeElement
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
  @JSName("addEventListener")
  def addEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  var behavior: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var bgColor: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var direction: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var height: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var hspace: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var loop: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var onbounce: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
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
  @JSName("removeEventListener")
  def removeEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  var scrollAmount: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var scrollDelay: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  def start(): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def stop(): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  var trueSpeed: Boolean = js.native
  
  /** @deprecated */
  /* standard dom */
  var vspace: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var width: java.lang.String = js.native
}
