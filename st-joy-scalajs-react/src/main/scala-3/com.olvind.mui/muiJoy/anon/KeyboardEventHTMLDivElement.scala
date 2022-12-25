package com.olvind.mui.muiJoy.anon

import com.olvind.mui.react.mod.AbstractView
import com.olvind.mui.react.mod.ModifierKey
import com.olvind.mui.react.mod.NativeKeyboardEvent
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.KeyboardEvent<std.HTMLDivElement> & {  defaultMuiPrevented :boolean | undefined} */
trait KeyboardEventHTMLDivElement extends StObject {
  
  var altKey: Boolean
  
  var bubbles: Boolean
  
  var cancelable: Boolean
  
  /** @deprecated */
  var charCode: Double
  
  var code: String
  
  var ctrlKey: Boolean
  
  var currentTarget: EventTarget & HTMLDivElement
  
  var defaultMuiPrevented: js.UndefOr[Boolean] = js.undefined
  
  var defaultPrevented: Boolean
  
  var detail: Double
  
  var eventPhase: Double
  
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: ModifierKey): Boolean
  
  def isDefaultPrevented(): Boolean
  
  def isPropagationStopped(): Boolean
  
  var isTrusted: Boolean
  
  /**
    * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
    */
  var key: String
  
  /** @deprecated */
  var keyCode: Double
  
  var locale: String
  
  var location: Double
  
  var metaKey: Boolean
  
  var nativeEvent: NativeKeyboardEvent
  
  def persist(): Unit
  
  def preventDefault(): Unit
  
  var repeat: Boolean
  
  var shiftKey: Boolean
  
  def stopPropagation(): Unit
  
  var target: EventTarget
  
  var timeStamp: Double
  
  var `type`: String
  
  var view: AbstractView
  
  /** @deprecated */
  var which: Double
}
object KeyboardEventHTMLDivElement {
  
  inline def apply(
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    charCode: Double,
    code: String,
    ctrlKey: Boolean,
    currentTarget: EventTarget & HTMLDivElement,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    getModifierState: ModifierKey => Boolean,
    isDefaultPrevented: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    isTrusted: Boolean,
    key: String,
    keyCode: Double,
    locale: String,
    location: Double,
    metaKey: Boolean,
    nativeEvent: NativeKeyboardEvent,
    persist: Callback,
    preventDefault: Callback,
    repeat: Boolean,
    shiftKey: Boolean,
    stopPropagation: Callback,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    view: AbstractView,
    which: Double
  ): KeyboardEventHTMLDivElement = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEventHTMLDivElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardEventHTMLDivElement] (val x: Self) extends AnyVal {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: EventTarget & HTMLDivElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultMuiPrevented(value: Boolean): Self = StObject.set(x, "defaultMuiPrevented", value.asInstanceOf[js.Any])
    
    inline def setDefaultMuiPreventedUndefined: Self = StObject.set(x, "defaultMuiPrevented", js.undefined)
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setGetModifierState(value: ModifierKey => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
    
    inline def setIsDefaultPrevented(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultPrevented", value.toJsFn)
    
    inline def setIsPropagationStopped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPropagationStopped", value.toJsFn)
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setNativeEvent(value: NativeKeyboardEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    inline def setPersist(value: Callback): Self = StObject.set(x, "persist", value.toJsFn)
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
  }
}
