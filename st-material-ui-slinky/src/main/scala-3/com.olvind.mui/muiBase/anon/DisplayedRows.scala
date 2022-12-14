package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod.TablePaginationUnstyledActionsSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod.TablePaginationUnstyledDisplayedRowsSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod.TablePaginationUnstyledMenuItemSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod.TablePaginationUnstyledOwnerState
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod.TablePaginationUnstyledRootSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod.TablePaginationUnstyledSelectLabelSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod.TablePaginationUnstyledSelectSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod.TablePaginationUnstyledSpacerSlotPropsOverrides
import com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod.TablePaginationUnstyledToolbarSlotPropsOverrides
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayedRows extends StObject {
  
  var actions: js.UndefOr[
    SlotComponentProps[
      js.Function1[/* props */ DefaultComponentPropsTablePaginationActi, Element | Null], 
      TablePaginationUnstyledActionsSlotPropsOverrides, 
      TablePaginationUnstyledOwnerState
    ]
  ] = js.undefined
  
  var displayedRows: js.UndefOr[
    SlotComponentProps[
      "p", 
      TablePaginationUnstyledDisplayedRowsSlotPropsOverrides, 
      TablePaginationUnstyledOwnerState
    ]
  ] = js.undefined
  
  var menuItem: js.UndefOr[
    SlotComponentProps[
      "option", 
      TablePaginationUnstyledMenuItemSlotPropsOverrides, 
      TablePaginationUnstyledOwnerState
    ]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps[
      "td", 
      TablePaginationUnstyledRootSlotPropsOverrides, 
      TablePaginationUnstyledOwnerState
    ]
  ] = js.undefined
  
  var select: js.UndefOr[
    SlotComponentProps[
      "select", 
      TablePaginationUnstyledSelectSlotPropsOverrides, 
      TablePaginationUnstyledOwnerState
    ]
  ] = js.undefined
  
  var selectLabel: js.UndefOr[
    SlotComponentProps[
      "p", 
      TablePaginationUnstyledSelectLabelSlotPropsOverrides, 
      TablePaginationUnstyledOwnerState
    ]
  ] = js.undefined
  
  var spacer: js.UndefOr[
    SlotComponentProps[
      "div", 
      TablePaginationUnstyledSpacerSlotPropsOverrides, 
      TablePaginationUnstyledOwnerState
    ]
  ] = js.undefined
  
  var toolbar: js.UndefOr[
    SlotComponentProps[
      "div", 
      TablePaginationUnstyledToolbarSlotPropsOverrides, 
      TablePaginationUnstyledOwnerState
    ]
  ] = js.undefined
}
object DisplayedRows {
  
  inline def apply(): DisplayedRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayedRows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayedRows] (val x: Self) extends AnyVal {
    
    inline def setActions(
      value: SlotComponentProps[
          js.Function1[/* props */ DefaultComponentPropsTablePaginationActi, Element | Null], 
          TablePaginationUnstyledActionsSlotPropsOverrides, 
          TablePaginationUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsFunction1(
      value: TablePaginationUnstyledOwnerState => (Partial[
          ComponentPropsWithRef[
            js.Function1[/* props */ DefaultComponentPropsTablePaginationActi, Element | Null]
          ]
        ]) & TablePaginationUnstyledActionsSlotPropsOverrides
    ): Self = StObject.set(x, "actions", js.Any.fromFunction1(value))
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setDisplayedRows(
      value: SlotComponentProps[
          "p", 
          TablePaginationUnstyledDisplayedRowsSlotPropsOverrides, 
          TablePaginationUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "displayedRows", value.asInstanceOf[js.Any])
    
    inline def setDisplayedRowsFunction1(
      value: TablePaginationUnstyledOwnerState => Partial[ComponentPropsWithRef["p"]] & TablePaginationUnstyledDisplayedRowsSlotPropsOverrides
    ): Self = StObject.set(x, "displayedRows", js.Any.fromFunction1(value))
    
    inline def setDisplayedRowsUndefined: Self = StObject.set(x, "displayedRows", js.undefined)
    
    inline def setMenuItem(
      value: SlotComponentProps[
          "option", 
          TablePaginationUnstyledMenuItemSlotPropsOverrides, 
          TablePaginationUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
    
    inline def setMenuItemFunction1(
      value: TablePaginationUnstyledOwnerState => Partial[ComponentPropsWithRef["option"]] & TablePaginationUnstyledMenuItemSlotPropsOverrides
    ): Self = StObject.set(x, "menuItem", js.Any.fromFunction1(value))
    
    inline def setMenuItemUndefined: Self = StObject.set(x, "menuItem", js.undefined)
    
    inline def setRoot(
      value: SlotComponentProps[
          "td", 
          TablePaginationUnstyledRootSlotPropsOverrides, 
          TablePaginationUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TablePaginationUnstyledOwnerState => Partial[ComponentPropsWithRef["td"]] & TablePaginationUnstyledRootSlotPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSelect(
      value: SlotComponentProps[
          "select", 
          TablePaginationUnstyledSelectSlotPropsOverrides, 
          TablePaginationUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectFunction1(
      value: TablePaginationUnstyledOwnerState => Partial[ComponentPropsWithRef["select"]] & TablePaginationUnstyledSelectSlotPropsOverrides
    ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectLabel(
      value: SlotComponentProps[
          "p", 
          TablePaginationUnstyledSelectLabelSlotPropsOverrides, 
          TablePaginationUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "selectLabel", value.asInstanceOf[js.Any])
    
    inline def setSelectLabelFunction1(
      value: TablePaginationUnstyledOwnerState => Partial[ComponentPropsWithRef["p"]] & TablePaginationUnstyledSelectLabelSlotPropsOverrides
    ): Self = StObject.set(x, "selectLabel", js.Any.fromFunction1(value))
    
    inline def setSelectLabelUndefined: Self = StObject.set(x, "selectLabel", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSpacer(
      value: SlotComponentProps[
          "div", 
          TablePaginationUnstyledSpacerSlotPropsOverrides, 
          TablePaginationUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
    
    inline def setSpacerFunction1(
      value: TablePaginationUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & TablePaginationUnstyledSpacerSlotPropsOverrides
    ): Self = StObject.set(x, "spacer", js.Any.fromFunction1(value))
    
    inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    
    inline def setToolbar(
      value: SlotComponentProps[
          "div", 
          TablePaginationUnstyledToolbarSlotPropsOverrides, 
          TablePaginationUnstyledOwnerState
        ]
    ): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarFunction1(
      value: TablePaginationUnstyledOwnerState => Partial[ComponentPropsWithRef["div"]] & TablePaginationUnstyledToolbarSlotPropsOverrides
    ): Self = StObject.set(x, "toolbar", js.Any.fromFunction1(value))
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
