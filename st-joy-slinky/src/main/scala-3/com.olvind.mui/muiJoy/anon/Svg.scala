package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.circularProgressCircularProgressPropsMod.CircularProgressOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Svg extends StObject {
  
  var progress: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CircularProgressOwnerState]
  
  var svg: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["svg", js.Object, CircularProgressOwnerState]
  
  var track: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState]
}
object Svg {
  
  inline def apply(
    progress: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CircularProgressOwnerState],
    svg: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["svg", js.Object, CircularProgressOwnerState],
    track: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState]
  ): Svg = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Svg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Svg] (val x: Self) extends AnyVal {
    
    inline def setProgress(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState]
    ): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressFunction1(
      value: CircularProgressOwnerState => (Omit[ComponentPropsWithRef["circle"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    inline def setRoot(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, CircularProgressOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: CircularProgressOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setSvg(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["svg", js.Object, CircularProgressOwnerState]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgFunction1(
      value: CircularProgressOwnerState => (Omit[ComponentPropsWithRef["svg"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "svg", js.Any.fromFunction1(value))
    
    inline def setTrack(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["circle", js.Object, CircularProgressOwnerState]
    ): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: CircularProgressOwnerState => (Omit[ComponentPropsWithRef["circle"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
  }
}
