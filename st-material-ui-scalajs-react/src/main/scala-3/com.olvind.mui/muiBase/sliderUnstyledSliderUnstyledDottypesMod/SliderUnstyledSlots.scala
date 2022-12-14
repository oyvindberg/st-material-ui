package com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderUnstyledSlots extends StObject {
  
  /**
    * The component that renders the input.
    * @default 'input'
    */
  var input: js.UndefOr[ElementType] = js.undefined
  
  /**
    * The component that renders the mark.
    * @default 'span'
    */
  var mark: js.UndefOr[ElementType] = js.undefined
  
  /**
    * The component that renders the mark label.
    * @default 'span'
    */
  var markLabel: js.UndefOr[ElementType] = js.undefined
  
  /**
    * The component that renders the rail.
    * @default 'span'
    */
  var rail: js.UndefOr[ElementType] = js.undefined
  
  /**
    * The component that renders the root.
    * @default 'span'
    */
  var root: js.UndefOr[ElementType] = js.undefined
  
  /**
    * The component that renders the thumb.
    * @default 'span'
    */
  var thumb: js.UndefOr[ElementType] = js.undefined
  
  /**
    * The component that renders the track.
    * @default 'span'
    */
  var track: js.UndefOr[ElementType] = js.undefined
  
  /**
    * The component that renders the value label.
    */
  var valueLabel: js.UndefOr[ElementType] = js.undefined
}
object SliderUnstyledSlots {
  
  inline def apply(): SliderUnstyledSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderUnstyledSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderUnstyledSlots] (val x: Self) extends AnyVal {
    
    inline def setInput(value: ElementType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMark(value: ElementType): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkLabel(value: ElementType): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
    
    inline def setMarkLabelUndefined: Self = StObject.set(x, "markLabel", js.undefined)
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setRail(value: ElementType): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(value: ElementType): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: ElementType): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValueLabel(value: ElementType): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    inline def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
  }
}
