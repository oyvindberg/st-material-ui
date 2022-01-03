package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  duration :number | string,   easing :string,   delay :number | string}> */
@js.native
trait Partial extends StObject {
  
  var delay: js.UndefOr[Double | String] = js.native
  
  var duration: js.UndefOr[Double | String] = js.native
  
  var easing: js.UndefOr[String] = js.native
}
object Partial {
  
  @scala.inline
  def apply(): Partial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partial]
  }
  
  @scala.inline
  implicit class PartialMutableBuilder[Self <: Partial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double | String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
