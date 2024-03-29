package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabel extends StObject {
  
  /**
    * The label of the slider.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the element containing a label for the slider.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /**
    * A string value that provides a user-friendly name for the current value of the slider.
    */
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  /**
    * @ignore
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialSliderClasses] = js.undefined
  
  /**
    * The color of the component.
    * It supports both default and custom theme colors, which can be added as shown in the
    * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
    * @default 'primary'
    */
  var color: js.UndefOr["primary" | "secondary"] = js.undefined
  
  /**
    * The components used for each slot inside.
    *
    * This prop is an alias for the `slots` prop.
    * It's recommended to use the `slots` prop instead.
    *
    * @default {}
    */
  var components: js.UndefOr[MarkLabel] = js.undefined
  
  /**
    * The extra props for the slot components.
    * You can override the existing props or add new ones.
    *
    * This prop is an alias for the `slotProps` prop.
    * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
    *
    * @default {}
    */
  var componentsProps: js.UndefOr[Mark] = js.undefined
  
  /**
    * The default value. Use when the component is not controlled.
    */
  var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * If `true`, the active thumb doesn't swap when moving pointer over a thumb while dragging another thumb.
    * @default false
    */
  var disableSwap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Accepts a function which returns a string value that provides a user-friendly name for the thumb labels of the slider.
    * This is important for screen reader users.
    * @param {number} index The thumb label's index to format.
    * @returns {string}
    */
  var getAriaLabel: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  
  /**
    * Accepts a function which returns a string value that provides a user-friendly name for the current value of the slider.
    * This is important for screen reader users.
    * @param {number} value The thumb label's value to format.
    * @param {number} index The thumb label's index to format.
    * @returns {string}
    */
  var getAriaValueText: js.UndefOr[js.Function2[/* value */ Double, /* index */ Double, String]] = js.undefined
  
  /**
    * Marks indicate predetermined values to which the user can move the slider.
    * If `true` the marks are spaced according the value of the `step` prop.
    * If an array, it should contain objects with `value` and an optional `label` keys.
    * @default false
    */
  var marks: js.UndefOr[Boolean | js.Array[com.olvind.mui.muiBase.useSliderUseSliderDottypesMod.Mark]] = js.undefined
  
  /**
    * The maximum allowed value of the slider.
    * Should not be equal to min.
    * @default 100
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum allowed value of the slider.
    * Should not be equal to max.
    * @default 0
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Name attribute of the hidden `input` element.
    */
  var name: js.UndefOr[String] = js.undefined
  
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
  ] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * The component orientation.
    * @default 'horizontal'
    */
  var orientation: js.UndefOr["horizontal" | "vertical"] = js.undefined
  
  /**
    * A transformation function, to change the scale of the slider.
    * @param {any} x
    * @returns {any}
    * @default function Identity(x) {
    *   return x;
    * }
    */
  var scale: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  
  /**
    * The size of the slider.
    * @default 'medium'
    */
  var size: js.UndefOr["small" | "medium"] = js.undefined
  
  /**
    * The props used for each slot inside the Slider.
    * @default {}
    */
  var slotProps: js.UndefOr[Mark] = js.undefined
  
  /**
    * The components used for each slot inside the Slider.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var slots: js.UndefOr[Rail] = js.undefined
  
  /**
    * The granularity with which the slider can step through values. (A "discrete" slider.)
    * The `min` prop serves as the origin for the valid values.
    * We recommend (max - min) to be evenly divisible by the step.
    *
    * When step is `null`, the thumb can only be slid onto marks provided with the `marks` prop.
    * @default 1
    */
  var step: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  
  /**
    * Tab index attribute of the hidden `input` element.
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The track presentation:
    *
    * - `normal` the track will render a bar representing the slider value.
    * - `inverted` the track will render a bar representing the remaining slider value.
    * - `false` the track will render without a bar.
    * @default 'normal'
    */
  var track: js.UndefOr["normal" | false | "inverted"] = js.undefined
  
  /**
    * The value of the slider.
    * For ranged sliders, provide an array with two values.
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * Controls when the value label is displayed:
    *
    * - `auto` the value label will display when the thumb is hovered or focused.
    * - `on` will display persistently.
    * - `off` will never display.
    * @default 'off'
    */
  var valueLabelDisplay: js.UndefOr["on" | "auto" | "off"] = js.undefined
  
  /**
    * The format function the value label's value.
    *
    * When a function is provided, it should have the following signature:
    *
    * - {number} value The value label's value to format
    * - {number} index The value label's index to format
    * @param {any} x
    * @returns {any}
    * @default function Identity(x) {
    *   return x;
    * }
    */
  var valueLabelFormat: js.UndefOr[
    String | (js.Function2[/* value */ Double, /* index */ Double, japgolly.scalajs.react.facade.React.Node])
  ] = js.undefined
}
object Arialabel {
  
