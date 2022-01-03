package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.anon.Placement
import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledMod.PopperPlacementType
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
import com.olvind.mui.muiMaterial.muiMaterialStrings.both
import com.olvind.mui.muiMaterial.muiMaterialStrings.copy
import com.olvind.mui.muiMaterial.muiMaterialStrings.date
import com.olvind.mui.muiMaterial.muiMaterialStrings.decimal
import com.olvind.mui.muiMaterial.muiMaterialStrings.descending
import com.olvind.mui.muiMaterial.muiMaterialStrings.dialog
import com.olvind.mui.muiMaterial.muiMaterialStrings.email
import com.olvind.mui.muiMaterial.muiMaterialStrings.execute
import com.olvind.mui.muiMaterial.muiMaterialStrings.grammar
import com.olvind.mui.muiMaterial.muiMaterialStrings.grid
import com.olvind.mui.muiMaterial.muiMaterialStrings.horizontal
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.link
import com.olvind.mui.muiMaterial.muiMaterialStrings.list
import com.olvind.mui.muiMaterial.muiMaterialStrings.listbox
import com.olvind.mui.muiMaterial.muiMaterialStrings.location
import com.olvind.mui.muiMaterial.muiMaterialStrings.menu
import com.olvind.mui.muiMaterial.muiMaterialStrings.mixed
import com.olvind.mui.muiMaterial.muiMaterialStrings.move
import com.olvind.mui.muiMaterial.muiMaterialStrings.no
import com.olvind.mui.muiMaterial.muiMaterialStrings.none
import com.olvind.mui.muiMaterial.muiMaterialStrings.numeric
import com.olvind.mui.muiMaterial.muiMaterialStrings.off
import com.olvind.mui.muiMaterial.muiMaterialStrings.on
import com.olvind.mui.muiMaterial.muiMaterialStrings.other
import com.olvind.mui.muiMaterial.muiMaterialStrings.page
import com.olvind.mui.muiMaterial.muiMaterialStrings.polite
import com.olvind.mui.muiMaterial.muiMaterialStrings.popup
import com.olvind.mui.muiMaterial.muiMaterialStrings.removals
import com.olvind.mui.muiMaterial.muiMaterialStrings.search
import com.olvind.mui.muiMaterial.muiMaterialStrings.spelling
import com.olvind.mui.muiMaterial.muiMaterialStrings.step
import com.olvind.mui.muiMaterial.muiMaterialStrings.tel
import com.olvind.mui.muiMaterial.muiMaterialStrings.text
import com.olvind.mui.muiMaterial.muiMaterialStrings.time
import com.olvind.mui.muiMaterial.muiMaterialStrings.tree
import com.olvind.mui.muiMaterial.muiMaterialStrings.url
import com.olvind.mui.muiMaterial.muiMaterialStrings.vertical
import com.olvind.mui.muiMaterial.muiMaterialStrings.yes
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined Pick<PopperProps, 'hidden' | 'color' | 'style' | 'open' | 'translate' | 'transition' | 'slot' | 'title' | 'children' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'spellCheck' | 'tabIndex' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'container' | 'disablePortal' | 'keepMounted' | 'placement' | 'anchorEl' | 'modifiers' | 'popperOptions' | 'popperRef'> & react.react.RefAttributes<std.HTMLDivElement> */
@js.native
trait PickPopperPropshiddencolorstyleopentrans extends StObject {
  
  var about: js.UndefOr[String] = js.native
  
  var accessKey: js.UndefOr[String] = js.native
  
