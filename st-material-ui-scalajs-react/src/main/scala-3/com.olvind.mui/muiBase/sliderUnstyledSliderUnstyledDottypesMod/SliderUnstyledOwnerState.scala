package com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderUnstyledOwnerState
  extends StObject
     with SliderUnstyledOwnProps {
  
  @JSName("disabled")
  var disabled_SliderUnstyledOwnerState: Boolean
  
  var dragging: Boolean
  
  var focusedThumbIndex: Double
  
  @JSName("isRtl")
  var isRtl_SliderUnstyledOwnerState: Boolean
  
  var marked: Boolean
  
  @JSName("max")
  var max_SliderUnstyledOwnerState: Double
  
  @JSName("min")
  var min_SliderUnstyledOwnerState: Double
  
  @JSName("orientation")
  var orientation_SliderUnstyledOwnerState: "horizontal" | "vertical"
  
  @JSName("scale")
  def scale_MSliderUnstyledOwnerState(value: Double): Double
  
  @JSName("step")
  var step_SliderUnstyledOwnerState: Double | Null
  
  @JSName("track")
  var track_SliderUnstyledOwnerState: "normal" | false | "inverted"
  
  @JSName("valueLabelFormat")
  var valueLabelFormat_SliderUnstyledOwnerState: String | (js.Function2[/* value */ Double, /* index */ Double, Node])
}
object SliderUnstyledOwnerState {
  
  inline def apply(
    disabled: Boolean,
    dragging: Boolean,
    focusedThumbIndex: Double,
    isRtl: Boolean,
    marked: Boolean,
    max: Double,
    min: Double,
    orientation: "horizontal" | "vertical",
    scale: Double => Double,
    track: "normal" | false | "inverted",
    valueLabelFormat: String | (js.Function2[/* value */ Double, /* index */ Double, Node])
  ): SliderUnstyledOwnerState = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], focusedThumbIndex = focusedThumbIndex.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], scale = js.Any.fromFunction1(scale), track = track.asInstanceOf[js.Any], valueLabelFormat = valueLabelFormat.asInstanceOf[js.Any], step = null)
    __obj.asInstanceOf[SliderUnstyledOwnerState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderUnstyledOwnerState] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setFocusedThumbIndex(value: Double): Self = StObject.set(x, "focusedThumbIndex", value.asInstanceOf[js.Any])
    
    inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    
    inline def setMarked(value: Boolean): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double => Double): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setTrack(value: "normal" | false | "inverted"): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setValueLabelFormat(value: String | (js.Function2[/* value */ Double, /* index */ Double, Node])): Self = StObject.set(x, "valueLabelFormat", value.asInstanceOf[js.Any])
    
    inline def setValueLabelFormatFunction2(value: (/* value */ Double, /* index */ Double) => Node): Self = StObject.set(x, "valueLabelFormat", js.Any.fromFunction2(value))
  }
}
