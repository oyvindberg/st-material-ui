package com.olvind.mui.std

import com.olvind.mui.std.stdStrings.copy
import com.olvind.mui.std.stdStrings.cut
import com.olvind.mui.std.stdStrings.paste
import org.scalajs.dom.ClipboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAndElementEventHandlers extends StObject {
  
  /* standard dom */
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  
  /* standard dom */
  var oncopy: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null = js.native
  
  /* standard dom */
  var oncut: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onpaste: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null = js.native
  
  /* standard dom */
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
}
