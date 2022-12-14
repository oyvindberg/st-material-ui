package com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TablePaginationUnstyledSlots extends StObject {
  
  /**
    * The component that renders the actions.
    * @default TablePaginationActionsUnstyled
    */
  var actions: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the displayed rows.
    * @default 'p'
    */
  var displayedRows: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the menu item.
    * @default 'option'
    */
  var menuItem: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the root.
    * @default 'td'
    */
  var root: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the select.
    * @default 'select'
    */
  var select: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the select label.
    * @default 'p'
    */
  var selectLabel: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the spacer.
    * @default 'div'
    */
  var spacer: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The component that renders the toolbar.
    * @default 'div'
    */
  var toolbar: js.UndefOr[ReactElement] = js.undefined
}
object TablePaginationUnstyledSlots {
  
  inline def apply(): TablePaginationUnstyledSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablePaginationUnstyledSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TablePaginationUnstyledSlots] (val x: Self) extends AnyVal {
    
    inline def setActions(value: ReactElement): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setDisplayedRows(value: ReactElement): Self = StObject.set(x, "displayedRows", value.asInstanceOf[js.Any])
    
    inline def setDisplayedRowsUndefined: Self = StObject.set(x, "displayedRows", js.undefined)
    
    inline def setMenuItem(value: ReactElement): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
    
    inline def setMenuItemUndefined: Self = StObject.set(x, "menuItem", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSelect(value: ReactElement): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectLabel(value: ReactElement): Self = StObject.set(x, "selectLabel", value.asInstanceOf[js.Any])
    
    inline def setSelectLabelUndefined: Self = StObject.set(x, "selectLabel", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSpacer(value: ReactElement): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
    
    inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    
    inline def setToolbar(value: ReactElement): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
