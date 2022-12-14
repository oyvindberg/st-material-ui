package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.sliderSliderPropsMod.SliderOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkLabel extends StObject {
  
  var input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, SliderOwnerState]
  
  var mark: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState & Percent]
  
  var markLabel: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  
  var rail: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  
  var thumb: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  
  var track: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  
  var valueLabel: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
}
object MarkLabel {
  
  inline def apply(
    input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, SliderOwnerState],
    mark: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState & Percent],
    markLabel: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState],
    rail: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState],
    thumb: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState],
    track: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState],
    valueLabel: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  ): MarkLabel = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], markLabel = markLabel.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], valueLabel = valueLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkLabel] (val x: Self) extends AnyVal {
    
    inline def setInput(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, SliderOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["input"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setMark(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState & Percent]
    ): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkFunction1(
      value: SliderOwnerState & Percent => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "mark", js.Any.fromFunction1(value))
    
    inline def setMarkLabel(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
    
    inline def setMarkLabelFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "markLabel", js.Any.fromFunction1(value))
    
    inline def setRail(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setRailFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "rail", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setThumb(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "thumb", js.Any.fromFunction1(value))
    
    inline def setTrack(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setValueLabel(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    inline def setValueLabelFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "valueLabel", js.Any.fromFunction1(value))
  }
}