  var anchorEl: js.UndefOr[
    Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
    ])
  ] = js.native
  
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  
  var `aria-atomic`: js.UndefOr[Booleanish] = js.native
  
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  
  var `aria-busy`: js.UndefOr[Booleanish] = js.native
  
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  
  var `aria-colcount`: js.UndefOr[Double] = js.native
  
  var `aria-colindex`: js.UndefOr[Double] = js.native
  
  var `aria-colspan`: js.UndefOr[Double] = js.native
  
  var `aria-controls`: js.UndefOr[String] = js.native
  
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  
  var `aria-describedby`: js.UndefOr[String] = js.native
  
  var `aria-details`: js.UndefOr[String] = js.native
  
  var `aria-disabled`: js.UndefOr[Booleanish] = js.native
  
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  
  var `aria-errormessage`: js.UndefOr[String] = js.native
  
  var `aria-expanded`: js.UndefOr[Booleanish] = js.native
  
  var `aria-flowto`: js.UndefOr[String] = js.native
  
  var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
  
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  
  var `aria-hidden`: js.UndefOr[Booleanish] = js.native
  
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  var `aria-level`: js.UndefOr[Double] = js.native
  
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  
  var `aria-modal`: js.UndefOr[Booleanish] = js.native
  
  var `aria-multiline`: js.UndefOr[Booleanish] = js.native
  
  var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
  
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  
  var `aria-owns`: js.UndefOr[String] = js.native
  
  var `aria-placeholder`: js.UndefOr[String] = js.native
  
  var `aria-posinset`: js.UndefOr[Double] = js.native
  
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  
  var `aria-readonly`: js.UndefOr[Booleanish] = js.native
  
  var `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.native
  
  var `aria-required`: js.UndefOr[Booleanish] = js.native
  
  var `aria-roledescription`: js.UndefOr[String] = js.native
  
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  
  var `aria-selected`: js.UndefOr[Booleanish] = js.native
  
  var `aria-setsize`: js.UndefOr[Double] = js.native
  
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  
  var `aria-valuetext`: js.UndefOr[String] = js.native
  
  var autoCapitalize: js.UndefOr[String] = js.native
  
  var autoCorrect: js.UndefOr[String] = js.native
  
  var autoSave: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[
    japgolly.scalajs.react.facade.React.Node | (js.Function1[/* props */ Placement, japgolly.scalajs.react.facade.React.Node])
  ] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[Element | (js.Function0[Element | Null]) | Null] = js.native
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var defaultChecked: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var disablePortal: js.UndefOr[Boolean] = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inlist: js.UndefOr[Any] = js.native
  
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  var is: js.UndefOr[String] = js.native
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  var keepMounted: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[Key | Null] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var modifiers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
  ] = js.native
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onAbortCapture: js.UndefOr[Any] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  
  var onAnimationEndCapture: js.UndefOr[Any] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  
  var onAnimationIterationCapture: js.UndefOr[Any] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  
  var onAnimationStartCapture: js.UndefOr[Any] = js.native
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onAuxClickCapture: js.UndefOr[Any] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  
  var onBeforeInputCapture: js.UndefOr[Any] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  
  var onBlurCapture: js.UndefOr[Any] = js.native
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onCanPlayCapture: js.UndefOr[Any] = js.native
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onCanPlayThroughCapture: js.UndefOr[Any] = js.native
  
  var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  
  var onChangeCapture: js.UndefOr[Any] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onClickCapture: js.UndefOr[Any] = js.native
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  
  var onCompositionEndCapture: js.UndefOr[Any] = js.native
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  
  var onCompositionStartCapture: js.UndefOr[Any] = js.native
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  
  var onCompositionUpdateCapture: js.UndefOr[Any] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onContextMenuCapture: js.UndefOr[Any] = js.native
  
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  
  var onCopyCapture: js.UndefOr[Any] = js.native
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  
  var onCutCapture: js.UndefOr[Any] = js.native
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onDoubleClickCapture: js.UndefOr[Any] = js.native
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  
  var onDragCapture: js.UndefOr[Any] = js.native
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  
  var onDragEndCapture: js.UndefOr[Any] = js.native
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  
  var onDragEnterCapture: js.UndefOr[Any] = js.native
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  
  var onDragExitCapture: js.UndefOr[Any] = js.native
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  
  var onDragLeaveCapture: js.UndefOr[Any] = js.native
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  
  var onDragOverCapture: js.UndefOr[Any] = js.native
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  
  var onDragStartCapture: js.UndefOr[Any] = js.native
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  
  var onDropCapture: js.UndefOr[Any] = js.native
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onDurationChangeCapture: js.UndefOr[Any] = js.native
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onEmptiedCapture: js.UndefOr[Any] = js.native
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onEncryptedCapture: js.UndefOr[Any] = js.native
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onEndedCapture: js.UndefOr[Any] = js.native
  
  var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onErrorCapture: js.UndefOr[Any] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  
  var onFocusCapture: js.UndefOr[Any] = js.native
  
  var onGotPointerCapture: js.UndefOr[Any] = js.native
  
  var onGotPointerCaptureCapture: js.UndefOr[Any] = js.native
  
  var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  
  var onInputCapture: js.UndefOr[Any] = js.native
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  
  var onInvalidCapture: js.UndefOr[Any] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onKeyDownCapture: js.UndefOr[Any] = js.native
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onKeyPressCapture: js.UndefOr[Any] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onKeyUpCapture: js.UndefOr[Any] = js.native
  
  var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onLoadCapture: js.UndefOr[Any] = js.native
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onLoadStartCapture: js.UndefOr[Any] = js.native
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onLoadedDataCapture: js.UndefOr[Any] = js.native
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onLoadedMetadataCapture: js.UndefOr[Any] = js.native
  
  var onLostPointerCapture: js.UndefOr[Any] = js.native
  
  var onLostPointerCaptureCapture: js.UndefOr[Any] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseDownCapture: js.UndefOr[Any] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseMoveCapture: js.UndefOr[Any] = js.native
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseOutCapture: js.UndefOr[Any] = js.native
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseOverCapture: js.UndefOr[Any] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseUpCapture: js.UndefOr[Any] = js.native
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  
  var onPasteCapture: js.UndefOr[Any] = js.native
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onPauseCapture: js.UndefOr[Any] = js.native
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onPlayCapture: js.UndefOr[Any] = js.native
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onPlayingCapture: js.UndefOr[Any] = js.native
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  
  var onPointerCancelCapture: js.UndefOr[Any] = js.native
  
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  
  var onPointerDownCapture: js.UndefOr[Any] = js.native
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  
  var onPointerEnterCapture: js.UndefOr[Any] = js.native
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  
  var onPointerLeaveCapture: js.UndefOr[Any] = js.native
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  
  var onPointerMoveCapture: js.UndefOr[Any] = js.native
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  
  var onPointerOutCapture: js.UndefOr[Any] = js.native
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  
  var onPointerOverCapture: js.UndefOr[Any] = js.native
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  
  var onPointerUpCapture: js.UndefOr[Any] = js.native
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onProgressCapture: js.UndefOr[Any] = js.native
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onRateChangeCapture: js.UndefOr[Any] = js.native
  
  var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  
  var onResetCapture: js.UndefOr[Any] = js.native
  
  var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
  
  var onScrollCapture: js.UndefOr[Any] = js.native
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onSeekedCapture: js.UndefOr[Any] = js.native
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onSeekingCapture: js.UndefOr[Any] = js.native
  
  var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onSelectCapture: js.UndefOr[Any] = js.native
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onStalledCapture: js.UndefOr[Any] = js.native
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  
  var onSubmitCapture: js.UndefOr[Any] = js.native
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onSuspendCapture: js.UndefOr[Any] = js.native
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onTimeUpdateCapture: js.UndefOr[Any] = js.native
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  
  var onTouchCancelCapture: js.UndefOr[Any] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  
  var onTouchEndCapture: js.UndefOr[Any] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  
  var onTouchMoveCapture: js.UndefOr[Any] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  
  var onTouchStartCapture: js.UndefOr[Any] = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
  
  var onTransitionEndCapture: js.UndefOr[Any] = js.native
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onVolumeChangeCapture: js.UndefOr[Any] = js.native
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onWaitingCapture: js.UndefOr[Any] = js.native
  
  var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
  
  var onWheelCapture: js.UndefOr[Any] = js.native
  
  var open: Boolean = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var placement: js.UndefOr[PopperPlacementType] = js.native
  
  var popperOptions: js.UndefOr[js.Object] = js.native
  
  var popperRef: js.UndefOr[
    com.olvind.mui.react.mod.Ref[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
    ]
  ] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var radioGroup: js.UndefOr[String] = js.native
  
  var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[HTMLDivElement]] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var role: js.UndefOr[AriaRole] = js.native
  
  var security: js.UndefOr[String] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var spellCheck: js.UndefOr[Booleanish] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var transition: js.UndefOr[Boolean] = js.native
  
  var translate: js.UndefOr[yes | no] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var unselectable: js.UndefOr[on | off] = js.native
  
  var vocab: js.UndefOr[String] = js.native
}
object PickPopperPropshiddencolorstyleopentrans {
  
  @scala.inline
  def apply(open: Boolean): PickPopperPropshiddencolorstyleopentrans = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPopperPropshiddencolorstyleopentrans]
  }
  
  @scala.inline
  implicit class PickPopperPropshiddencolorstyleopentransMutableBuilder[Self <: PickPopperPropshiddencolorstyleopentrans] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    @scala.inline
    def setAnchorEl(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
        ])
    ): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorElCallbackTo(
      value: CallbackTo[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
        ]
    ): Self = StObject.set(x, "anchorEl", value.toJsFn)
    
    @scala.inline
    def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
    
    @scala.inline
    def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    @scala.inline
    def setChildren(
      value: japgolly.scalajs.react.facade.React.Node | (js.Function1[/* props */ Placement, japgolly.scalajs.react.facade.React.Node])
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ Placement => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContainer(value: Element | (js.Function0[Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerCallbackTo(value: CallbackTo[Element | Null]): Self = StObject.set(x, "container", value.toJsFn)
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    @scala.inline
    def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    @scala.inline
    def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setModifiers(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
    ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setOnAbort(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAbortCapture(value: Any): Self = StObject.set(x, "onAbortCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAnimationEndCapture(value: Any): Self = StObject.set(x, "onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAnimationIterationCapture(value: Any): Self = StObject.set(x, "onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAnimationStartCapture(value: Any): Self = StObject.set(x, "onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnAuxClickCapture(value: Any): Self = StObject.set(x, "onAuxClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
    
    @scala.inline
    def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnBeforeInputCapture(value: Any): Self = StObject.set(x, "onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
    
    @scala.inline
    def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: ReactFocusEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnBlurCapture(value: Any): Self = StObject.set(x, "onBlurCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCanPlayCapture(value: Any): Self = StObject.set(x, "onCanPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCanPlayThroughCapture(value: Any): Self = StObject.set(x, "onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    @scala.inline
    def setOnChange(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnChangeCapture(value: Any): Self = StObject.set(x, "onChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnClickCapture(value: Any): Self = StObject.set(x, "onClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCompositionEndCapture(value: Any): Self = StObject.set(x, "onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCompositionStartCapture(value: Any): Self = StObject.set(x, "onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCompositionUpdateCapture(value: Any): Self = StObject.set(x, "onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnContextMenuCapture(value: Any): Self = StObject.set(x, "onContextMenuCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: ReactClipboardEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCopyCapture(value: Any): Self = StObject.set(x, "onCopyCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
    
    @scala.inline
    def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: ReactClipboardEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnCutCapture(value: Any): Self = StObject.set(x, "onCutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
    
    @scala.inline
    def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDoubleClickCapture(value: Any): Self = StObject.set(x, "onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: ReactDragEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragCapture(value: Any): Self = StObject.set(x, "onDragCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: ReactDragEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragEndCapture(value: Any): Self = StObject.set(x, "onDragEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: ReactDragEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragEnterCapture(value: Any): Self = StObject.set(x, "onDragEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: ReactDragEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragExitCapture(value: Any): Self = StObject.set(x, "onDragExitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
    
    @scala.inline
    def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: ReactDragEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragLeaveCapture(value: Any): Self = StObject.set(x, "onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: ReactDragEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragOverCapture(value: Any): Self = StObject.set(x, "onDragOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: ReactDragEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragStartCapture(value: Any): Self = StObject.set(x, "onDragStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnDrop(value: ReactDragEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDropCapture(value: Any): Self = StObject.set(x, "onDropCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDurationChangeCapture(value: Any): Self = StObject.set(x, "onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnEmptiedCapture(value: Any): Self = StObject.set(x, "onEmptiedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnEncryptedCapture(value: Any): Self = StObject.set(x, "onEncryptedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
    
    @scala.inline
    def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnEndedCapture(value: Any): Self = StObject.set(x, "onEndedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnErrorCapture(value: Any): Self = StObject.set(x, "onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: ReactFocusEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnFocusCapture(value: Any): Self = StObject.set(x, "onFocusCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnGotPointerCapture(value: Any): Self = StObject.set(x, "onGotPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGotPointerCaptureCapture(value: Any): Self = StObject.set(x, "onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
    
    @scala.inline
    def setOnInput(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnInputCapture(value: Any): Self = StObject.set(x, "onInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnInvalidCapture(value: Any): Self = StObject.set(x, "onInvalidCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
    
    @scala.inline
    def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnKeyDownCapture(value: Any): Self = StObject.set(x, "onKeyDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnKeyPressCapture(value: Any): Self = StObject.set(x, "onKeyPressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnKeyUpCapture(value: Any): Self = StObject.set(x, "onKeyUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnLoadCapture(value: Any): Self = StObject.set(x, "onLoadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnLoadStartCapture(value: Any): Self = StObject.set(x, "onLoadStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnLoadedDataCapture(value: Any): Self = StObject.set(x, "onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnLoadedMetadataCapture(value: Any): Self = StObject.set(x, "onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnLostPointerCapture(value: Any): Self = StObject.set(x, "onLostPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLostPointerCaptureCapture(value: Any): Self = StObject.set(x, "onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseDownCapture(value: Any): Self = StObject.set(x, "onMouseDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseMoveCapture(value: Any): Self = StObject.set(x, "onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseOutCapture(value: Any): Self = StObject.set(x, "onMouseOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseOverCapture(value: Any): Self = StObject.set(x, "onMouseOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseUpCapture(value: Any): Self = StObject.set(x, "onMouseUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: ReactClipboardEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPasteCapture(value: Any): Self = StObject.set(x, "onPasteCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
    
    @scala.inline
    def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPauseCapture(value: Any): Self = StObject.set(x, "onPauseCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPlayCapture(value: Any): Self = StObject.set(x, "onPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPlayingCapture(value: Any): Self = StObject.set(x, "onPlayingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: ReactPointerEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerCancelCapture(value: Any): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    @scala.inline
    def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: ReactPointerEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerDownCapture(value: Any): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    @scala.inline
    def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: ReactPointerEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerEnterCapture(value: Any): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    @scala.inline
    def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: ReactPointerEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerLeaveCapture(value: Any): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: ReactPointerEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerMoveCapture(value: Any): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: ReactPointerEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerOutCapture(value: Any): Self = StObject.set(x, "onPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: ReactPointerEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerOverCapture(value: Any): Self = StObject.set(x, "onPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: ReactPointerEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnPointerUpCapture(value: Any): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    @scala.inline
    def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnProgressCapture(value: Any): Self = StObject.set(x, "onProgressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnRateChangeCapture(value: Any): Self = StObject.set(x, "onRateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnResetCapture(value: Any): Self = StObject.set(x, "onResetCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
    
    @scala.inline
    def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: ReactUIEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnScrollCapture(value: Any): Self = StObject.set(x, "onScrollCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSeekedCapture(value: Any): Self = StObject.set(x, "onSeekedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSeekingCapture(value: Any): Self = StObject.set(x, "onSeekingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSelectCapture(value: Any): Self = StObject.set(x, "onSelectCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnStalledCapture(value: Any): Self = StObject.set(x, "onStalledCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSubmitCapture(value: Any): Self = StObject.set(x, "onSubmitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnSuspendCapture(value: Any): Self = StObject.set(x, "onSuspendCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTimeUpdateCapture(value: Any): Self = StObject.set(x, "onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: ReactTouchEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchCancelCapture(value: Any): Self = StObject.set(x, "onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: ReactTouchEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchEndCapture(value: Any): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: ReactTouchEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchMoveCapture(value: Any): Self = StObject.set(x, "onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: ReactTouchEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchStartCapture(value: Any): Self = StObject.set(x, "onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTransitionEndCapture(value: Any): Self = StObject.set(x, "onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnVolumeChangeCapture(value: Any): Self = StObject.set(x, "onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: ReactEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnWaitingCapture(value: Any): Self = StObject.set(x, "onWaitingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: ReactWheelEventFrom[HTMLDivElement with Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnWheelCapture(value: Any): Self = StObject.set(x, "onWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPopperOptions(value: js.Object): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
    
    @scala.inline
    def setPopperRef(
      value: com.olvind.mui.react.mod.Ref[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
        ]
    ): Self = StObject.set(x, "popperRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperRefFunction1(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any) | Null => Callback
    ): Self = StObject.set(x, "popperRef", js.Any.fromFunction1((t0: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any) | Null) => value(t0).runNow()))
    
    @scala.inline
    def setPopperRefNull: Self = StObject.set(x, "popperRef", null)
    
    @scala.inline
    def setPopperRefUndefined: Self = StObject.set(x, "popperRef", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    @scala.inline
    def setRef(value: com.olvind.mui.react.mod.Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    @scala.inline
    def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    @scala.inline
    def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
