package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>,   svg :@mui/joy.@mui/joy/utils/types.SlotProps<'svg', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>,   track :@mui/joy.@mui/joy/utils/types.SlotProps<'circle', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>,   progress :@mui/joy.@mui/joy/utils/types.SlotProps<'circle', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>} ]:? react.react.ElementType<any>} */
trait Progress extends StObject {
  
  var progress: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
  
  var svg: js.UndefOr[ElementType] = js.undefined
  
  var track: js.UndefOr[ElementType] = js.undefined
}
object Progress {
  
  inline def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    inline def setProgress(value: ElementType): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSvg(value: ElementType): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    inline def setTrack(value: ElementType): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
