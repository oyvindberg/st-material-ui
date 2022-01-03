package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thumb extends StObject {
  
  var Input: js.UndefOr[ElementType] = js.native
  
  var Root: js.UndefOr[ElementType] = js.native
  
  var Thumb: js.UndefOr[ElementType] = js.native
  
  var Track: js.UndefOr[ElementType | Null] = js.native
}
object Thumb {
  
  @scala.inline
  def apply(): Thumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumb]
  }
  
  @scala.inline
  implicit class ThumbMutableBuilder[Self <: Thumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: ElementType): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    @scala.inline
    def setRoot(value: ElementType): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    
    @scala.inline
    def setThumb(value: ElementType): Self = StObject.set(x, "Thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbUndefined: Self = StObject.set(x, "Thumb", js.undefined)
    
    @scala.inline
    def setTrack(value: ElementType): Self = StObject.set(x, "Track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackNull: Self = StObject.set(x, "Track", null)
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "Track", js.undefined)
  }
}
