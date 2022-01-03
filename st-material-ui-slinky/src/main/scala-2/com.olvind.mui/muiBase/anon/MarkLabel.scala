package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledMod.SliderUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.sliderValueLabelUnstyledMod.ValueLabelUnstyledProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkLabel extends StObject {
  
  var mark: js.UndefOr[HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides] = js.native
  
  var markLabel: js.UndefOr[HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides] = js.native
  
  var rail: js.UndefOr[HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides] = js.native
  
  var root: js.UndefOr[HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides] = js.native
  
  var thumb: js.UndefOr[HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides] = js.native
  
  var track: js.UndefOr[HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides] = js.native
  
  var valueLabel: js.UndefOr[
    (ComponentPropsWithRef[js.Function1[/* props */ ValueLabelUnstyledProps, Element]]) with SliderUnstyledComponentsPropsOverrides
  ] = js.native
}
object MarkLabel {
  
  @scala.inline
  def apply(): MarkLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkLabel]
  }
  
  @scala.inline
  implicit class MarkLabelMutableBuilder[Self <: MarkLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMark(value: HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkLabel(value: HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkLabelUndefined: Self = StObject.set(x, "markLabel", js.undefined)
    
    @scala.inline
    def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    @scala.inline
    def setRail(value: HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
    
    @scala.inline
    def setRoot(value: HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setThumb(value: HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    @scala.inline
    def setTrack(value: HTMLAttributes[HTMLSpanElement] with SliderUnstyledComponentsPropsOverrides): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    @scala.inline
    def setValueLabel(
      value: (ComponentPropsWithRef[js.Function1[/* props */ ValueLabelUnstyledProps, Element]]) with SliderUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
  }
}
