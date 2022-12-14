package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAlignItems
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapList
import com.olvind.mui.muiMaterial.anon.PartialListItemClasses
import com.olvind.mui.muiMaterial.anon.PartialTouchRippleProps
import com.olvind.mui.muiMaterial.anon.Root
import com.olvind.mui.muiMaterial.anon.`15`
import com.olvind.mui.muiMaterial.anon.`1`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ButtonBaseActions
import com.olvind.mui.muiMaterial.buttonBaseTouchRippleMod.TouchRippleActions
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.DragEvent
import com.olvind.mui.react.mod.HTMLAttributeAnchorTarget
import com.olvind.mui.react.mod.HTMLAttributeReferrerPolicy
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.std.NonNullable
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
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
import slinky.web.html.a.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  object href {
    
    inline def apply(href: String): Builder = {
      val __props = js.Dynamic.literal(button = true, href = href.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[OverridePropsExtendButtonBaseTypeMapList]))
    }
    
    @JSImport("@mui/material", "ListItem")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, HTMLAnchorElement] {
      
      inline def ContainerComponent(value: ReactElement): this.type = set("ContainerComponent", value.asInstanceOf[js.Any])
      
      inline def ContainerProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("ContainerProps", value.asInstanceOf[js.Any])
      
      inline def LinkComponent(value: ReactElement): this.type = set("LinkComponent", value.asInstanceOf[js.Any])
      
      inline def TouchRippleProps(value: PartialTouchRippleProps): this.type = set("TouchRippleProps", value.asInstanceOf[js.Any])
      
      inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      inline def action(value: Ref[ButtonBaseActions]): this.type = set("action", value.asInstanceOf[js.Any])
      
      inline def actionFunction1(value: /* instance */ ButtonBaseActions | Null => Unit): this.type = set("action", js.Any.fromFunction1(value))
      
      inline def actionNull: this.type = set("action", null)
      
      inline def actionReactRef(value: ReactRef[ButtonBaseActions]): this.type = set("action", value.asInstanceOf[js.Any])
      
      inline def alignItems(value: "flex-start" | "center"): this.type = set("alignItems", value.asInstanceOf[js.Any])
      
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
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      inline def centerRipple(value: Boolean): this.type = set("centerRipple", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classes(value: PartialListItemClasses): this.type = set("classes", value.asInstanceOf[js.Any])
      
      inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def components(value: Root): this.type = set("components", value.asInstanceOf[js.Any])
      
      inline def componentsProps(value: `15`): this.type = set("componentsProps", value.asInstanceOf[js.Any])
      
      inline def contentEditable(value: Booleanish | "inherit"): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
      
      inline def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
      
      inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      inline def disableGutters(value: Boolean): this.type = set("disableGutters", value.asInstanceOf[js.Any])
      
      inline def disablePadding(value: Boolean): this.type = set("disablePadding", value.asInstanceOf[js.Any])
      
      inline def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
      
      inline def disableTouchRipple(value: Boolean): this.type = set("disableTouchRipple", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def divider(value: Boolean): this.type = set("divider", value.asInstanceOf[js.Any])
      
      inline def download(value: Any): this.type = set("download", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def focusRipple(value: Boolean): this.type = set("focusRipple", value.asInstanceOf[js.Any])
      
      inline def focusVisibleClassName(value: String): this.type = set("focusVisibleClassName", value.asInstanceOf[js.Any])
      
      inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      inline def hrefLang(value: String): this.type = set("hrefLang", value.asInstanceOf[js.Any])
      
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
      
      inline def media(value: String): this.type = set("media", value.asInstanceOf[js.Any])
      
      inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
      
      inline def onAbort(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
      
      inline def onAnimationEnd(value: SyntheticAnimationEvent[HTMLAnchorElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def onAnimationIteration(value: SyntheticAnimationEvent[HTMLAnchorElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def onAnimationStart(value: SyntheticAnimationEvent[HTMLAnchorElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
      
      inline def onAuxClick(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
      
      inline def onBeforeInput(value: SyntheticEvent[EventTarget & HTMLAnchorElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
      
      inline def onBlur(value: SyntheticFocusEvent[HTMLAnchorElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      inline def onCanPlay(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
      
      inline def onCanPlayThrough(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def onChange(value: SyntheticEvent[EventTarget & HTMLAnchorElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      inline def onClick(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      inline def onCompositionEnd(value: SyntheticCompositionEvent[HTMLAnchorElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def onCompositionStart(value: SyntheticCompositionEvent[HTMLAnchorElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
      
      inline def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLAnchorElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def onContextMenu(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      inline def onCopy(value: SyntheticClipboardEvent[HTMLAnchorElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
      
      inline def onCut(value: SyntheticClipboardEvent[HTMLAnchorElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
      
      inline def onDoubleClick(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
      
      inline def onDrag(value: DragEvent[HTMLAnchorElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
      
      inline def onDragEnd(value: DragEvent[HTMLAnchorElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
      
      inline def onDragEnter(value: DragEvent[HTMLAnchorElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
      
      inline def onDragExit(value: DragEvent[HTMLAnchorElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
      
      inline def onDragLeave(value: DragEvent[HTMLAnchorElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
      
      inline def onDragOver(value: DragEvent[HTMLAnchorElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
      
      inline def onDragStart(value: DragEvent[HTMLAnchorElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
      
      inline def onDrop(value: DragEvent[HTMLAnchorElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
      
      inline def onDurationChange(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
      
      inline def onEmptied(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
      
      inline def onEncrypted(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
      
      inline def onEnded(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
      
      inline def onError(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      inline def onFocus(value: SyntheticFocusEvent[HTMLAnchorElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      inline def onFocusVisible(value: SyntheticFocusEvent[Any] => Unit): this.type = set("onFocusVisible", js.Any.fromFunction1(value))
      
      inline def onInput(value: SyntheticEvent[EventTarget & HTMLAnchorElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
      
      inline def onInvalid(value: SyntheticEvent[EventTarget & HTMLAnchorElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
      
      inline def onKeyDown(value: SyntheticKeyboardEvent[HTMLAnchorElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      inline def onKeyPress(value: SyntheticKeyboardEvent[HTMLAnchorElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      inline def onKeyUp(value: SyntheticKeyboardEvent[HTMLAnchorElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
      
      inline def onLoad(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      inline def onLoadStart(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
      
      inline def onLoadedData(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
      
      inline def onLoadedMetadata(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def onMouseDown(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      inline def onMouseEnter(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      inline def onMouseLeave(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      inline def onMouseMove(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      
      inline def onMouseOut(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
      
      inline def onMouseOver(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
      
      inline def onMouseUp(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      inline def onPaste(value: SyntheticClipboardEvent[HTMLAnchorElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
      
      inline def onPause(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
      
      inline def onPlay(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
      
      inline def onPlaying(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
      
      inline def onPointerCancel(value: SyntheticPointerEvent[HTMLAnchorElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
      
      inline def onPointerDown(value: SyntheticPointerEvent[HTMLAnchorElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
      
      inline def onPointerEnter(value: SyntheticPointerEvent[HTMLAnchorElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
      
      inline def onPointerLeave(value: SyntheticPointerEvent[HTMLAnchorElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
      
      inline def onPointerMove(value: SyntheticPointerEvent[HTMLAnchorElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
      
      inline def onPointerOut(value: SyntheticPointerEvent[HTMLAnchorElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
      
      inline def onPointerOver(value: SyntheticPointerEvent[HTMLAnchorElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
      
      inline def onPointerUp(value: SyntheticPointerEvent[HTMLAnchorElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
      
      inline def onProgress(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      inline def onRateChange(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
      
      inline def onReset(value: SyntheticEvent[EventTarget & HTMLAnchorElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
      
      inline def onResize(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
      
      inline def onScroll(value: SyntheticUIEvent[HTMLAnchorElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      inline def onSeeked(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
      
      inline def onSeeking(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
      
      inline def onSelect(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      inline def onStalled(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
      
      inline def onSubmit(value: SyntheticEvent[EventTarget & HTMLAnchorElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
      
      inline def onSuspend(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
      
      inline def onTimeUpdate(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def onTouchCancel(value: SyntheticTouchEvent[HTMLAnchorElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      inline def onTouchEnd(value: SyntheticTouchEvent[HTMLAnchorElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      inline def onTouchMove(value: SyntheticTouchEvent[HTMLAnchorElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      inline def onTouchStart(value: SyntheticTouchEvent[HTMLAnchorElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      inline def onTransitionEnd(value: SyntheticTransitionEvent[HTMLAnchorElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def onVolumeChange(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
      
      inline def onWaiting(value: SyntheticEvent[Event, HTMLAnchorElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
      
      inline def onWheel(value: SyntheticWheelEvent[HTMLAnchorElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
      
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
      
      inline def secondaryAction(value: ReactElement): this.type = set("secondaryAction", value.asInstanceOf[js.Any])
      
      inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
      
      inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      inline def slotProps(value: `15`): this.type = set("slotProps", value.asInstanceOf[js.Any])
      
      inline def slots(value: `1`): this.type = set("slots", value.asInstanceOf[js.Any])
      
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
      
      inline def touchRippleRefFunction1(value: /* instance */ TouchRippleActions | Null => Unit): this.type = set("touchRippleRef", js.Any.fromFunction1(value))
      
      inline def touchRippleRefNull: this.type = set("touchRippleRef", null)
      
      inline def touchRippleRefReactRef(value: ReactRef[TouchRippleActions]): this.type = set("touchRippleRef", value.asInstanceOf[js.Any])
      
      inline def translate(value: "yes" | "no"): this.type = set("translate", value.asInstanceOf[js.Any])
      
      inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      inline def unselectable(value: "on" | "off"): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: OverridePropsExtendButtonBaseTypeMapList): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object normal {
    
    inline def apply(): Builder = {
      val __props = js.Dynamic.literal(button = true)
      new Builder(js.Array(this.component, __props.asInstanceOf[DefaultComponentPropsExtendButtonBaseTypAlignItems]))
    }
    
    @JSImport("@mui/material", "ListItem")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, HTMLAnchorElement] {
      
      inline def ContainerComponent(value: ReactElement): this.type = set("ContainerComponent", value.asInstanceOf[js.Any])
      
      inline def ContainerProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("ContainerProps", value.asInstanceOf[js.Any])
      
      inline def LinkComponent(value: ReactElement): this.type = set("LinkComponent", value.asInstanceOf[js.Any])
      
      inline def TouchRippleProps(value: PartialTouchRippleProps): this.type = set("TouchRippleProps", value.asInstanceOf[js.Any])
      
      inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      inline def action(value: Ref[ButtonBaseActions]): this.type = set("action", value.asInstanceOf[js.Any])
      
      inline def actionFunction1(value: /* instance */ ButtonBaseActions | Null => Unit): this.type = set("action", js.Any.fromFunction1(value))
      
      inline def actionNull: this.type = set("action", null)
      
      inline def actionReactRef(value: ReactRef[ButtonBaseActions]): this.type = set("action", value.asInstanceOf[js.Any])
      
      inline def alignItems(value: "flex-start" | "center"): this.type = set("alignItems", value.asInstanceOf[js.Any])
      
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
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      inline def centerRipple(value: Boolean): this.type = set("centerRipple", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classes(value: PartialListItemClasses): this.type = set("classes", value.asInstanceOf[js.Any])
      
      inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def components(value: Root): this.type = set("components", value.asInstanceOf[js.Any])
      
      inline def componentsProps(value: `15`): this.type = set("componentsProps", value.asInstanceOf[js.Any])
      
      inline def contentEditable(value: Booleanish | "inherit"): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
      
      inline def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
      
      inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      inline def disableGutters(value: Boolean): this.type = set("disableGutters", value.asInstanceOf[js.Any])
      
      inline def disablePadding(value: Boolean): this.type = set("disablePadding", value.asInstanceOf[js.Any])
      
      inline def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
      
      inline def disableTouchRipple(value: Boolean): this.type = set("disableTouchRipple", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def divider(value: Boolean): this.type = set("divider", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def focusRipple(value: Boolean): this.type = set("focusRipple", value.asInstanceOf[js.Any])
      
      inline def focusVisibleClassName(value: String): this.type = set("focusVisibleClassName", value.asInstanceOf[js.Any])
      
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
      
      inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
      
      inline def onAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
      
      inline def onAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def onAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def onAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
      
      inline def onAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
      
      inline def onBeforeInput(value: SyntheticEvent[EventTarget & HTMLDivElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
      
      inline def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      inline def onCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
      
      inline def onCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def onChange(value: SyntheticEvent[EventTarget & HTMLDivElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      inline def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      inline def onCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def onCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
      
      inline def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      inline def onCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
      
      inline def onCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
      
      inline def onDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
      
      inline def onDrag(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
      
      inline def onDragEnd(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
      
      inline def onDragEnter(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
      
      inline def onDragExit(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
      
      inline def onDragLeave(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
      
      inline def onDragOver(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
      
      inline def onDragStart(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
      
      inline def onDrop(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
      
      inline def onDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
      
      inline def onEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
      
      inline def onEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
      
      inline def onEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
      
      inline def onError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      inline def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      inline def onFocusVisible(value: SyntheticFocusEvent[Any] => Unit): this.type = set("onFocusVisible", js.Any.fromFunction1(value))
      
      inline def onInput(value: SyntheticEvent[EventTarget & HTMLDivElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
      
      inline def onInvalid(value: SyntheticEvent[EventTarget & HTMLDivElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
      
      inline def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      inline def onKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      inline def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
      
      inline def onLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      inline def onLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
      
      inline def onLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
      
      inline def onLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      inline def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      inline def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      inline def onMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      
      inline def onMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
      
      inline def onMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
      
      inline def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      inline def onPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
      
      inline def onPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
      
      inline def onPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
      
      inline def onPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
      
      inline def onPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
      
      inline def onPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
      
      inline def onPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
      
      inline def onPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
      
      inline def onPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
      
      inline def onPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
      
      inline def onPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
      
      inline def onPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
      
      inline def onProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      inline def onRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
      
      inline def onReset(value: SyntheticEvent[EventTarget & HTMLDivElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
      
      inline def onResize(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
      
      inline def onScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      inline def onSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
      
      inline def onSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
      
      inline def onSelect(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      inline def onStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
      
      inline def onSubmit(value: SyntheticEvent[EventTarget & HTMLDivElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
      
      inline def onSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
      
      inline def onTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def onTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      inline def onTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      inline def onTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      inline def onTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      inline def onTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def onVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
      
      inline def onWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
      
      inline def onWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
      
      inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
      
      inline def secondaryAction(value: ReactElement): this.type = set("secondaryAction", value.asInstanceOf[js.Any])
      
      inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
      
      inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      inline def slotProps(value: `15`): this.type = set("slotProps", value.asInstanceOf[js.Any])
      
      inline def slots(value: `1`): this.type = set("slots", value.asInstanceOf[js.Any])
      
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
      
      inline def touchRippleRefFunction1(value: /* instance */ TouchRippleActions | Null => Unit): this.type = set("touchRippleRef", js.Any.fromFunction1(value))
      
      inline def touchRippleRefNull: this.type = set("touchRippleRef", null)
      
      inline def touchRippleRefReactRef(value: ReactRef[TouchRippleActions]): this.type = set("touchRippleRef", value.asInstanceOf[js.Any])
      
      inline def translate(value: "yes" | "no"): this.type = set("translate", value.asInstanceOf[js.Any])
      
      inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      inline def unselectable(value: "on" | "off"): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DefaultComponentPropsExtendButtonBaseTypAlignItems): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}