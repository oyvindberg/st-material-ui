package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.anon.Actions
import com.olvind.mui.muiBase.anon.DefaultComponentPropsTablePaginationUnst
import com.olvind.mui.muiBase.anon.DisplayedRows
import com.olvind.mui.muiBase.anon.Label
import com.olvind.mui.muiBase.anon.PartialTablePaginationUnstyledClasses
import com.olvind.mui.muiBase.muiBaseStrings.`additions removals`
import com.olvind.mui.muiBase.muiBaseStrings.`additions text`
import com.olvind.mui.muiBase.muiBaseStrings.`inline`
import com.olvind.mui.muiBase.muiBaseStrings.`removals additions`
import com.olvind.mui.muiBase.muiBaseStrings.`removals text`
import com.olvind.mui.muiBase.muiBaseStrings.`text additions`
import com.olvind.mui.muiBase.muiBaseStrings.`text removals`
import com.olvind.mui.muiBase.muiBaseStrings.additions
import com.olvind.mui.muiBase.muiBaseStrings.all
import com.olvind.mui.muiBase.muiBaseStrings.ascending
import com.olvind.mui.muiBase.muiBaseStrings.assertive
import com.olvind.mui.muiBase.muiBaseStrings.baseline
import com.olvind.mui.muiBase.muiBaseStrings.both
import com.olvind.mui.muiBase.muiBaseStrings.bottom
import com.olvind.mui.muiBase.muiBaseStrings.center
import com.olvind.mui.muiBase.muiBaseStrings.char
import com.olvind.mui.muiBase.muiBaseStrings.copy
import com.olvind.mui.muiBase.muiBaseStrings.date
import com.olvind.mui.muiBase.muiBaseStrings.decimal
import com.olvind.mui.muiBase.muiBaseStrings.descending
import com.olvind.mui.muiBase.muiBaseStrings.dialog
import com.olvind.mui.muiBase.muiBaseStrings.email
import com.olvind.mui.muiBase.muiBaseStrings.execute
import com.olvind.mui.muiBase.muiBaseStrings.grammar
import com.olvind.mui.muiBase.muiBaseStrings.grid
import com.olvind.mui.muiBase.muiBaseStrings.horizontal
import com.olvind.mui.muiBase.muiBaseStrings.inherit
import com.olvind.mui.muiBase.muiBaseStrings.justify
import com.olvind.mui.muiBase.muiBaseStrings.left
import com.olvind.mui.muiBase.muiBaseStrings.link
import com.olvind.mui.muiBase.muiBaseStrings.list
import com.olvind.mui.muiBase.muiBaseStrings.listbox
import com.olvind.mui.muiBase.muiBaseStrings.location
import com.olvind.mui.muiBase.muiBaseStrings.menu
import com.olvind.mui.muiBase.muiBaseStrings.middle
import com.olvind.mui.muiBase.muiBaseStrings.mixed
import com.olvind.mui.muiBase.muiBaseStrings.move
import com.olvind.mui.muiBase.muiBaseStrings.no
import com.olvind.mui.muiBase.muiBaseStrings.none
import com.olvind.mui.muiBase.muiBaseStrings.numeric
import com.olvind.mui.muiBase.muiBaseStrings.off
import com.olvind.mui.muiBase.muiBaseStrings.on
import com.olvind.mui.muiBase.muiBaseStrings.other
import com.olvind.mui.muiBase.muiBaseStrings.page
import com.olvind.mui.muiBase.muiBaseStrings.polite
import com.olvind.mui.muiBase.muiBaseStrings.popup
import com.olvind.mui.muiBase.muiBaseStrings.removals
import com.olvind.mui.muiBase.muiBaseStrings.right
import com.olvind.mui.muiBase.muiBaseStrings.search
import com.olvind.mui.muiBase.muiBaseStrings.spelling
import com.olvind.mui.muiBase.muiBaseStrings.step
import com.olvind.mui.muiBase.muiBaseStrings.tel
import com.olvind.mui.muiBase.muiBaseStrings.text
import com.olvind.mui.muiBase.muiBaseStrings.time
import com.olvind.mui.muiBase.muiBaseStrings.top
import com.olvind.mui.muiBase.muiBaseStrings.tree
import com.olvind.mui.muiBase.muiBaseStrings.url
import com.olvind.mui.muiBase.muiBaseStrings.vertical
import com.olvind.mui.muiBase.muiBaseStrings.yes
import com.olvind.mui.muiBase.tablePaginationUnstyledPropsMod.ItemAriaLabelType
import com.olvind.mui.muiBase.tablePaginationUnstyledPropsMod.LabelDisplayedRowsArgs
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.std.HTMLTableDataCellElement
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
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TablePaginationUnstyled {
  
  @scala.inline
  def apply(
    count: Double,
    onPageChange: (Null | ReactMouseEventFrom[HTMLButtonElement], Double) => Callback,
    page: Double,
    rowsPerPage: Double
  ): Builder = {
    val __props = js.Dynamic.literal(count = count.asInstanceOf[js.Any], onPageChange = js.Any.fromFunction2((t0: Null | ReactMouseEventFrom[HTMLButtonElement], t1: Double) => (onPageChange(t0, t1)).runNow()), page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* props */ DefaultComponentPropsTablePaginationUnst]))
  }
  
  @JSImport("@mui/base/TablePaginationUnstyled", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any]) extends StBuildingComponent[HTMLTableDataCellElement] {
    
    @scala.inline
    def abbr(value: String): this.type = set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def align(value: left | center | right | justify | char): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classes(value: PartialTablePaginationUnstyledClasses): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def components(value: Actions): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentsProps(value: DisplayedRows): this.type = set("componentsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getItemAriaLabel(value: /* type */ ItemAriaLabelType => String): this.type = set("getItemAriaLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def headers(value: String): this.type = set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelDisplayedRows(value: /* paginationInfo */ LabelDisplayedRowsArgs => Node): this.type = set("labelDisplayedRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelRowsPerPage(value: VdomNode): this.type = set("labelRowsPerPage", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def labelRowsPerPageNull: this.type = set("labelRowsPerPage", null)
    
    @scala.inline
    def labelRowsPerPageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("labelRowsPerPage", js.Array(value :_*))
    
    @scala.inline
    def labelRowsPerPageVdomElement(value: VdomElement): this.type = set("labelRowsPerPage", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onAnimationEnd(value: ReactAnimationEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onAnimationIteration(value: ReactAnimationEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onAnimationStart(value: ReactAnimationEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onAuxClick(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onBeforeInput(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onBlur(value: ReactFocusEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onCanPlay(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onCanPlayThrough(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onChange(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onClick(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onCompositionEnd(
      value: ReactCompositionEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback
    ): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onCompositionStart(
      value: ReactCompositionEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback
    ): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onCompositionUpdate(
      value: ReactCompositionEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback
    ): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onContextMenu(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onCopy(value: ReactClipboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onCut(value: ReactClipboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDoubleClick(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDrag(value: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDragEnd(value: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDragEnter(value: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDragExit(value: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDragLeave(value: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDragOver(value: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDragStart(value: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDrop(value: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onDurationChange(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onEmptied(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onEncrypted(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onEnded(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onError(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onFocus(value: ReactFocusEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onInput(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onInvalid(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onKeyDown(value: ReactKeyboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onKeyPress(value: ReactKeyboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onKeyUp(value: ReactKeyboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onLoad(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onLoadStart(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onLoadedData(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onLoadedMetadata(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onMouseDown(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onMouseEnter(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onMouseLeave(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onMouseMove(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onMouseOut(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onMouseOver(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onMouseUp(value: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPaste(value: ReactClipboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPause(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPlay(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPlaying(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPointerCancel(value: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPointerDown(value: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPointerEnter(value: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPointerLeave(value: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPointerMove(value: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPointerOut(value: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPointerOver(value: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onPointerUp(value: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onProgress(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onRateChange(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onReset(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onRowsPerPageChange(
      value: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) with org.scalajs.dom.Element] => Callback
    ): this.type = set("onRowsPerPageChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onScroll(value: ReactUIEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onSeeked(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onSeeking(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onSelect(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onStalled(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onSubmit(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onSuspend(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onTimeUpdate(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onTouchCancel(value: ReactTouchEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onTouchEnd(value: ReactTouchEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onTouchMove(value: ReactTouchEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onTouchStart(value: ReactTouchEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onTransitionEnd(value: ReactTransitionEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onVolumeChange(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onWaiting(value: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def onWheel(value: ReactWheelEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLTableDataCellElement with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsPerPageOptions(value: js.Array[Double | Label]): this.type = set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsPerPageOptionsVarargs(value: (Double | Label)*): this.type = set("rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def scope(value: String): this.type = set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valign(value: top | middle | bottom | baseline): this.type = set("valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: /* props */ DefaultComponentPropsTablePaginationUnst): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
