package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolindex
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTabT
import com.olvind.mui.muiMaterial.anon.PartialTabClasses
import com.olvind.mui.muiMaterial.anon.PartialTouchRippleProps
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ButtonBaseActions
import com.olvind.mui.muiMaterial.buttonBaseTouchRippleMod.TouchRippleActions
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.HTMLAttributeAnchorTarget
import com.olvind.mui.react.mod.HTMLAttributeReferrerPolicy
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.std.NonNullable
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
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  object href {
    
    inline def apply(href: String): Builder = {
      val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[OverridePropsExtendButtonBaseTypeMapTabT]))
    }
    
    @JSImport("@mui/material/Tab/Tab", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[HTMLAnchorElement] {
      
      inline def LinkComponent(value: ElementType): this.type = set("LinkComponent", value.asInstanceOf[js.Any])
      
      inline def TouchRippleProps(value: PartialTouchRippleProps): this.type = set("TouchRippleProps", value.asInstanceOf[js.Any])
      
      inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      inline def action(value: Ref[ButtonBaseActions]): this.type = set("action", value.asInstanceOf[js.Any])
      
      inline def actionFunction1(value: ButtonBaseActions | Null => Callback): this.type = set("action", js.Any.fromFunction1((t0: ButtonBaseActions | Null) => value(t0).runNow()))
      
      inline def actionNull: this.type = set("action", null)
      
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
      
      inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      inline def centerRipple(value: Boolean): this.type = set("centerRipple", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classes(value: PartialTabClasses): this.type = set("classes", value.asInstanceOf[js.Any])
      
      inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def contentEditable(value: Booleanish | "inherit"): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
      
      inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      inline def disableFocusRipple(value: Boolean): this.type = set("disableFocusRipple", value.asInstanceOf[js.Any])
      
      inline def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
      
      inline def disableTouchRipple(value: Boolean): this.type = set("disableTouchRipple", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def download(value: Any): this.type = set("download", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def focusRipple(value: Boolean): this.type = set("focusRipple", value.asInstanceOf[js.Any])
      
      inline def focusVisibleClassName(value: String): this.type = set("focusVisibleClassName", value.asInstanceOf[js.Any])
      
      inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      inline def hrefLang(value: String): this.type = set("hrefLang", value.asInstanceOf[js.Any])
      
      inline def icon(value: String | Element): this.type = set("icon", value.asInstanceOf[js.Any])
      
      inline def iconPosition(value: "top" | "bottom" | "start" | "end"): this.type = set("iconPosition", value.asInstanceOf[js.Any])
      
      inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      inline def inputMode(value: "none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
      
      inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
      
      inline def labelNull: this.type = set("label", null)
      
      inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
      
      inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
      
      inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      inline def media(value: String): this.type = set("media", value.asInstanceOf[js.Any])
      
      inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
      
      inline def onAbort(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAuxClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBeforeInput(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBlur(value: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlay(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlayThrough(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onContextMenu(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCopy(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCut(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDoubleClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrag(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnd(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnter(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragExit(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragLeave(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragOver(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragStart(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrop(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDurationChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEmptied(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEncrypted(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEnded(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onError(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocus(value: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocusVisible(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): this.type = set("onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInput(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInvalid(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoad(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadStart(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedData(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedMetadata(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseEnter(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseLeave(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseMove(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOut(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOver(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseUp(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPaste(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPause(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlay(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlaying(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerCancel(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerDown(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerEnter(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerLeave(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerMove(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOut(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOver(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerUp(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onProgress(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onRateChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onReset(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onResize(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onResize", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onScroll(value: ReactUIEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeked(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeking(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSelect(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onStalled(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSubmit(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSuspend(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTimeUpdate(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchCancel(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchEnd(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchMove(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchStart(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onVolumeChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWaiting(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWheel(value: ReactWheelEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def ping(value: String): this.type = set("ping", value.asInstanceOf[js.Any])
      
      inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      inline def referrerPolicy(value: HTMLAttributeReferrerPolicy): this.type = set("referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
      
      inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
      
      inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def sx(value: SxProps[Theme]): this.type = set("sx", value.asInstanceOf[js.Any])
      
      inline def sxFunction1(value: Theme => SystemStyleObject[Theme]): this.type = set("sx", js.Any.fromFunction1(value))
      
      inline def sxNull: this.type = set("sx", null)
      
      inline def sxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): this.type = set("sx", js.Array(value*))
      
      inline def tabIndex(value: NonNullable[js.UndefOr[Double]]): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def target(value: HTMLAttributeAnchorTarget): this.type = set("target", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def touchRippleRef(value: Ref[TouchRippleActions]): this.type = set("touchRippleRef", value.asInstanceOf[js.Any])
      
      inline def touchRippleRefFunction1(value: TouchRippleActions | Null => Callback): this.type = set("touchRippleRef", js.Any.fromFunction1((t0: TouchRippleActions | Null) => value(t0).runNow()))
      
      inline def touchRippleRefNull: this.type = set("touchRippleRef", null)
      
      inline def translate(value: "yes" | "no"): this.type = set("translate", value.asInstanceOf[js.Any])
      
      inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      inline def unselectable(value: "on" | "off"): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
      
      inline def wrapped(value: Boolean): this.type = set("wrapped", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: OverridePropsExtendButtonBaseTypeMapTabT): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object normal {
    
    @JSImport("@mui/material/Tab/Tab", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[HTMLAnchorElement] {
      
      inline def LinkComponent(value: ElementType): this.type = set("LinkComponent", value.asInstanceOf[js.Any])
      
      inline def TouchRippleProps(value: PartialTouchRippleProps): this.type = set("TouchRippleProps", value.asInstanceOf[js.Any])
      
      inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      inline def action(value: Ref[ButtonBaseActions]): this.type = set("action", value.asInstanceOf[js.Any])
      
      inline def actionFunction1(value: ButtonBaseActions | Null => Callback): this.type = set("action", js.Any.fromFunction1((t0: ButtonBaseActions | Null) => value(t0).runNow()))
      
      inline def actionNull: this.type = set("action", null)
      
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
      
      inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      inline def centerRipple(value: Boolean): this.type = set("centerRipple", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classes(value: PartialTabClasses): this.type = set("classes", value.asInstanceOf[js.Any])
      
      inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def contentEditable(value: Booleanish | "inherit"): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
      
      inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      inline def disableFocusRipple(value: Boolean): this.type = set("disableFocusRipple", value.asInstanceOf[js.Any])
      
      inline def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
      
      inline def disableTouchRipple(value: Boolean): this.type = set("disableTouchRipple", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def focusRipple(value: Boolean): this.type = set("focusRipple", value.asInstanceOf[js.Any])
      
      inline def focusVisibleClassName(value: String): this.type = set("focusVisibleClassName", value.asInstanceOf[js.Any])
      
      inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      inline def icon(value: String | Element): this.type = set("icon", value.asInstanceOf[js.Any])
      
      inline def iconPosition(value: "top" | "bottom" | "start" | "end"): this.type = set("iconPosition", value.asInstanceOf[js.Any])
      
      inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      inline def inputMode(value: "none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
      
      inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
      
      inline def labelNull: this.type = set("label", null)
      
      inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
      
      inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
      
      inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
      
      inline def onAbort(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAuxClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBeforeInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBlur(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlayThrough(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
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
      
      inline def onFocus(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocusVisible(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): this.type = set("onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInvalid(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
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
      
      inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
      
      inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def sx(value: SxProps[Theme]): this.type = set("sx", value.asInstanceOf[js.Any])
      
      inline def sxFunction1(value: Theme => SystemStyleObject[Theme]): this.type = set("sx", js.Any.fromFunction1(value))
      
      inline def sxNull: this.type = set("sx", null)
      
      inline def sxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): this.type = set("sx", js.Array(value*))
      
      inline def tabIndex(value: NonNullable[js.UndefOr[Double]]): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def touchRippleRef(value: Ref[TouchRippleActions]): this.type = set("touchRippleRef", value.asInstanceOf[js.Any])
      
      inline def touchRippleRefFunction1(value: TouchRippleActions | Null => Callback): this.type = set("touchRippleRef", js.Any.fromFunction1((t0: TouchRippleActions | Null) => value(t0).runNow()))
      
      inline def touchRippleRefNull: this.type = set("touchRippleRef", null)
      
      inline def translate(value: "yes" | "no"): this.type = set("translate", value.asInstanceOf[js.Any])
      
      inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      inline def unselectable(value: "on" | "off"): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
      
      inline def wrapped(value: Boolean): this.type = set("wrapped", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: normal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DefaultComponentPropsExtendButtonBaseTypAriacolindex): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
