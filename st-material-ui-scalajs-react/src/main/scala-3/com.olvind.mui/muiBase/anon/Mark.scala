package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod.SliderUnstyledInputSlotPropsOverrides
import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod.SliderUnstyledMarkLabelSlotPropsOverrides
import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod.SliderUnstyledMarkSlotPropsOverrides
import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod.SliderUnstyledOwnerState
import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod.SliderUnstyledRailSlotPropsOverrides
import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod.SliderUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod.SliderUnstyledThumbSlotPropsOverrides
import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod.SliderUnstyledTrackSlotPropsOverrides
import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod.SliderUnstyledValueLabelSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mark extends StObject {
  
  var input: js.UndefOr[
    SlotComponentProps["input", SliderUnstyledInputSlotPropsOverrides, SliderUnstyledOwnerState]
  ] = js.undefined
  
  var mark: js.UndefOr[
    SlotComponentProps["span", SliderUnstyledMarkSlotPropsOverrides, SliderUnstyledOwnerState]
  ] = js.undefined
  
  var markLabel: js.UndefOr[
    SlotComponentProps["span", SliderUnstyledMarkLabelSlotPropsOverrides, SliderUnstyledOwnerState]
  ] = js.undefined
  
  var rail: js.UndefOr[
    SlotComponentProps["span", SliderUnstyledRailSlotPropsOverrides, SliderUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["span", SliderUnstyledRootSlotPropsOverrides, SliderUnstyledOwnerState]
  ] = js.undefined
  
  var thumb: js.UndefOr[
    SlotComponentProps["span", SliderUnstyledThumbSlotPropsOverrides, SliderUnstyledOwnerState]
  ] = js.undefined
  
  var track: js.UndefOr[
    SlotComponentProps["span", SliderUnstyledTrackSlotPropsOverrides, SliderUnstyledOwnerState]
  ] = js.undefined
  
  var valueLabel: js.UndefOr[
    SlotComponentProps[ElementType, SliderUnstyledValueLabelSlotPropsOverrides, SliderUnstyledOwnerState]
  ] = js.undefined
}
object Mark {
  
  inline def apply(): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
    
    inline def setInput(
      value: SlotComponentProps["input", SliderUnstyledInputSlotPropsOverrides, SliderUnstyledOwnerState]
    ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: SliderUnstyledOwnerState => Partial[ComponentPropsWithRef["input"]] & SliderUnstyledInputSlotPropsOverrides
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMark(value: SlotComponentProps["span", SliderUnstyledMarkSlotPropsOverrides, SliderUnstyledOwnerState]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkFunction1(
      value: SliderUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SliderUnstyledMarkSlotPropsOverrides
    ): Self = StObject.set(x, "mark", js.Any.fromFunction1(value))
    
    inline def setMarkLabel(
      value: SlotComponentProps["span", SliderUnstyledMarkLabelSlotPropsOverrides, SliderUnstyledOwnerState]
    ): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
    
    inline def setMarkLabelFunction1(
      value: SliderUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SliderUnstyledMarkLabelSlotPropsOverrides
    ): Self = StObject.set(x, "markLabel", js.Any.fromFunction1(value))
    
    inline def setMarkLabelUndefined: Self = StObject.set(x, "markLabel", js.undefined)
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setRail(value: SlotComponentProps["span", SliderUnstyledRailSlotPropsOverrides, SliderUnstyledOwnerState]): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setRailFunction1(
      value: SliderUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SliderUnstyledRailSlotPropsOverrides
    ): Self = StObject.set(x, "rail", js.Any.fromFunction1(value))
    
    inline def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
    
    inline def setRoot(value: SlotComponentProps["span", SliderUnstyledRootSlotPropsOverrides, SliderUnstyledOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SliderUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SliderUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(value: SlotComponentProps["span", SliderUnstyledThumbSlotPropsOverrides, SliderUnstyledOwnerState]): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbFunction1(
      value: SliderUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SliderUnstyledThumbSlotPropsOverrides
    ): Self = StObject.set(x, "thumb", js.Any.fromFunction1(value))
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: SlotComponentProps["span", SliderUnstyledTrackSlotPropsOverrides, SliderUnstyledOwnerState]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: SliderUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SliderUnstyledTrackSlotPropsOverrides
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValueLabel(
      value: SlotComponentProps[ElementType, SliderUnstyledValueLabelSlotPropsOverrides, SliderUnstyledOwnerState]
    ): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    inline def setValueLabelFunction1(
      value: SliderUnstyledOwnerState => Partial[ComponentPropsWithRef[ElementType]] & SliderUnstyledValueLabelSlotPropsOverrides
    ): Self = StObject.set(x, "valueLabel", js.Any.fromFunction1(value))
    
    inline def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
  }
}
