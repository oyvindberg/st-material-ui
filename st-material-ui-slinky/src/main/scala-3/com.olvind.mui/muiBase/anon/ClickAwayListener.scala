package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.snackbarUnstyledSnackbarUnstyledDottypesMod.SnackbarUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.snackbarUnstyledSnackbarUnstyledDottypesMod.SnackbarUnstyledOwnerState
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
      SnackbarUnstyledComponentsPropsOverrides, 
      SnackbarUnstyledOwnerState
    ]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["div", SnackbarUnstyledComponentsPropsOverrides, SnackbarUnstyledOwnerState]
  ] = js.undefined
}
object ClickAwayListener {
  
  inline def apply(): ClickAwayListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickAwayListener]
  }
  
  extension [Self <: ClickAwayListener](x: Self) {
    
    inline def setClickAwayListener(
      value: SlotComponentProps[
          TypeofClickAwayListener, 
          SnackbarUnstyledComponentsPropsOverrides, 
          SnackbarUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "clickAwayListener", value.asInstanceOf[js.Any])
    
    inline def setClickAwayListenerFunction1(
      value: SnackbarUnstyledOwnerState => Partial[ComponentPropsWithRef[TypeofClickAwayListener]] & SnackbarUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "clickAwayListener", js.Any.fromFunction1(value))
    
    inline def setClickAwayListenerUndefined: Self = StObject.set(x, "clickAwayListener", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps["div", SnackbarUnstyledComponentsPropsOverrides, SnackbarUnstyledOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SnackbarUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & SnackbarUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
