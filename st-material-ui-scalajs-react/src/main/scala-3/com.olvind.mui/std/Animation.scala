package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_finish")
  def addEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_cancel")
  def addEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_finish")
  def addEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_cancel")
  def addEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_finish")
  def addEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_cancel")
  def addEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: Boolean
  ): Unit = js.native
  
  /* standard dom */
  def cancel(): Unit = js.native
  
  /* standard dom */
  var currentTime: Double | Null = js.native
  
  /* standard dom */
  var effect: AnimationEffect | Null = js.native
  
  /* standard dom */
  def finish(): Unit = js.native
  
  /* standard dom */
  val finished: js.Promise[Animation] = js.native
  
  /* standard dom */
  var id: java.lang.String = js.native
  
  /* standard dom */
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null = js.native
  
  /* standard dom */
  def pause(): Unit = js.native
  
  /* standard dom */
  val pending: Boolean = js.native
  
  /* standard dom */
  def play(): Unit = js.native
  
  /* standard dom */
  val playState: AnimationPlayState = js.native
  
  /* standard dom */
  var playbackRate: Double = js.native
  
  /* standard dom */
  val ready: js.Promise[Animation] = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_finish")
  def removeEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_cancel")
  def removeEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_cancel")
  def removeEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_finish")
  def removeEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_finish")
  def removeEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_cancel")
  def removeEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: Boolean
  ): Unit = js.native
  
  /* standard dom */
  def reverse(): Unit = js.native
  
  /* standard dom */
  var startTime: Double | Null = js.native
  
  /* standard dom */
  var timeline: AnimationTimeline | Null = js.native
  
  /* standard dom */
  def updatePlaybackRate(playbackRate: Double): Unit = js.native
}
