package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledMod.SliderUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.sliderValueLabelUnstyledMod.ValueLabelUnstyledProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkLabel extends StObject {
  
  var mark: js.UndefOr[HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides] = js.undefined
  
  var markLabel: js.UndefOr[HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides] = js.undefined
  
  var rail: js.UndefOr[HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides] = js.undefined
  
  var root: js.UndefOr[HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides] = js.undefined
  
  var thumb: js.UndefOr[HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides] = js.undefined
  
  var track: js.UndefOr[HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides] = js.undefined
  
  var valueLabel: js.UndefOr[
    (ComponentPropsWithRef[js.Function1[/* props */ ValueLabelUnstyledProps, Element]]) & SliderUnstyledComponentsPropsOverrides
  ] = js.undefined
}
object MarkLabel {
  
  inline def apply(): MarkLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkLabel]
  }
  
  extension [Self <: MarkLabel](x: Self) {
    
    inline def setMark(value: HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkLabel(value: HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
    
    inline def setMarkLabelUndefined: Self = StObject.set(x, "markLabel", js.undefined)
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setRail(value: HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
    
    inline def setRoot(value: HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(value: HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: HTMLAttributes[HTMLSpanElement] & SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValueLabel(
      value: (ComponentPropsWithRef[js.Function1[/* props */ ValueLabelUnstyledProps, Element]]) & SliderUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    inline def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
  }
}
