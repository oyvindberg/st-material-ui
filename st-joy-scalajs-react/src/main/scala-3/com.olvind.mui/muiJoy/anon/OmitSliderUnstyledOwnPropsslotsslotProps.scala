package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiBase.anon.PartialSliderUnstyledClasses
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@mui/base.@mui/base/SliderUnstyled.SliderUnstyledOwnProps, 'slots' | 'slotProps'> */
trait OmitSliderUnstyledOwnPropsslotsslotProps extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  var classes: js.UndefOr[PartialSliderUnstyledClasses] = js.undefined
  
  var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var disableSwap: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var getAriaLabel: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  
  var getAriaValueText: js.UndefOr[js.Function2[/* value */ Double, /* index */ Double, String]] = js.undefined
  
  var isRtl: js.UndefOr[Boolean] = js.undefined
  
  var marks: js.UndefOr[
    Boolean | js.Array[com.olvind.mui.muiBase.sliderUnstyledUseSliderDottypesMod.Mark]
  ] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function3[
      /* event */ Event, 
      /* value */ Double | js.Array[Double], 
      /* activeThumb */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onChangeCommitted: js.UndefOr[
    js.Function2[
      /* event */ ReactEventFrom[Element] | Event, 
      /* value */ Double | js.Array[Double], 
      Unit
    ]
  ] = js.undefined
  
  var orientation: js.UndefOr["horizontal" | "vertical"] = js.undefined
  
  var scale: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  
  var step: js.UndefOr[Double | Null] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var track: js.UndefOr["normal" | false | "inverted"] = js.undefined
  
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var valueLabelDisplay: js.UndefOr["on" | "auto" | "off"] = js.undefined
  
  var valueLabelFormat: js.UndefOr[String | (js.Function2[/* value */ Double, /* index */ Double, Node])] = js.undefined
}
object OmitSliderUnstyledOwnPropsslotsslotProps {
  
  inline def apply(): OmitSliderUnstyledOwnPropsslotsslotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitSliderUnstyledOwnPropsslotsslotProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitSliderUnstyledOwnPropsslotsslotProps] (val x: Self) extends AnyVal {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setClasses(value: PartialSliderUnstyledClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
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
    
    inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    
    inline def setIsRtlUndefined: Self = StObject.set(x, "isRtl", js.undefined)
    
    inline def setMarks(value: Boolean | js.Array[com.olvind.mui.muiBase.sliderUnstyledUseSliderDottypesMod.Mark]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setMarksVarargs(value: com.olvind.mui.muiBase.sliderUnstyledUseSliderDottypesMod.Mark*): Self = StObject.set(x, "marks", js.Array(value*))
    
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
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTrack(value: "normal" | false | "inverted"): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueLabelDisplay(value: "on" | "auto" | "off"): Self = StObject.set(x, "valueLabelDisplay", value.asInstanceOf[js.Any])
    
    inline def setValueLabelDisplayUndefined: Self = StObject.set(x, "valueLabelDisplay", js.undefined)
    
    inline def setValueLabelFormat(value: String | (js.Function2[/* value */ Double, /* index */ Double, Node])): Self = StObject.set(x, "valueLabelFormat", value.asInstanceOf[js.Any])
    
    inline def setValueLabelFormatFunction2(value: (/* value */ Double, /* index */ Double) => Node): Self = StObject.set(x, "valueLabelFormat", js.Any.fromFunction2(value))
    
    inline def setValueLabelFormatUndefined: Self = StObject.set(x, "valueLabelFormat", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
