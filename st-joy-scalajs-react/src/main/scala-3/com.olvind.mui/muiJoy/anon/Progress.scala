package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.circularProgressCircularProgressPropsMod.CircularProgressOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>,   svg :@mui/joy.@mui/joy/utils/types.SlotProps<'svg', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>,   track :@mui/joy.@mui/joy/utils/types.SlotProps<'circle', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>,   progress :@mui/joy.@mui/joy/utils/types.SlotProps<'circle', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>,   svg :@mui/joy.@mui/joy/utils/types.SlotProps<'svg', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>,   track :@mui/joy.@mui/joy/utils/types.SlotProps<'circle', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>,   progress :@mui/joy.@mui/joy/utils/types.SlotProps<'circle', {}, @mui/joy.@mui/joy/CircularProgress/CircularProgressProps.CircularProgressOwnerState>}[P]} */
trait Progress extends StObject {
  
  var progress: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CircularProgressOwnerState]
  ] = js.undefined
  
  var svg: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["svg", js.Object, CircularProgressOwnerState]
  ] = js.undefined
  
  var track: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState]
  ] = js.undefined
}
object Progress {
  
  inline def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    inline def setProgress(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState]
    ): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressFunction1(
      value: CircularProgressOwnerState => (Omit[ComponentPropsWithRef["circle"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRoot(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CircularProgressOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: CircularProgressOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSvg(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["svg", js.Object, CircularProgressOwnerState]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgFunction1(
      value: CircularProgressOwnerState => (Omit[ComponentPropsWithRef["svg"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "svg", js.Any.fromFunction1(value))
    
    inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    inline def setTrack(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState]
    ): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: CircularProgressOwnerState => (Omit[ComponentPropsWithRef["circle"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
