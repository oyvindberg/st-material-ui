package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.snackbarUnstyledSnackbarUnstyledDottypesMod.SnackbarUnstyledClickAwayListenerSlotPropsOverrides
import com.olvind.mui.muiBase.snackbarUnstyledSnackbarUnstyledDottypesMod.SnackbarUnstyledOwnerState
import com.olvind.mui.muiBase.snackbarUnstyledSnackbarUnstyledDottypesMod.SnackbarUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickAwayListener extends StObject {
  
  var clickAwayListener: js.UndefOr[
    SlotComponentProps[
      TypeofClickAwayListener, 
      SnackbarUnstyledClickAwayListenerSlotPropsOverrides, 
      SnackbarUnstyledOwnerState
    ]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["div", SnackbarUnstyledRootSlotPropsOverrides, SnackbarUnstyledOwnerState]
  ] = js.undefined
}
object ClickAwayListener {
  
  inline def apply(): ClickAwayListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickAwayListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickAwayListener] (val x: Self) extends AnyVal {
    
    inline def setClickAwayListener(
      value: SlotComponentProps[
          TypeofClickAwayListener, 
          SnackbarUnstyledClickAwayListenerSlotPropsOverrides, 
          SnackbarUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "clickAwayListener", value.asInstanceOf[js.Any])
    
    inline def setClickAwayListenerFunction1(
      value: SnackbarUnstyledOwnerState => Partial[ComponentPropsWithRef[TypeofClickAwayListener]] & SnackbarUnstyledClickAwayListenerSlotPropsOverrides
    ): Self = StObject.set(x, "clickAwayListener", js.Any.fromFunction1(value))
    
    inline def setClickAwayListenerUndefined: Self = StObject.set(x, "clickAwayListener", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps["div", SnackbarUnstyledRootSlotPropsOverrides, SnackbarUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SnackbarUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & SnackbarUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
