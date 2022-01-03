package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.anon.PartialTableCellClasses
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.muiMaterialStrings.`additions removals`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`additions text`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`inline`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`removals additions`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`removals text`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`text additions`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`text removals`
import com.olvind.mui.muiMaterial.muiMaterialStrings.additions
import com.olvind.mui.muiMaterial.muiMaterialStrings.all
import com.olvind.mui.muiMaterial.muiMaterialStrings.ascending
import com.olvind.mui.muiMaterial.muiMaterialStrings.assertive
import com.olvind.mui.muiMaterial.muiMaterialStrings.baseline
import com.olvind.mui.muiMaterial.muiMaterialStrings.body
import com.olvind.mui.muiMaterial.muiMaterialStrings.both
import com.olvind.mui.muiMaterial.muiMaterialStrings.bottom
import com.olvind.mui.muiMaterial.muiMaterialStrings.center
import com.olvind.mui.muiMaterial.muiMaterialStrings.checkbox
import com.olvind.mui.muiMaterial.muiMaterialStrings.copy
import com.olvind.mui.muiMaterial.muiMaterialStrings.date
import com.olvind.mui.muiMaterial.muiMaterialStrings.decimal
import com.olvind.mui.muiMaterial.muiMaterialStrings.descending
import com.olvind.mui.muiMaterial.muiMaterialStrings.dialog
import com.olvind.mui.muiMaterial.muiMaterialStrings.email
import com.olvind.mui.muiMaterial.muiMaterialStrings.execute
import com.olvind.mui.muiMaterial.muiMaterialStrings.footer
import com.olvind.mui.muiMaterial.muiMaterialStrings.grammar
import com.olvind.mui.muiMaterial.muiMaterialStrings.grid
import com.olvind.mui.muiMaterial.muiMaterialStrings.head
import com.olvind.mui.muiMaterial.muiMaterialStrings.horizontal
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.justify
import com.olvind.mui.muiMaterial.muiMaterialStrings.left
import com.olvind.mui.muiMaterial.muiMaterialStrings.link
import com.olvind.mui.muiMaterial.muiMaterialStrings.list
import com.olvind.mui.muiMaterial.muiMaterialStrings.listbox
import com.olvind.mui.muiMaterial.muiMaterialStrings.location
import com.olvind.mui.muiMaterial.muiMaterialStrings.medium
import com.olvind.mui.muiMaterial.muiMaterialStrings.menu
import com.olvind.mui.muiMaterial.muiMaterialStrings.middle
import com.olvind.mui.muiMaterial.muiMaterialStrings.mixed
import com.olvind.mui.muiMaterial.muiMaterialStrings.move
import com.olvind.mui.muiMaterial.muiMaterialStrings.no
import com.olvind.mui.muiMaterial.muiMaterialStrings.none
import com.olvind.mui.muiMaterial.muiMaterialStrings.normal
import com.olvind.mui.muiMaterial.muiMaterialStrings.numeric
import com.olvind.mui.muiMaterial.muiMaterialStrings.off
import com.olvind.mui.muiMaterial.muiMaterialStrings.on
import com.olvind.mui.muiMaterial.muiMaterialStrings.other
import com.olvind.mui.muiMaterial.muiMaterialStrings.page
import com.olvind.mui.muiMaterial.muiMaterialStrings.polite
import com.olvind.mui.muiMaterial.muiMaterialStrings.popup
import com.olvind.mui.muiMaterial.muiMaterialStrings.removals
import com.olvind.mui.muiMaterial.muiMaterialStrings.right
import com.olvind.mui.muiMaterial.muiMaterialStrings.search
import com.olvind.mui.muiMaterial.muiMaterialStrings.small
import com.olvind.mui.muiMaterial.muiMaterialStrings.spelling
import com.olvind.mui.muiMaterial.muiMaterialStrings.step
import com.olvind.mui.muiMaterial.muiMaterialStrings.tel
import com.olvind.mui.muiMaterial.muiMaterialStrings.text
import com.olvind.mui.muiMaterial.muiMaterialStrings.time
import com.olvind.mui.muiMaterial.muiMaterialStrings.top
import com.olvind.mui.muiMaterial.muiMaterialStrings.tree
import com.olvind.mui.muiMaterial.muiMaterialStrings.url
import com.olvind.mui.muiMaterial.muiMaterialStrings.vertical
import com.olvind.mui.muiMaterial.muiMaterialStrings.yes
import com.olvind.mui.muiMaterial.tableCellTableCellMod.SortDirection
import com.olvind.mui.muiMaterial.tableCellTableCellMod.TableCellProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
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
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableCell {
  
  @JSImport("@mui/material", "TableCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def abbr(value: String): this.type = set("abbr", value.asInstanceOf[js.Any])
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def align(value: inherit | left | center | right | justify): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: PartialTableCellClasses): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def component(value: ElementType): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def headers(value: String): this.type = set("headers", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onAuxClick(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onBeforeInput(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onError(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onInput(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onInvalid(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: ReactPointerEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactPointerEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactPointerEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactPointerEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactPointerEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOut(value: ReactPointerEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOver(value: ReactPointerEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactPointerEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onProgress(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onReset(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onScroll(value: ReactUIEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onSelect(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLTableCellElement & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLTableCellElement & Element]) => value(t0).runNow()))
    
    inline def padding(value: normal | checkbox | none): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    inline def scope(value: String): this.type = set("scope", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def sortDirection(value: SortDirection): this.type = set("sortDirection", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def sx(value: SxProps[Theme]): this.type = set("sx", value.asInstanceOf[js.Any])
    
    inline def sxFunction1(value: Theme => SystemStyleObject[Theme]): this.type = set("sx", js.Any.fromFunction1(value))
    
    inline def sxNull: this.type = set("sx", null)
    
    inline def sxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): this.type = set("sx", js.Array(value*))
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def valign(value: top | middle | bottom | baseline): this.type = set("valign", value.asInstanceOf[js.Any])
    
    inline def variant(value: head | body | footer): this.type = set("variant", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableCellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
