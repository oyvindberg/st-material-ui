package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledDottypesMod.SwitchUnstyledInputSlotPropsOverrides
import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledDottypesMod.SwitchUnstyledOwnerState
import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledDottypesMod.SwitchUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledDottypesMod.SwitchUnstyledThumbSlotPropsOverrides
import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledDottypesMod.SwitchUnstyledTrackSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thumb extends StObject {
  
  var input: js.UndefOr[
    SlotComponentProps["input", SwitchUnstyledInputSlotPropsOverrides, SwitchUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["span", SwitchUnstyledRootSlotPropsOverrides, SwitchUnstyledOwnerState]
  ] = js.undefined
  
  var thumb: js.UndefOr[
    SlotComponentProps["span", SwitchUnstyledThumbSlotPropsOverrides, SwitchUnstyledOwnerState]
  ] = js.undefined
  
  var track: js.UndefOr[
    SlotComponentProps["span", SwitchUnstyledTrackSlotPropsOverrides, SwitchUnstyledOwnerState]
  ] = js.undefined
}
object Thumb {
  
  inline def apply(): Thumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Thumb] (val x: Self) extends AnyVal {
    
    inline def setInput(
      value: SlotComponentProps["input", SwitchUnstyledInputSlotPropsOverrides, SwitchUnstyledOwnerState]
    ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: SwitchUnstyledOwnerState => Partial[ComponentPropsWithRef["input"]] & SwitchUnstyledInputSlotPropsOverrides
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: SlotComponentProps["span", SwitchUnstyledRootSlotPropsOverrides, SwitchUnstyledOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SwitchUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SwitchUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThumb(value: SlotComponentProps["span", SwitchUnstyledThumbSlotPropsOverrides, SwitchUnstyledOwnerState]): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbFunction1(
      value: SwitchUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SwitchUnstyledThumbSlotPropsOverrides
    ): Self = StObject.set(x, "thumb", js.Any.fromFunction1(value))
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: SlotComponentProps["span", SwitchUnstyledTrackSlotPropsOverrides, SwitchUnstyledOwnerState]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: SwitchUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & SwitchUnstyledTrackSlotPropsOverrides
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
