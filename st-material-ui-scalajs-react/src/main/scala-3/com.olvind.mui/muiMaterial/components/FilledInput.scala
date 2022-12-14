package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.anon.Disabled
import com.olvind.mui.muiMaterial.anon.InputRoot
import com.olvind.mui.muiMaterial.anon.PartialFilledInputClasses
import com.olvind.mui.muiMaterial.anon.`12`
import com.olvind.mui.muiMaterial.filledInputFilledInputMod.FilledInputProps
import com.olvind.mui.muiMaterial.inputBaseInputBaseMod.InputBaseComponentProps
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilledInput {
  
  @JSImport("@mui/material/FilledInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
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
    
    inline def classes(value: PartialFilledInputClasses): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def color(value: "primary" | "secondary" | "error" | "info" | "success" | "warning"): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def components(value: `12`): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def componentsProps(value: InputRoot): this.type = set("componentsProps", value.asInstanceOf[js.Any])
    
    inline def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | "inherit"): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disableInjectingGlobalStyles(value: Boolean): this.type = set("disableInjectingGlobalStyles", value.asInstanceOf[js.Any])
    
    inline def disableUnderline(value: Boolean): this.type = set("disableUnderline", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def endAdornment(value: VdomNode): this.type = set("endAdornment", value.rawNode.asInstanceOf[js.Any])
    
    inline def endAdornmentNull: this.type = set("endAdornment", null)
    
    inline def endAdornmentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("endAdornment", js.Array(value*))
    
    inline def endAdornmentVdomElement(value: VdomElement): this.type = set("endAdornment", value.rawElement.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def hiddenLabel(value: Boolean): this.type = set("hiddenLabel", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputComponent(value: ElementType): this.type = set("inputComponent", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: "none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: InputBaseComponentProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: Ref[Any]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: Any | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def margin(value: "dense" | "none"): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxRows(value: String | Double): this.type = set("maxRows", value.asInstanceOf[js.Any])
    
    inline def minRows(value: String | Double): this.type = set("minRows", value.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAuxClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onBeforeInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onBlur(
      value: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChange(
      value: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onError(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onFocus(
      value: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onInvalid(
      value: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(
      value: ReactKeyboardEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyUp(
      value: ReactKeyboardEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerOut(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerOver(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onProgress(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onReset(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResize(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onResize", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onScroll(value: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSelect(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def ref(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.HTMLAttributes<std.HTMLDivElement> extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
    
    inline def renderSuffix(value: /* state */ Disabled => Node): this.type = set("renderSuffix", js.Any.fromFunction1(value))
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def rev(value: String): this.type = set("rev", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rows(value: String | Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def size(value: "small" | "medium"): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def slotProps(value: InputRoot): this.type = set("slotProps", value.asInstanceOf[js.Any])
    
    inline def slots(value: com.olvind.mui.muiMaterial.anon.Input): this.type = set("slots", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def startAdornment(value: VdomNode): this.type = set("startAdornment", value.rawNode.asInstanceOf[js.Any])
    
    inline def startAdornmentNull: this.type = set("startAdornment", null)
    
    inline def startAdornmentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("startAdornment", js.Array(value*))
    
    inline def startAdornmentVdomElement(value: VdomElement): this.type = set("startAdornment", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def sx(value: SxProps[Theme]): this.type = set("sx", value.asInstanceOf[js.Any])
    
    inline def sxFunction1(value: Theme => SystemStyleObject[Theme]): this.type = set("sx", js.Any.fromFunction1(value))
    
    inline def sxNull: this.type = set("sx", null)
    
    inline def sxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): this.type = set("sx", js.Array(value*))
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def translate(value: "yes" | "no"): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: "on" | "off"): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  type Props = FilledInputProps
  
  implicit def make(companion: FilledInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[FilledInputProps, Builder] = new com.olvind.mui.StyledComponent.Builder[FilledInputProps, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: FilledInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
