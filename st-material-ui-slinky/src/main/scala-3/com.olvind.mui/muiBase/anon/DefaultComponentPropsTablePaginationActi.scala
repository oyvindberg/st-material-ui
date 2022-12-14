package com.olvind.mui.muiBase.anon

import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AnimationEventHandler
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.ClipboardEventHandler
import com.olvind.mui.react.mod.CompositionEventHandler
import com.olvind.mui.react.mod.DragEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.FormEventHandler
import com.olvind.mui.react.mod.Key
import com.olvind.mui.react.mod.KeyboardEventHandler
import com.olvind.mui.react.mod.LegacyRef
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.PointerEventHandler
import com.olvind.mui.react.mod.ReactEventHandler
import com.olvind.mui.react.mod.TouchEventHandler
import com.olvind.mui.react.mod.TransitionEventHandler
import com.olvind.mui.react.mod.UIEventHandler
import com.olvind.mui.react.mod.WheelEventHandler
import org.scalajs.dom.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/types.@mui/types.DefaultComponentProps<@mui/base.@mui/base/TablePaginationUnstyled/TablePaginationActionsUnstyled.types.TablePaginationActionsUnstyledTypeMap<{}, 'button'>> */
@js.native
trait DefaultComponentPropsTablePaginationActi extends StObject {
  
  var about: js.UndefOr[String] = js.native
  
  var accessKey: js.UndefOr[String] = js.native
  
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  
  var `aria-atomic`: js.UndefOr[Booleanish] = js.native
  
  var `aria-autocomplete`: js.UndefOr["none" | "inline" | "list" | "both"] = js.native
  
  var `aria-busy`: js.UndefOr[Booleanish] = js.native
  
  var `aria-checked`: js.UndefOr[Boolean | "mixed"] = js.native
  
  var `aria-colcount`: js.UndefOr[Double] = js.native
  
  var `aria-colindex`: js.UndefOr[Double] = js.native
  
  var `aria-colspan`: js.UndefOr[Double] = js.native
  
  var `aria-controls`: js.UndefOr[String] = js.native
  
  var `aria-current`: js.UndefOr[Boolean | "page" | "step" | "location" | "date" | "time"] = js.native
  
  var `aria-describedby`: js.UndefOr[String] = js.native
  
  var `aria-details`: js.UndefOr[String] = js.native
  
  var `aria-disabled`: js.UndefOr[Booleanish] = js.native
  
  var `aria-dropeffect`: js.UndefOr["none" | "copy" | "execute" | "link" | "move" | "popup"] = js.native
  
  var `aria-errormessage`: js.UndefOr[String] = js.native
  
  var `aria-expanded`: js.UndefOr[Booleanish] = js.native
  
  var `aria-flowto`: js.UndefOr[String] = js.native
  
  var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
  
  var `aria-haspopup`: js.UndefOr[Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"] = js.native
  
  var `aria-hidden`: js.UndefOr[Booleanish] = js.native
  
  var `aria-invalid`: js.UndefOr[Boolean | "grammar" | "spelling"] = js.native
  
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  var `aria-level`: js.UndefOr[Double] = js.native
  
  var `aria-live`: js.UndefOr["off" | "assertive" | "polite"] = js.native
  
  var `aria-modal`: js.UndefOr[Booleanish] = js.native
  
  var `aria-multiline`: js.UndefOr[Booleanish] = js.native
  
  var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
  
  var `aria-orientation`: js.UndefOr["horizontal" | "vertical"] = js.native
  
  var `aria-owns`: js.UndefOr[String] = js.native
  
  var `aria-placeholder`: js.UndefOr[String] = js.native
  
  var `aria-posinset`: js.UndefOr[Double] = js.native
  
  var `aria-pressed`: js.UndefOr[Boolean | "mixed"] = js.native
  
  var `aria-readonly`: js.UndefOr[Booleanish] = js.native
  
  var `aria-relevant`: js.UndefOr[
    "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
  ] = js.native
  
  var `aria-required`: js.UndefOr[Booleanish] = js.native
  
  var `aria-roledescription`: js.UndefOr[String] = js.native
  
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  
  var `aria-selected`: js.UndefOr[Booleanish] = js.native
  
  var `aria-setsize`: js.UndefOr[Double] = js.native
  
  var `aria-sort`: js.UndefOr["none" | "ascending" | "descending" | "other"] = js.native
  
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  
  var `aria-valuetext`: js.UndefOr[String] = js.native
  
  var autoCapitalize: js.UndefOr[String] = js.native
  
  var autoCorrect: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autoSave: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[js.Object] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var contentEditable: js.UndefOr[Booleanish | "inherit"] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var count: Double = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var defaultChecked: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  /**
    * Direction of the text.
    * @default 'ltr'
    */
  var direction: js.UndefOr["ltr" | "rtl"] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var form: js.UndefOr[String] = js.native
  
  var formAction: js.UndefOr[String] = js.native
  
  var formEncType: js.UndefOr[String] = js.native
  
  var formMethod: js.UndefOr[String] = js.native
  
  var formNoValidate: js.UndefOr[Boolean] = js.native
  
  var formTarget: js.UndefOr[String] = js.native
  
  /**
    * Accepts a function which returns a string value that provides a user-friendly name for the current page.
    * This is important for screen reader users.
    *
    * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
    * @param {string} type The link or button type to format ('first' | 'last' | 'next' | 'previous').
    * @returns {string}
    */
  @JSName("getItemAriaLabel")
  @scala.annotation.targetName("getItemAriaLabel_first_last_next_previous")
  def getItemAriaLabel(`type`: "first" | "last" | "next" | "previous", page: Double): String = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inlist: js.UndefOr[Any] = js.native
  
  var inputMode: js.UndefOr["none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"] = js.native
  
  var is: js.UndefOr[String] = js.native
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[Key | Null] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onChange: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onError: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
  
  var onInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  
  var onLoad: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  def onPageChange(event: Null, page: Double): Unit = js.native
  def onPageChange(event: SyntheticMouseEvent[HTMLButtonElement], page: Double): Unit = js.native
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onReset: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  
  var onResize: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onScroll: js.UndefOr[UIEventHandler[HTMLButtonElement]] = js.native
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onSelect: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLButtonElement]] = js.native
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  
  var onWheel: js.UndefOr[WheelEventHandler[HTMLButtonElement]] = js.native
  
  var page: Double = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var radioGroup: js.UndefOr[String] = js.native
  
  var ref: js.UndefOr[LegacyRef[HTMLButtonElement]] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var role: js.UndefOr[AriaRole] = js.native
  
  var rowsPerPage: Double = js.native
  
  var security: js.UndefOr[String] = js.native
  
  var showFirstButton: Boolean = js.native
  
  var showLastButton: Boolean = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  /**
    * The props used for each slot inside the TablePagination.
    * @default {}
    */
  var slotProps: js.UndefOr[FirstButton] = js.native
  
  /**
    * The components used for each slot inside the TablePagination.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var slots: js.UndefOr[BackButton] = js.native
  
  var spellCheck: js.UndefOr[Booleanish] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var translate: js.UndefOr["yes" | "no"] = js.native
  
  var `type`: js.UndefOr["submit" | "reset" | "button"] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var unselectable: js.UndefOr["on" | "off"] = js.native
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  
  var vocab: js.UndefOr[String] = js.native
}
