package com.olvind.mui.muiMaterial.anon

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
import com.olvind.mui.react.mod.LegacyRef
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.PointerEventHandler
import com.olvind.mui.react.mod.ReactEventHandler
import com.olvind.mui.react.mod.TouchEventHandler
import com.olvind.mui.react.mod.TransitionEventHandler
import com.olvind.mui.react.mod.UIEventHandler
import com.olvind.mui.react.mod.WheelEventHandler
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
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/material.@mui/material/ImageListItem.ImageListItemProps<@mui/material.@mui/material/ImageListItem/ImageListItem.ImageListItemTypeMap<{}, 'li'>['defaultComponent'], {}> */
trait ImageListItemPropsImageListItemTypeMapli extends StObject {
  
  var about: js.UndefOr[String] = js.undefined
  
  var accessKey: js.UndefOr[String] = js.undefined
  
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
  
  /**
    * The content of the component, normally an `<img>`.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialImageListItemClasses] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Width of the item in number of grid columns.
    * @default 1
    */
  var cols: js.UndefOr[Double] = js.undefined
  
  var contentEditable: js.UndefOr[Booleanish | "inherit"] = js.undefined
  
  var contextMenu: js.UndefOr[String] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
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
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.undefined
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.undefined
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLLIElement]] = js.undefined
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onChange: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.undefined
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.undefined
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.undefined
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onError: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLLIElement]] = js.undefined
  
  var onInput: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.undefined
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.undefined
  
  var onLoad: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.undefined
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onReset: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  
  var onResize: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onScroll: js.UndefOr[UIEventHandler[HTMLLIElement]] = js.undefined
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onSelect: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.undefined
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.undefined
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLLIElement]] = js.undefined
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  
  var onWheel: js.UndefOr[WheelEventHandler[HTMLLIElement]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var radioGroup: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[HTMLLIElement]] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  var role: js.UndefOr[AriaRole] = js.undefined
  
  /**
    * Height of the item in number of grid rows.
    * @default 1
    */
  var rows: js.UndefOr[Double] = js.undefined
  
  var security: js.UndefOr[String] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
  
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var translate: js.UndefOr["yes" | "no"] = js.undefined
  
  var typeof: js.UndefOr[String] = js.undefined
  
  var unselectable: js.UndefOr["on" | "off"] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  
  var vocab: js.UndefOr[String] = js.undefined
}
object ImageListItemPropsImageListItemTypeMapli {
  
  inline def apply(): ImageListItemPropsImageListItemTypeMapli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageListItemPropsImageListItemTypeMapli]
  }
  
  extension [Self <: ImageListItemPropsImageListItemTypeMapli](x: Self) {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
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
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClasses(value: PartialImageListItemClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
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
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOnAbort(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: ReactFocusEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEnd(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: ReactFocusEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnInput(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadStart(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnResize(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setOnScroll(value: ReactUIEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: ReactWheelEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setRef(value: LegacyRef[HTMLLIElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLLIElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLLIElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
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
    
    inline def setTranslate(value: "yes" | "no"): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: "on" | "off"): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}