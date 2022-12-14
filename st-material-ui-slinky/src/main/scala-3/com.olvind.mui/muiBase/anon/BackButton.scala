package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationActionsUnstyledDottypesMod.TablePaginationActionsUnstyledBackButtonSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationActionsUnstyledDottypesMod.TablePaginationActionsUnstyledFirstButtonSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationActionsUnstyledDottypesMod.TablePaginationActionsUnstyledLastButtonSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationActionsUnstyledDottypesMod.TablePaginationActionsUnstyledNextButtonSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationActionsUnstyledDottypesMod.TablePaginationActionsUnstyledOwnerState
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationActionsUnstyledDottypesMod.TablePaginationActionsUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackButton extends StObject {
  
  var backButton: js.UndefOr[
    SlotComponentProps[
      "button", 
      TablePaginationActionsUnstyledBackButtonSlotPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
  
  var firstButton: js.UndefOr[
    SlotComponentProps[
      "button", 
      TablePaginationActionsUnstyledFirstButtonSlotPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
  
  var lastButton: js.UndefOr[
    SlotComponentProps[
      "button", 
      TablePaginationActionsUnstyledLastButtonSlotPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
  
  var nextButton: js.UndefOr[
    SlotComponentProps[
      "button", 
      TablePaginationActionsUnstyledNextButtonSlotPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps[
      "div", 
      TablePaginationActionsUnstyledRootSlotPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
}
object BackButton {
  
  inline def apply(): BackButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackButton] (val x: Self) extends AnyVal {
    
    inline def setBackButton(
      value: SlotComponentProps[
          "button", 
          TablePaginationActionsUnstyledBackButtonSlotPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    inline def setBackButtonFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & TablePaginationActionsUnstyledBackButtonSlotPropsOverrides
    ): Self = StObject.set(x, "backButton", js.Any.fromFunction1(value))
    
    inline def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    inline def setFirstButton(
      value: SlotComponentProps[
          "button", 
          TablePaginationActionsUnstyledFirstButtonSlotPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "firstButton", value.asInstanceOf[js.Any])
    
    inline def setFirstButtonFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & TablePaginationActionsUnstyledFirstButtonSlotPropsOverrides
    ): Self = StObject.set(x, "firstButton", js.Any.fromFunction1(value))
    
    inline def setFirstButtonUndefined: Self = StObject.set(x, "firstButton", js.undefined)
    
    inline def setLastButton(
      value: SlotComponentProps[
          "button", 
          TablePaginationActionsUnstyledLastButtonSlotPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "lastButton", value.asInstanceOf[js.Any])
    
    inline def setLastButtonFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & TablePaginationActionsUnstyledLastButtonSlotPropsOverrides
    ): Self = StObject.set(x, "lastButton", js.Any.fromFunction1(value))
    
    inline def setLastButtonUndefined: Self = StObject.set(x, "lastButton", js.undefined)
    
    inline def setNextButton(
      value: SlotComponentProps[
          "button", 
          TablePaginationActionsUnstyledNextButtonSlotPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
    
    inline def setNextButtonFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & TablePaginationActionsUnstyledNextButtonSlotPropsOverrides
    ): Self = StObject.set(x, "nextButton", js.Any.fromFunction1(value))
    
    inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps[
          "div", 
          TablePaginationActionsUnstyledRootSlotPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & TablePaginationActionsUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
