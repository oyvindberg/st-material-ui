package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.switchSwitchPropsMod.SwitchOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Track extends StObject {
  
  var action: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState]
  
  var endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]
  
  var input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, SwitchOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState]
  
  var startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]
  
  var thumb: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]
  
  var track: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]
}
object Track {
  
  inline def apply(
    action: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState],
    endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState],
    input: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, SwitchOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState],
    startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState],
    thumb: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState],
    track: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]
  ): Track = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setInput(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, SwitchOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["input"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setThumb(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "thumb", js.Any.fromFunction1(value))
    
    inline def setTrack(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
  }
}
