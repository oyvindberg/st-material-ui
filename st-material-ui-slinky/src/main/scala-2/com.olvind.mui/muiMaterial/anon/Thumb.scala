package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thumb extends StObject {
  
  var active: String = js.native
  
  var thumb: String = js.native
  
  var track: String = js.native
}
object Thumb {
  
  @scala.inline
  def apply(active: String, thumb: String, track: String): Thumb = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumb]
  }
  
  @scala.inline
  implicit class ThumbMutableBuilder[Self <: Thumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
