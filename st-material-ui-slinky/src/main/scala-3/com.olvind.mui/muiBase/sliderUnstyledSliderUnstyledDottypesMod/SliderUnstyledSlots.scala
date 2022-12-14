package com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledDottypesMod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderUnstyledSlots extends StObject {
  
  /**
    * The component that renders the input.
    * @default 'input'
    */
  var input: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the mark.
    * @default 'span'
    */
  var mark: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the mark label.
    * @default 'span'
    */
  var markLabel: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the rail.
    * @default 'span'
    */
  var rail: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the root.
    * @default 'span'
    */
  var root: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the thumb.
    * @default 'span'
    */
  var thumb: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the track.
    * @default 'span'
    */
  var track: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the value label.
    */
  var valueLabel: js.UndefOr[ReactElement] = js.undefined
}
object SliderUnstyledSlots {
  
  inline def apply(): SliderUnstyledSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderUnstyledSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderUnstyledSlots] (val x: Self) extends AnyVal {
    
    inline def setInput(value: ReactElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMark(value: ReactElement): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkLabel(value: ReactElement): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
    
    inline def setMarkLabelUndefined: Self = StObject.set(x, "markLabel", js.undefined)
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setRail(value: ReactElement): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: ReactElement): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValueLabel(value: ReactElement): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    inline def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
  }
}
