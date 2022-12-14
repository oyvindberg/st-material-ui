package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressSlots> */
trait PartialCircularProgressSlots extends StObject {
  
  var progress: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
  
  var svg: js.UndefOr[ReactElement] = js.undefined
  
  var track: js.UndefOr[ReactElement] = js.undefined
}
object PartialCircularProgressSlots {
  
  inline def apply(): PartialCircularProgressSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCircularProgressSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCircularProgressSlots] (val x: Self) extends AnyVal {
    
    inline def setProgress(value: ReactElement): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSvg(value: ReactElement): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    inline def setTrack(value: ReactElement): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
