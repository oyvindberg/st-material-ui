package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationActionsUnstyledDottypesMod.TablePaginationActionsUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationActionsUnstyledDottypesMod.TablePaginationActionsUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstButton extends StObject {
  
  var backButton: js.UndefOr[
    SlotComponentProps[
      "button", 
      TablePaginationActionsUnstyledComponentsPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
  
  var firstButton: js.UndefOr[
    SlotComponentProps[
      "button", 
      TablePaginationActionsUnstyledComponentsPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
  
  var lastButton: js.UndefOr[
    SlotComponentProps[
      "button", 
      TablePaginationActionsUnstyledComponentsPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
  
  var nextButton: js.UndefOr[
    SlotComponentProps[
      "button", 
      TablePaginationActionsUnstyledComponentsPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps[
      "div", 
      TablePaginationActionsUnstyledComponentsPropsOverrides, 
      TablePaginationActionsUnstyledOwnerState
    ]
  ] = js.undefined
}
object FirstButton {
  
  inline def apply(): FirstButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstButton] (val x: Self) extends AnyVal {
    
    inline def setBackButton(
      value: SlotComponentProps[
          "button", 
          TablePaginationActionsUnstyledComponentsPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    inline def setBackButtonFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & TablePaginationActionsUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "backButton", js.Any.fromFunction1(value))
    
    inline def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    inline def setFirstButton(
      value: SlotComponentProps[
          "button", 
          TablePaginationActionsUnstyledComponentsPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "firstButton", value.asInstanceOf[js.Any])
    
    inline def setFirstButtonFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & TablePaginationActionsUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "firstButton", js.Any.fromFunction1(value))
    
    inline def setFirstButtonUndefined: Self = StObject.set(x, "firstButton", js.undefined)
    
    inline def setLastButton(
      value: SlotComponentProps[
          "button", 
          TablePaginationActionsUnstyledComponentsPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "lastButton", value.asInstanceOf[js.Any])
    
    inline def setLastButtonFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & TablePaginationActionsUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "lastButton", js.Any.fromFunction1(value))
    
    inline def setLastButtonUndefined: Self = StObject.set(x, "lastButton", js.undefined)
    
    inline def setNextButton(
      value: SlotComponentProps[
          "button", 
          TablePaginationActionsUnstyledComponentsPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
    
    inline def setNextButtonFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["button"]] & TablePaginationActionsUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "nextButton", js.Any.fromFunction1(value))
    
    inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps[
          "div", 
          TablePaginationActionsUnstyledComponentsPropsOverrides, 
          TablePaginationActionsUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TablePaginationActionsUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & TablePaginationActionsUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
