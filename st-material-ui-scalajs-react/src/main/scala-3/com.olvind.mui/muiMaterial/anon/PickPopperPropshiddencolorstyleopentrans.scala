package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.anon.Placement
import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledMod.PopperPlacementType
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
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
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.PointerEventHandler
import com.olvind.mui.react.mod.ReactEventHandler
import com.olvind.mui.react.mod.TouchEventHandler
import com.olvind.mui.react.mod.TransitionEventHandler
import com.olvind.mui.react.mod.UIEventHandler
import com.olvind.mui.react.mod.WheelEventHandler
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined Pick<PopperProps, 'hidden' | 'color' | 'style' | 'open' | 'translate' | 'transition' | 'slot' | 'title' | 'key' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'nonce' | 'placeholder' | 'spellCheck' | 'tabIndex' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onResize' | 'onResizeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'component' | 'sx' | 'components' | 'container' | 'placement' | 'disablePortal' | 'modifiers' | 'anchorEl' | 'keepMounted' | 'popperOptions' | 'popperRef' | 'slotProps' | 'slots' | 'componentsProps'> & react.react.RefAttributes<std.HTMLDivElement> */
trait PickPopperPropshiddencolorstyleopentrans extends StObject {
  
  var about: js.UndefOr[String] = js.undefined
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  var anchorEl: js.UndefOr[
    Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
    ])
  ] = js.undefined
  
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  
  var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-autocomplete`: js.UndefOr["none" | "inline" | "list" | "both"] = js.undefined
  
  var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-checked`: js.UndefOr[Boolean | "mixed"] = js.undefined
  
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  
  var `aria-controls`: js.UndefOr[String] = js.undefined
  
  var `aria-current`: js.UndefOr[Boolean | "page" | "step" | "location" | "date" | "time"] = js.undefined
  
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  var `aria-details`: js.UndefOr[String] = js.undefined
  
  var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-dropeffect`: js.UndefOr["none" | "copy" | "execute" | "link" | "move" | "popup"] = js.undefined
  
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  
  var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  
  var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-haspopup`: js.UndefOr[Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"] = js.undefined
  
  var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-invalid`: js.UndefOr[Boolean | "grammar" | "spelling"] = js.undefined
  
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var `aria-level`: js.UndefOr[Double] = js.undefined
  
  var `aria-live`: js.UndefOr["off" | "assertive" | "polite"] = js.undefined
  
  var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-orientation`: js.UndefOr["horizontal" | "vertical"] = js.undefined
  
  var `aria-owns`: js.UndefOr[String] = js.undefined
  
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  
  var `aria-pressed`: js.UndefOr[Boolean | "mixed"] = js.undefined
  
  var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-relevant`: js.UndefOr[
    "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
  ] = js.undefined
  
  var `aria-required`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  
  var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
  
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  
  var `aria-sort`: js.UndefOr["none" | "ascending" | "descending" | "other"] = js.undefined
  
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  var autoCapitalize: js.UndefOr[String] = js.undefined
  
  var autoCorrect: js.UndefOr[String] = js.undefined
  
  var autoSave: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[
    japgolly.scalajs.react.facade.React.Node | (js.Function1[/* props */ Placement, japgolly.scalajs.react.facade.React.Node])
  ] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr["div"] = js.undefined
  
  var components: js.UndefOr[Root] = js.undefined
  
  var componentsProps: js.UndefOr[com.olvind.mui.muiBase.anon.`7`] = js.undefined
  
  var container: js.UndefOr[Element | (js.Function0[Element | Null]) | Null] = js.undefined
  
  var contentEditable: js.UndefOr[Booleanish | "inherit"] = js.undefined
  
  var contextMenu: js.UndefOr[String] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var disablePortal: js.UndefOr[Boolean] = js.undefined
  
  var draggable: js.UndefOr[Booleanish] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inlist: js.UndefOr[Any] = js.undefined
  
  var inputMode: js.UndefOr["none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"] = js.undefined
  
  var is: js.UndefOr[String] = js.undefined
  
  var itemID: js.UndefOr[String] = js.undefined
  
  var itemProp: js.UndefOr[String] = js.undefined
  
  var itemRef: js.UndefOr[String] = js.undefined
  
  var itemScope: js.UndefOr[Boolean] = js.undefined
  
  var itemType: js.UndefOr[String] = js.undefined
  
  var keepMounted: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var modifiers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
  ] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onAbortCapture: js.UndefOr[Any] = js.undefined
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
  
  var onAnimationEndCapture: js.UndefOr[Any] = js.undefined
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
  
  var onAnimationIterationCapture: js.UndefOr[Any] = js.undefined
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
  
  var onAnimationStartCapture: js.UndefOr[Any] = js.undefined
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onAuxClickCapture: js.UndefOr[Any] = js.undefined
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  
  var onBeforeInputCapture: js.UndefOr[Any] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
  
  var onBlurCapture: js.UndefOr[Any] = js.undefined
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onCanPlayCapture: js.UndefOr[Any] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onCanPlayThroughCapture: js.UndefOr[Any] = js.undefined
  
  var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  
  var onChangeCapture: js.UndefOr[Any] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onClickCapture: js.UndefOr[Any] = js.undefined
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
  
  var onCompositionEndCapture: js.UndefOr[Any] = js.undefined
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
  
  var onCompositionStartCapture: js.UndefOr[Any] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
  
  var onCompositionUpdateCapture: js.UndefOr[Any] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onContextMenuCapture: js.UndefOr[Any] = js.undefined
  
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onCopyCapture: js.UndefOr[Any] = js.undefined
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onCutCapture: js.UndefOr[Any] = js.undefined
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onDoubleClickCapture: js.UndefOr[Any] = js.undefined
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  
  var onDragCapture: js.UndefOr[Any] = js.undefined
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  
  var onDragEndCapture: js.UndefOr[Any] = js.undefined
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  
  var onDragEnterCapture: js.UndefOr[Any] = js.undefined
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  
  var onDragExitCapture: js.UndefOr[Any] = js.undefined
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  
  var onDragLeaveCapture: js.UndefOr[Any] = js.undefined
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  
  var onDragOverCapture: js.UndefOr[Any] = js.undefined
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  
  var onDragStartCapture: js.UndefOr[Any] = js.undefined
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  
  var onDropCapture: js.UndefOr[Any] = js.undefined
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onDurationChangeCapture: js.UndefOr[Any] = js.undefined
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onEmptiedCapture: js.UndefOr[Any] = js.undefined
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onEncryptedCapture: js.UndefOr[Any] = js.undefined
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onEndedCapture: js.UndefOr[Any] = js.undefined
  
  var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onErrorCapture: js.UndefOr[Any] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
  
  var onFocusCapture: js.UndefOr[Any] = js.undefined
  
  var onGotPointerCapture: js.UndefOr[Any] = js.undefined
  
  var onGotPointerCaptureCapture: js.UndefOr[Any] = js.undefined
  
  var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  
  var onInputCapture: js.UndefOr[Any] = js.undefined
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  
  var onInvalidCapture: js.UndefOr[Any] = js.undefined
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onKeyDownCapture: js.UndefOr[Any] = js.undefined
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onKeyPressCapture: js.UndefOr[Any] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onKeyUpCapture: js.UndefOr[Any] = js.undefined
  
  var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onLoadCapture: js.UndefOr[Any] = js.undefined
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onLoadStartCapture: js.UndefOr[Any] = js.undefined
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onLoadedDataCapture: js.UndefOr[Any] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onLoadedMetadataCapture: js.UndefOr[Any] = js.undefined
  
  var onLostPointerCapture: js.UndefOr[Any] = js.undefined
  
  var onLostPointerCaptureCapture: js.UndefOr[Any] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onMouseDownCapture: js.UndefOr[Any] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onMouseMoveCapture: js.UndefOr[Any] = js.undefined
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onMouseOutCapture: js.UndefOr[Any] = js.undefined
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onMouseOverCapture: js.UndefOr[Any] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onMouseUpCapture: js.UndefOr[Any] = js.undefined
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onPasteCapture: js.UndefOr[Any] = js.undefined
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onPauseCapture: js.UndefOr[Any] = js.undefined
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onPlayCapture: js.UndefOr[Any] = js.undefined
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onPlayingCapture: js.UndefOr[Any] = js.undefined
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[Any] = js.undefined
  
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[Any] = js.undefined
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[Any] = js.undefined
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[Any] = js.undefined
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[Any] = js.undefined
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  
  var onPointerOutCapture: js.UndefOr[Any] = js.undefined
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  
  var onPointerOverCapture: js.UndefOr[Any] = js.undefined
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[Any] = js.undefined
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onProgressCapture: js.UndefOr[Any] = js.undefined
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onRateChangeCapture: js.UndefOr[Any] = js.undefined
  
  var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  
  var onResetCapture: js.UndefOr[Any] = js.undefined
  
  var onResize: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onResizeCapture: js.UndefOr[Any] = js.undefined
  
  var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
  
  var onScrollCapture: js.UndefOr[Any] = js.undefined
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onSeekedCapture: js.UndefOr[Any] = js.undefined
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onSeekingCapture: js.UndefOr[Any] = js.undefined
  
  var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onSelectCapture: js.UndefOr[Any] = js.undefined
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onStalledCapture: js.UndefOr[Any] = js.undefined
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  
  var onSubmitCapture: js.UndefOr[Any] = js.undefined
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onSuspendCapture: js.UndefOr[Any] = js.undefined
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onTimeUpdateCapture: js.UndefOr[Any] = js.undefined
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  
  var onTouchCancelCapture: js.UndefOr[Any] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[Any] = js.undefined
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  
  var onTouchMoveCapture: js.UndefOr[Any] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  
  var onTouchStartCapture: js.UndefOr[Any] = js.undefined
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.undefined
  
  var onTransitionEndCapture: js.UndefOr[Any] = js.undefined
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onVolumeChangeCapture: js.UndefOr[Any] = js.undefined
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  
  var onWaitingCapture: js.UndefOr[Any] = js.undefined
  
  var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.undefined
  
  var onWheelCapture: js.UndefOr[Any] = js.undefined
  
  var open: Boolean
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var placement: js.UndefOr[PopperPlacementType] = js.undefined
  
  var popperOptions: js.UndefOr[js.Object] = js.undefined
  
  var popperRef: js.UndefOr[
    com.olvind.mui.react.mod.Ref[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
    ]
  ] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var radioGroup: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[HTMLDivElement]] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  var role: js.UndefOr[AriaRole] = js.undefined
  
  var security: js.UndefOr[String] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
  
  var slotProps: js.UndefOr[com.olvind.mui.muiBase.anon.`7`] = js.undefined
  
  var slots: js.UndefOr[com.olvind.mui.muiBase.anon.`1`] = js.undefined
  
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[Boolean] = js.undefined
  
  var translate: js.UndefOr["yes" | "no"] = js.undefined
  
  var typeof: js.UndefOr[String] = js.undefined
  
  var unselectable: js.UndefOr["on" | "off"] = js.undefined
  
  var vocab: js.UndefOr[String] = js.undefined
}
object PickPopperPropshiddencolorstyleopentrans {
  
  inline def apply(open: Boolean): PickPopperPropshiddencolorstyleopentrans = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPopperPropshiddencolorstyleopentrans]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickPopperPropshiddencolorstyleopentrans] (val x: Self) extends AnyVal {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAnchorEl(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
        ])
    ): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
    
    inline def setAnchorElCallbackTo(
      value: CallbackTo[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
        ]
    ): Self = StObject.set(x, "anchorEl", value.toJsFn)
    
    inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
    
    inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    inline def `setAria-autocomplete`(value: "none" | "inline" | "list" | "both"): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    inline def `setAria-checked`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def `setAria-current`(value: Boolean | "page" | "step" | "location" | "date" | "time"): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-dropeffect`(value: "none" | "copy" | "execute" | "link" | "move" | "popup"): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    inline def `setAria-invalid`(value: Boolean | "grammar" | "spelling"): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    inline def `setAria-live`(value: "off" | "assertive" | "polite"): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    inline def `setAria-orientation`(value: "horizontal" | "vertical"): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    inline def `setAria-pressed`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    inline def `setAria-relevant`(
      value: "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    inline def `setAria-sort`(value: "none" | "ascending" | "descending" | "other"): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setChildren(
      value: japgolly.scalajs.react.facade.React.Node | (js.Function1[/* props */ Placement, japgolly.scalajs.react.facade.React.Node])
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* props */ Placement => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComponent(value: "div"): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponents(value: Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: com.olvind.mui.muiBase.anon.`7`): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setContainer(value: Element | (js.Function0[Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerCallbackTo(value: CallbackTo[Element | Null]): Self = StObject.set(x, "container", value.toJsFn)
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContentEditable(value: Booleanish | "inherit"): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
    
    inline def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
    
    inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInputMode(value: "none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
    
    inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setModifiers(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
    ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOnAbort(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnAbortCapture(value: Any): Self = StObject.set(x, "onAbortCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnAnimationEndCapture(value: Any): Self = StObject.set(x, "onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnAnimationIterationCapture(value: Any): Self = StObject.set(x, "onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnAnimationStartCapture(value: Any): Self = StObject.set(x, "onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnAuxClickCapture(value: Any): Self = StObject.set(x, "onAuxClickCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnBeforeInputCapture(value: Any): Self = StObject.set(x, "onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: ReactFocusEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnBlurCapture(value: Any): Self = StObject.set(x, "onBlurCapture", value.asInstanceOf[js.Any])
    
    inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayCapture(value: Any): Self = StObject.set(x, "onCanPlayCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
    
    inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayThroughCapture(value: Any): Self = StObject.set(x, "onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnChangeCapture(value: Any): Self = StObject.set(x, "onChangeCapture", value.asInstanceOf[js.Any])
    
    inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnClickCapture(value: Any): Self = StObject.set(x, "onClickCapture", value.asInstanceOf[js.Any])
    
    inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnCompositionEndCapture(value: Any): Self = StObject.set(x, "onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnCompositionStartCapture(value: Any): Self = StObject.set(x, "onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnCompositionUpdateCapture(value: Any): Self = StObject.set(x, "onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnContextMenuCapture(value: Any): Self = StObject.set(x, "onContextMenuCapture", value.asInstanceOf[js.Any])
    
    inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: ReactClipboardEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnCopyCapture(value: Any): Self = StObject.set(x, "onCopyCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: ReactClipboardEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnCutCapture(value: Any): Self = StObject.set(x, "onCutCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDoubleClickCapture(value: Any): Self = StObject.set(x, "onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDragCapture(value: Any): Self = StObject.set(x, "onDragCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
    
    inline def setOnDragEnd(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDragEndCapture(value: Any): Self = StObject.set(x, "onDragEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDragEnterCapture(value: Any): Self = StObject.set(x, "onDragEnterCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDragExitCapture(value: Any): Self = StObject.set(x, "onDragExitCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDragLeaveCapture(value: Any): Self = StObject.set(x, "onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDragOverCapture(value: Any): Self = StObject.set(x, "onDragOverCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDragStartCapture(value: Any): Self = StObject.set(x, "onDragStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDropCapture(value: Any): Self = StObject.set(x, "onDropCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnDurationChangeCapture(value: Any): Self = StObject.set(x, "onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnEmptiedCapture(value: Any): Self = StObject.set(x, "onEmptiedCapture", value.asInstanceOf[js.Any])
    
    inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnEncryptedCapture(value: Any): Self = StObject.set(x, "onEncryptedCapture", value.asInstanceOf[js.Any])
    
    inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnEndedCapture(value: Any): Self = StObject.set(x, "onEndedCapture", value.asInstanceOf[js.Any])
    
    inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnErrorCapture(value: Any): Self = StObject.set(x, "onErrorCapture", value.asInstanceOf[js.Any])
    
    inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: ReactFocusEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnFocusCapture(value: Any): Self = StObject.set(x, "onFocusCapture", value.asInstanceOf[js.Any])
    
    inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnGotPointerCapture(value: Any): Self = StObject.set(x, "onGotPointerCapture", value.asInstanceOf[js.Any])
    
    inline def setOnGotPointerCaptureCapture(value: Any): Self = StObject.set(x, "onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
    
    inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
    
    inline def setOnInput(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnInputCapture(value: Any): Self = StObject.set(x, "onInputCapture", value.asInstanceOf[js.Any])
    
    inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnInvalidCapture(value: Any): Self = StObject.set(x, "onInvalidCapture", value.asInstanceOf[js.Any])
    
    inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnKeyDownCapture(value: Any): Self = StObject.set(x, "onKeyDownCapture", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnKeyPressCapture(value: Any): Self = StObject.set(x, "onKeyPressCapture", value.asInstanceOf[js.Any])
    
    inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnKeyUpCapture(value: Any): Self = StObject.set(x, "onKeyUpCapture", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnLoadCapture(value: Any): Self = StObject.set(x, "onLoadCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
    
    inline def setOnLoadStart(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnLoadStartCapture(value: Any): Self = StObject.set(x, "onLoadStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnLoadedDataCapture(value: Any): Self = StObject.set(x, "onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnLoadedMetadataCapture(value: Any): Self = StObject.set(x, "onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnLostPointerCapture(value: Any): Self = StObject.set(x, "onLostPointerCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLostPointerCaptureCapture(value: Any): Self = StObject.set(x, "onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
    
    inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
    
    inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseDownCapture(value: Any): Self = StObject.set(x, "onMouseDownCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseMoveCapture(value: Any): Self = StObject.set(x, "onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseOutCapture(value: Any): Self = StObject.set(x, "onMouseOutCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseOverCapture(value: Any): Self = StObject.set(x, "onMouseOverCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseUpCapture(value: Any): Self = StObject.set(x, "onMouseUpCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: ReactClipboardEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPasteCapture(value: Any): Self = StObject.set(x, "onPasteCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPauseCapture(value: Any): Self = StObject.set(x, "onPauseCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPlayCapture(value: Any): Self = StObject.set(x, "onPlayCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPlayingCapture(value: Any): Self = StObject.set(x, "onPlayingCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPointerCancelCapture(value: Any): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPointerDownCapture(value: Any): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPointerEnterCapture(value: Any): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCapture(value: Any): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPointerMoveCapture(value: Any): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPointerOutCapture(value: Any): Self = StObject.set(x, "onPointerOutCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPointerOverCapture(value: Any): Self = StObject.set(x, "onPointerOverCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnPointerUpCapture(value: Any): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnProgressCapture(value: Any): Self = StObject.set(x, "onProgressCapture", value.asInstanceOf[js.Any])
    
    inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnRateChangeCapture(value: Any): Self = StObject.set(x, "onRateChangeCapture", value.asInstanceOf[js.Any])
    
    inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnResetCapture(value: Any): Self = StObject.set(x, "onResetCapture", value.asInstanceOf[js.Any])
    
    inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnResize(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnResizeCapture(value: Any): Self = StObject.set(x, "onResizeCapture", value.asInstanceOf[js.Any])
    
    inline def setOnResizeCaptureUndefined: Self = StObject.set(x, "onResizeCapture", js.undefined)
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setOnScroll(value: ReactUIEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnScrollCapture(value: Any): Self = StObject.set(x, "onScrollCapture", value.asInstanceOf[js.Any])
    
    inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnSeekedCapture(value: Any): Self = StObject.set(x, "onSeekedCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnSeekingCapture(value: Any): Self = StObject.set(x, "onSeekingCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnSelectCapture(value: Any): Self = StObject.set(x, "onSelectCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnStalledCapture(value: Any): Self = StObject.set(x, "onStalledCapture", value.asInstanceOf[js.Any])
    
    inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnSubmitCapture(value: Any): Self = StObject.set(x, "onSubmitCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnSuspendCapture(value: Any): Self = StObject.set(x, "onSuspendCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnTimeUpdateCapture(value: Any): Self = StObject.set(x, "onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnTouchCancelCapture(value: Any): Self = StObject.set(x, "onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnTouchEndCapture(value: Any): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnTouchMoveCapture(value: Any): Self = StObject.set(x, "onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnTouchStartCapture(value: Any): Self = StObject.set(x, "onTouchStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnTransitionEndCapture(value: Any): Self = StObject.set(x, "onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnVolumeChangeCapture(value: Any): Self = StObject.set(x, "onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: ReactEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnWaitingCapture(value: Any): Self = StObject.set(x, "onWaitingCapture", value.asInstanceOf[js.Any])
    
    inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: ReactWheelEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnWheelCapture(value: Any): Self = StObject.set(x, "onWheelCapture", value.asInstanceOf[js.Any])
    
    inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPopperOptions(value: js.Object): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
    
    inline def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
    
    inline def setPopperRef(
      value: com.olvind.mui.react.mod.Ref[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
        ]
    ): Self = StObject.set(x, "popperRef", value.asInstanceOf[js.Any])
    
    inline def setPopperRefFunction1(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any) | Null => Callback
    ): Self = StObject.set(x, "popperRef", js.Any.fromFunction1((t0: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any) | Null) => value(t0).runNow()))
    
    inline def setPopperRefNull: Self = StObject.set(x, "popperRef", null)
    
    inline def setPopperRefUndefined: Self = StObject.set(x, "popperRef", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setRef(value: com.olvind.mui.react.mod.Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotProps(value: com.olvind.mui.muiBase.anon.`7`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSlots(value: com.olvind.mui.muiBase.anon.`1`): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setTranslate(value: "yes" | "no"): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: "on" | "off"): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
