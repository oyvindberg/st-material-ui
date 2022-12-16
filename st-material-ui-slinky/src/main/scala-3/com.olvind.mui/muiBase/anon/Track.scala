package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledDottypesMod.SwitchUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledDottypesMod.SwitchUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Track extends StObject {
  
  var input: js.UndefOr[
    SlotComponentProps["input", SwitchUnstyledComponentsPropsOverrides, SwitchUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["span", SwitchUnstyledComponentsPropsOverrides, SwitchUnstyledOwnerState]
  ] = js.undefined
  
  var thumb: js.UndefOr[
    SlotComponentProps["span", SwitchUnstyledComponentsPropsOverrides, SwitchUnstyledOwnerState]
  ] = js.undefined
  
  var track: js.UndefOr[
    SlotComponentProps["span", SwitchUnstyledComponentsPropsOverrides, SwitchUnstyledOwnerState]
  ] = js.undefined
}
object Track {
  
  inline def apply(): Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
    
    inline def setInput(
      value: SlotComponentProps["input", SwitchUnstyledComponentsPropsOverrides, SwitchUnstyledOwnerState]
    ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: SwitchUnstyledOwnerState => Partial[ComponentPropsWithRef["input"]] & SwitchUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps["span", SwitchUnstyledComponentsPropsOverrides, SwitchUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SwitchUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SwitchUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(
      value: SlotComponentProps["span", SwitchUnstyledComponentsPropsOverrides, SwitchUnstyledOwnerState]
    ): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbFunction1(
      value: SwitchUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SwitchUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "thumb", js.Any.fromFunction1(value))
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(
      value: SlotComponentProps["span", SwitchUnstyledComponentsPropsOverrides, SwitchUnstyledOwnerState]
    ): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: SwitchUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SwitchUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
