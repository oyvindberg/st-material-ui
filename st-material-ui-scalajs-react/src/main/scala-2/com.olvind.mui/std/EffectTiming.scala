package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectTiming extends StObject {
  
  /* standard dom */
  var delay: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var direction: js.UndefOr[PlaybackDirection] = js.native
  
  /* standard dom */
  var duration: js.UndefOr[Double | java.lang.String] = js.native
  
  /* standard dom */
  var easing: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var endDelay: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var fill: js.UndefOr[FillMode] = js.native
  
  /* standard dom */
  var iterationStart: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var iterations: js.UndefOr[Double] = js.native
}
object EffectTiming {
  
  @scala.inline
  def apply(): EffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectTiming]
  }
  
  @scala.inline
  implicit class EffectTimingMutableBuilder[Self <: EffectTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDirection(value: PlaybackDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double | java.lang.String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setEndDelay(value: Double): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDelayUndefined: Self = StObject.set(x, "endDelay", js.undefined)
    
    @scala.inline
    def setFill(value: FillMode): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setIterationStart(value: Double): Self = StObject.set(x, "iterationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationStartUndefined: Self = StObject.set(x, "iterationStart", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
  }
}
