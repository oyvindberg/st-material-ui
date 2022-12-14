package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.anon.PickTextareaAutosizePropshiddencolorstyl
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.textarea.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextareaAutosize {
  
  @JSImport("@mui/material/TextareaAutosize", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Element] {
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: "none" | "inline" | "list" | "both"): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    inline def `aria-checked`(value: Boolean | "mixed"): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-current`(value: Boolean | "page" | "step" | "location" | "date" | "time"): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-dropeffect`(value: "none" | "copy" | "execute" | "link" | "move" | "popup"): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | "grammar" | "spelling"): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: "off" | "assertive" | "polite"): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `aria-orientation`(value: "horizontal" | "vertical"): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `aria-pressed`(value: Boolean | "mixed"): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `aria-relevant`(
      value: "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `aria-sort`(value: "none" | "ascending" | "descending" | "other"): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | "inherit"): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def dirName(value: String): this.type = set("dirName", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: "none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def maxRows(value: String | Double): this.type = set("maxRows", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def minRows(value: String | Double): this.type = set("minRows", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    inline def onAbortCapture(value: Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
    
    inline def onAnimationEnd(value: SyntheticAnimationEvent[HTMLTextAreaElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def onAnimationEndCapture(value: Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    inline def onAnimationIteration(value: SyntheticAnimationEvent[HTMLTextAreaElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    
    inline def onAnimationIterationCapture(value: Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    inline def onAnimationStart(value: SyntheticAnimationEvent[HTMLTextAreaElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    inline def onAnimationStartCapture(value: Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    inline def onAuxClick(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    
    inline def onAuxClickCapture(value: Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
    
    inline def onBeforeInput(value: SyntheticEvent[EventTarget & HTMLTextAreaElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    
    inline def onBeforeInputCapture(value: Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onBlurCapture(value: Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
    
    inline def onCanPlay(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    inline def onCanPlayCapture(value: Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    inline def onCanPlayThrough(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    inline def onCanPlayThroughCapture(value: Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    inline def onChange(value: ChangeEvent[HTMLTextAreaElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onChangeCapture(value: Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onClick(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onClickCapture(value: Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
    
    inline def onCompositionEnd(value: SyntheticCompositionEvent[HTMLTextAreaElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    
    inline def onCompositionEndCapture(value: Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    inline def onCompositionStart(value: SyntheticCompositionEvent[HTMLTextAreaElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    
    inline def onCompositionStartCapture(value: Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    inline def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLTextAreaElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    inline def onCompositionUpdateCapture(value: Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def onContextMenu(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    inline def onContextMenuCapture(value: Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    inline def onCopy(value: SyntheticClipboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    inline def onCopyCapture(value: Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
    
    inline def onCut(value: SyntheticClipboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    
    inline def onCutCapture(value: Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
    
    inline def onDoubleClick(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    inline def onDoubleClickCapture(value: Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    inline def onDragCapture(value: Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    inline def onDragEndCapture(value: Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    inline def onDragEnter(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    inline def onDragEnterCapture(value: Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onDragExit(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    
    inline def onDragExitCapture(value: Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
    
    inline def onDragLeave(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    inline def onDragLeaveCapture(value: Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onDragOver(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    inline def onDragOverCapture(value: Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    inline def onDragStart(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    inline def onDragStartCapture(value: Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    inline def onDrop(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    inline def onDropCapture(value: Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
    
    inline def onDurationChange(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    inline def onDurationChangeCapture(value: Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onEmptied(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    inline def onEmptiedCapture(value: Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    inline def onEncrypted(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    
    inline def onEncryptedCapture(value: Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
    
    inline def onEnded(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    inline def onEndedCapture(value: Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
    
    inline def onError(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    inline def onErrorCapture(value: Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
    
    inline def onFocus(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onFocusCapture(value: Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
    
    inline def onGotPointerCapture(value: Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
    
    inline def onGotPointerCaptureCapture(value: Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def onInput(value: SyntheticEvent[EventTarget & HTMLTextAreaElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    
    inline def onInputCapture(value: Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
    
    inline def onInvalid(value: SyntheticEvent[EventTarget & HTMLTextAreaElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    
    inline def onInvalidCapture(value: Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyDown(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    inline def onKeyDownCapture(value: Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyPress(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    inline def onKeyPressCapture(value: Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyUp(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    inline def onKeyUpCapture(value: Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    inline def onLoad(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    inline def onLoadCapture(value: Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadStart(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    inline def onLoadStartCapture(value: Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadedData(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    inline def onLoadedDataCapture(value: Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadedMetadata(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    inline def onLoadedMetadataCapture(value: Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    inline def onLostPointerCapture(value: Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
    
    inline def onLostPointerCaptureCapture(value: Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    inline def onMouseDownCapture(value: Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    inline def onMouseLeave(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    inline def onMouseMove(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    inline def onMouseMoveCapture(value: Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseOut(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    inline def onMouseOutCapture(value: Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseOver(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    inline def onMouseOverCapture(value: Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    inline def onMouseUpCapture(value: Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    inline def onPaste(value: SyntheticClipboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    inline def onPasteCapture(value: Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
    
    inline def onPause(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    inline def onPauseCapture(value: Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
    
    inline def onPlay(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    inline def onPlayCapture(value: Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
    
    inline def onPlaying(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    inline def onPlayingCapture(value: Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerCancel(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    inline def onPointerCancelCapture(value: Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerDown(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    inline def onPointerDownCapture(value: Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerEnter(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    inline def onPointerEnterCapture(value: Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerLeave(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    inline def onPointerLeaveCapture(value: Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerMove(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    inline def onPointerMoveCapture(value: Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerOut(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    inline def onPointerOutCapture(value: Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerOver(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    inline def onPointerOverCapture(value: Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerUp(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    inline def onPointerUpCapture(value: Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def onProgress(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    inline def onProgressCapture(value: Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
    
    inline def onRateChange(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    inline def onRateChangeCapture(value: Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onReset(value: SyntheticEvent[EventTarget & HTMLTextAreaElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    
    inline def onResetCapture(value: Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
    
    inline def onResize(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
    
    inline def onResizeCapture(value: Any): this.type = set("onResizeCapture", value.asInstanceOf[js.Any])
    
    inline def onScroll(value: SyntheticUIEvent[HTMLTextAreaElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    inline def onScrollCapture(value: Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
    
    inline def onSeeked(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    inline def onSeekedCapture(value: Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    inline def onSeeking(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    inline def onSeekingCapture(value: Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    inline def onSelectCapture(value: Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
    
    inline def onStalled(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    inline def onStalledCapture(value: Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
    
    inline def onSubmit(value: SyntheticEvent[EventTarget & HTMLTextAreaElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    inline def onSubmitCapture(value: Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    inline def onSuspend(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    inline def onSuspendCapture(value: Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    inline def onTimeUpdate(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    inline def onTimeUpdateCapture(value: Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    inline def onTouchCancelCapture(value: Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    inline def onTouchEndCapture(value: Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    inline def onTouchMoveCapture(value: Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    inline def onTouchStartCapture(value: Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    inline def onTransitionEnd(value: SyntheticTransitionEvent[HTMLTextAreaElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    inline def onTransitionEndCapture(value: Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    inline def onVolumeChange(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    inline def onVolumeChangeCapture(value: Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onWaiting(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    inline def onWaitingCapture(value: Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    inline def onWheel(value: SyntheticWheelEvent[HTMLTextAreaElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    inline def onWheelCapture(value: Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def translate(value: "yes" | "no"): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: "on" | "off"): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    inline def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  type Props = PickTextareaAutosizePropshiddencolorstyl
  
  implicit def make(companion: TextareaAutosize.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[PickTextareaAutosizePropshiddencolorstyl, Builder] = new com.olvind.mui.StyledComponent.Builder[PickTextareaAutosizePropshiddencolorstyl, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: PickTextareaAutosizePropshiddencolorstyl): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
