package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.MarkLabel
import com.olvind.mui.muiBase.anon.PartialSliderUnstyledClasses
import com.olvind.mui.muiBase.anon.SliderUnstyledTypeMapspanprops
import com.olvind.mui.muiBase.sliderUnstyledUseSliderDottypesMod.Mark
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
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
import com.olvind.mui.react.mod.HTMLAttributes
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
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderUnstyledSliderUnstyledDottypesMod {
  
  trait ExtendSliderUnstyledTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & SliderUnstyledTypeMapspanprops
  }
  object ExtendSliderUnstyledTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & SliderUnstyledTypeMapspanprops
    ): ExtendSliderUnstyledTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendSliderUnstyledTypeMap[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendSliderUnstyledTypeMap[?], M /* <: OverridableTypeMap */] (val x: Self & ExtendSliderUnstyledTypeMap[M]) extends AnyVal {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & SliderUnstyledTypeMapspanprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait SliderUnstyledComponentsPropsOverrides extends StObject
  
  /* Inlined @mui/base.@mui/base/SliderUnstyled/SliderUnstyled.types.SliderUnstyledProps<@mui/base.@mui/base/SliderUnstyled/SliderUnstyled.types.SliderUnstyledTypeMap<{}, 'span'>['defaultComponent']> & {  disabled :boolean,   focusedThumbIndex :number,   isRtl :boolean,   mark :boolean | std.Array<@mui/base.@mui/base/SliderUnstyled/useSlider.types.Mark>,   max :number,   min :number,   orientation :'horizontal' | 'vertical', scale (value : number): number,   step :number | null,   track :'normal' | false | 'inverted',   valueLabelDisplay :'on' | 'auto' | 'off',   valueLabelFormat :string | (value : number, index : number): react.react.ReactNode} */
  @js.native
  trait SliderUnstyledOwnerState extends StObject {
    
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
    
    /**
      * The label of the slider.
      */
    var `aria-label`: js.UndefOr[String] = js.native
    
    /**
      * The id of the element containing a label for the slider.
      */
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
    
    /**
      * A string value that provides a user-friendly name for the current value of the slider.
      */
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[Node] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialSliderUnstyledClasses] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var component: js.UndefOr["span"] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | "inherit"] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    /**
      * The default value. Use when the component is not controlled.
      */
    var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the active thumb doesn't swap when moving pointer over a thumb while dragging another thumb.
      * @default false
      */
    var disableSwap: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the component is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var focusedThumbIndex: Double = js.native
    
    /**
      * Accepts a function which returns a string value that provides a user-friendly name for the thumb labels of the slider.
      * This is important for screen reader users.
      * @param {number} index The thumb label's index to format.
      * @returns {string}
      */
    var getAriaLabel: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
    
    /**
      * Accepts a function which returns a string value that provides a user-friendly name for the current value of the slider.
      * This is important for screen reader users.
      * @param {number} value The thumb label's value to format.
      * @param {number} index The thumb label's index to format.
      * @returns {string}
      */
    var getAriaValueText: js.UndefOr[js.Function2[/* value */ Double, /* index */ Double, String]] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[Any] = js.native
    
    var inputMode: js.UndefOr["none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether the theme context has rtl direction. It is set automatically.
      * @default false
      */
    var isRtl: js.UndefOr[Boolean] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var mark: Boolean | js.Array[Mark] = js.native
    
    /**
      * Marks indicate predetermined values to which the user can move the slider.
      * If `true` the marks are spaced according the value of the `step` prop.
      * If an array, it should contain objects with `value` and an optional `label` keys.
      * @default false
      */
    var marks: js.UndefOr[Boolean | js.Array[Mark]] = js.native
    
    /**
      * The maximum allowed value of the slider.
      * Should not be equal to min.
      * @default 100
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * The minimum allowed value of the slider.
      * Should not be equal to max.
      * @default 0
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * Name attribute of the hidden `input` element.
      */
    var name: js.UndefOr[String] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLSpanElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLSpanElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLSpanElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    /**
      * Callback function that is fired when the slider's value changed.
      *
      * @param {Event} event The event source of the callback.
      * You can pull out the new value by accessing `event.target.value` (any).
      * **Warning**: This is a generic event not a change event.
      * @param {number | number[]} value The new value.
      * @param {number} activeThumb Index of the currently moved thumb.
      */
    var onChange: js.UndefOr[
        js.Function3[
          /* event */ Event, 
          /* value */ Double | js.Array[Double], 
          /* activeThumb */ Double, 
          Unit
        ]
      ] = js.native
    
    /**
      * Callback function that is fired when the `mouseup` is triggered.
      *
      * @param {React.SyntheticEvent | Event} event The event source of the callback. **Warning**: This is a generic event not a change event.
      * @param {number | number[]} value The new value.
      */
    var onChangeCommitted: js.UndefOr[
        js.Function2[
          /* event */ ReactEventFrom[Element] | Event, 
          /* value */ Double | js.Array[Double], 
          Unit
        ]
      ] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLSpanElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLSpanElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLSpanElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLSpanElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLSpanElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLSpanElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.native
    
    var onResize: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLSpanElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLSpanElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLSpanElement]] = js.native
    
    /**
      * The component orientation.
      * @default 'horizontal'
      */
    var orientation: js.UndefOr["horizontal" | "vertical"] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var ref: js.UndefOr[LegacyRef[HTMLSpanElement]] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var role: js.UndefOr[AriaRole] = js.native
    
    /**
      * A transformation function, to change the scale of the slider.
      * @default (x) => x
      */
    var scale: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
    def scale(value: Double): Double = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    /**
      * The props used for each slot inside the Slider.
      * @default {}
      */
    var slotProps: js.UndefOr[com.olvind.mui.muiBase.anon.Mark] = js.native
    
    /**
      * The components used for each slot inside the Slider.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[MarkLabel] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    /**
      * The granularity with which the slider can step through values. (A "discrete" slider.)
      * The `min` prop serves as the origin for the valid values.
      * We recommend (max - min) to be evenly divisible by the step.
      *
      * When step is `null`, the thumb can only be slid onto marks provided with the `marks` prop.
      * @default 1
      */
    var step: js.UndefOr[Double | Null] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    /**
      * Tab index attribute of the hidden `input` element.
      */
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    /**
      * The track presentation:
      *
      * - `normal` the track will render a bar representing the slider value.
      * - `inverted` the track will render a bar representing the remaining slider value.
      * - `false` the track will render without a bar.
      * @default 'normal'
      */
    var track: js.UndefOr["normal" | false | "inverted"] = js.native
    
    var translate: js.UndefOr["yes" | "no"] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr["on" | "off"] = js.native
    
    /**
      * The value of the slider.
      * For ranged sliders, provide an array with two values.
      */
    var value: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * Controls when the value label is displayed:
      *
      * - `auto` the value label will display when the thumb is hovered or focused.
      * - `on` will display persistently.
      * - `off` will never display.
      * @default 'off'
      */
    var valueLabelDisplay: js.UndefOr["on" | "auto" | "off"] = js.native
    
    /**
      * The format function the value label's value.
      *
      * When a function is provided, it should have the following signature:
      *
      * - {number} value The value label's value to format
      * - {number} index The value label's index to format
      * @default (x) => x
      */
    var valueLabelFormat: js.UndefOr[String | (js.Function2[/* value */ Double, /* index */ Double, Node])] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  
  trait SliderValueLabelProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    @JSName("children")
    var children_SliderValueLabelProps: japgolly.scalajs.react.facade.React.Element
    
    var index: Double
    
    var open: Boolean
    
    var value: Double
  }
  object SliderValueLabelProps {
    
    inline def apply(children: VdomElement, index: Double, open: Boolean, value: Double): SliderValueLabelProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderValueLabelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderValueLabelProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