  inline def apply(): Arialabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arialabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arialabel] (val x: Self) extends AnyVal {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClasses(value: PartialSliderClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(value: "primary" | "secondary"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComponents(value: MarkLabel): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: Mark): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDefaultValue(value: Double | js.Array[Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: Double*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDisableSwap(value: Boolean): Self = StObject.set(x, "disableSwap", value.asInstanceOf[js.Any])
    
    inline def setDisableSwapUndefined: Self = StObject.set(x, "disableSwap", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setGetAriaLabel(value: /* index */ Double => String): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction1(value))
    
    inline def setGetAriaLabelUndefined: Self = StObject.set(x, "getAriaLabel", js.undefined)
    
    inline def setGetAriaValueText(value: (/* value */ Double, /* index */ Double) => String): Self = StObject.set(x, "getAriaValueText", js.Any.fromFunction2(value))
    
    inline def setGetAriaValueTextUndefined: Self = StObject.set(x, "getAriaValueText", js.undefined)
    
    inline def setMarks(value: Boolean | js.Array[com.olvind.mui.muiBase.useSliderUseSliderDottypesMod.Mark]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setMarksVarargs(value: com.olvind.mui.muiBase.useSliderUseSliderDottypesMod.Mark*): Self = StObject.set(x, "marks", js.Array(value*))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(
      value: (/* event */ Event, /* value */ Double | js.Array[Double], /* activeThumb */ Double) => Callback
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* event */ Event, t1: /* value */ Double | js.Array[Double], t2: /* activeThumb */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnChangeCommitted(
      value: (/* event */ ReactEventFrom[Element] | Event, /* value */ Double | js.Array[Double]) => Callback
    ): Self = StObject.set(x, "onChangeCommitted", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element] | Event, t1: /* value */ Double | js.Array[Double]) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeCommittedUndefined: Self = StObject.set(x, "onChangeCommitted", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setScale(value: /* value */ Double => Double): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSize(value: "small" | "medium"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlotProps(value: Mark): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: Rail): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTrack(value: "normal" | false | "inverted"): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueLabelDisplay(value: "on" | "auto" | "off"): Self = StObject.set(x, "valueLabelDisplay", value.asInstanceOf[js.Any])
    
    inline def setValueLabelDisplayUndefined: Self = StObject.set(x, "valueLabelDisplay", js.undefined)
    
    inline def setValueLabelFormat(
      value: String | (js.Function2[/* value */ Double, /* index */ Double, japgolly.scalajs.react.facade.React.Node])
    ): Self = StObject.set(x, "valueLabelFormat", value.asInstanceOf[js.Any])
    
    inline def setValueLabelFormatFunction2(value: (/* value */ Double, /* index */ Double) => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "valueLabelFormat", js.Any.fromFunction2(value))
    
    inline def setValueLabelFormatUndefined: Self = StObject.set(x, "valueLabelFormat", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
