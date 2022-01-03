package com.olvind.mui.muiBase.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thumb extends StObject {
  
  var Input: js.UndefOr[ReactElement] = js.undefined
  
  var Root: js.UndefOr[ReactElement] = js.undefined
  
  var Thumb: js.UndefOr[ReactElement] = js.undefined
  
  var Track: js.UndefOr[ReactElement | Null] = js.undefined
}
object Thumb {
  
  inline def apply(): Thumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumb]
  }
  
  extension [Self <: Thumb](x: Self) {
    
    inline def setInput(value: ReactElement): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    
    inline def setThumb(value: ReactElement): Self = StObject.set(x, "Thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "Thumb", js.undefined)
    
    inline def setTrack(value: ReactElement): Self = StObject.set(x, "Track", value.asInstanceOf[js.Any])
    
    inline def setTrackNull: Self = StObject.set(x, "Track", null)
    
    inline def setTrackUndefined: Self = StObject.set(x, "Track", js.undefined)
  }
}
