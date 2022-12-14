package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderComponentsPropsOverrides
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderOwnerState
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mark extends StObject {
  
  var input: js.UndefOr[SlotComponentProps["input", SliderComponentsPropsOverrides, SliderOwnerState]] = js.undefined
  
  var mark: js.UndefOr[SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]] = js.undefined
  
  var markLabel: js.UndefOr[SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]] = js.undefined
  
  var rail: js.UndefOr[SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]] = js.undefined
  
  var root: js.UndefOr[SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]] = js.undefined
  
  var thumb: js.UndefOr[SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]] = js.undefined
  
  var track: js.UndefOr[SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]] = js.undefined
  
  var valueLabel: js.UndefOr[
    SlotComponentProps[TypeofSliderValueLabelComponent, SliderComponentsPropsOverrides, SliderOwnerState]
  ] = js.undefined
}
object Mark {
  
  inline def apply(): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
    
    inline def setInput(value: SlotComponentProps["input", SliderComponentsPropsOverrides, SliderOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: SliderOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef["input"]] & SliderComponentsPropsOverrides
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMark(value: SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkFunction1(
      value: SliderOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef["span"]] & SliderComponentsPropsOverrides
    ): Self = StObject.set(x, "mark", js.Any.fromFunction1(value))
    
    inline def setMarkLabel(value: SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
    
    inline def setMarkLabelFunction1(
      value: SliderOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef["span"]] & SliderComponentsPropsOverrides
    ): Self = StObject.set(x, "markLabel", js.Any.fromFunction1(value))
    
    inline def setMarkLabelUndefined: Self = StObject.set(x, "markLabel", js.undefined)
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setRail(value: SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setRailFunction1(
      value: SliderOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef["span"]] & SliderComponentsPropsOverrides
    ): Self = StObject.set(x, "rail", js.Any.fromFunction1(value))
    
    inline def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
    
    inline def setRoot(value: SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SliderOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef["span"]] & SliderComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(value: SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbFunction1(
      value: SliderOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef["span"]] & SliderComponentsPropsOverrides
    ): Self = StObject.set(x, "thumb", js.Any.fromFunction1(value))
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: SlotComponentProps["span", SliderComponentsPropsOverrides, SliderOwnerState]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: SliderOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef["span"]] & SliderComponentsPropsOverrides
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValueLabel(
      value: SlotComponentProps[TypeofSliderValueLabelComponent, SliderComponentsPropsOverrides, SliderOwnerState]
    ): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    inline def setValueLabelFunction1(
      value: SliderOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef[TypeofSliderValueLabelComponent]] & SliderComponentsPropsOverrides
    ): Self = StObject.set(x, "valueLabel", js.Any.fromFunction1(value))
    
    inline def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
  }
}
