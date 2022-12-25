package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   track :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   rail :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   thumb :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   mark :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, SliderOwnerState & {}>,   markLabel :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   valueLabel :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Slider/SliderProps.SliderOwnerState>} ]:? @mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, SliderOwnerState & {}>} */
trait Thumb extends StObject {
  
  var input: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerStateAbout]
  ] = js.undefined
  
  var mark: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerStateAccessKey]
  ] = js.undefined
  
  var markLabel: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  ] = js.undefined
  
  var rail: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  ] = js.undefined
  
  var thumb: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  ] = js.undefined
  
  var track: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  ] = js.undefined
  
  var valueLabel: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]
  ] = js.undefined
}
object Thumb {
  
  inline def apply(): Thumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Thumb] (val x: Self) extends AnyVal {
    
    inline def setInput(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerStateAbout]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: SliderOwnerStateAbout => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMark(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerStateAccessKey]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkFunction1(
      value: SliderOwnerStateAccessKey => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "mark", js.Any.fromFunction1(value))
    
    inline def setMarkLabel(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
    
    inline def setMarkLabelFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "markLabel", js.Any.fromFunction1(value))
    
    inline def setMarkLabelUndefined: Self = StObject.set(x, "markLabel", js.undefined)
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setRail(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setRailFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "rail", js.Any.fromFunction1(value))
    
    inline def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "thumb", js.Any.fromFunction1(value))
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValueLabel(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SliderOwnerState]): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    inline def setValueLabelFunction1(
      value: SliderOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "valueLabel", js.Any.fromFunction1(value))
    
    inline def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
  }
}
