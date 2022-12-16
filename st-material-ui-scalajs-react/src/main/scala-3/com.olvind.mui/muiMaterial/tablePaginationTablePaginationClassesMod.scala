package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablePaginationTablePaginationClassesMod {
  
  @JSImport("@mui/material/TablePagination/tablePaginationClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TablePagination/tablePaginationClasses", JSImport.Default)
  @js.native
  val default: TablePaginationClasses = js.native
  
  inline def getTablePaginationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTablePaginationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TablePaginationClassKey = "root" | "toolbar" | "spacer" | "selectLabel" | "selectRoot" | "select" | "selectIcon" | "input" | "menuItem" | "displayedRows" | "actions"
  
  trait TablePaginationClasses extends StObject {
    
    /** Styles applied to the internal `TablePaginationActions` component. */
    var actions: String
    
    /** Styles applied to the displayed rows Typography element. */
    var displayedRows: String
    
    /** Styles applied to the Select component `root` element. */
    var input: String
    
    /** Styles applied to the MenuItem component. */
    var menuItem: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the Select component `select` class. */
    var select: String
    
    /** Styles applied to the Select component `icon` class. */
    var selectIcon: String
    
    /** Styles applied to the select label Typography element. */
    var selectLabel: String
    
    /** Styles applied to the Select component `root` element. */
    var selectRoot: String
    
    /** Styles applied to the spacer element. */
    var spacer: String
    
    /** Styles applied to the Toolbar component. */
    var toolbar: String
  }
  object TablePaginationClasses {
    
    inline def apply(
      actions: String,
      displayedRows: String,
      input: String,
      menuItem: String,
      root: String,
      select: String,
      selectIcon: String,
      selectLabel: String,
      selectRoot: String,
      spacer: String,
      toolbar: String
    ): TablePaginationClasses = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], displayedRows = displayedRows.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], menuItem = menuItem.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectIcon = selectIcon.asInstanceOf[js.Any], selectLabel = selectLabel.asInstanceOf[js.Any], selectRoot = selectRoot.asInstanceOf[js.Any], spacer = spacer.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablePaginationClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TablePaginationClasses] (val x: Self) extends AnyVal {
      
      inline def setActions(value: String): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setDisplayedRows(value: String): Self = StObject.set(x, "displayedRows", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMenuItem(value: String): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectIcon(value: String): Self = StObject.set(x, "selectIcon", value.asInstanceOf[js.Any])
      
      inline def setSelectLabel(value: String): Self = StObject.set(x, "selectLabel", value.asInstanceOf[js.Any])
      
      inline def setSelectRoot(value: String): Self = StObject.set(x, "selectRoot", value.asInstanceOf[js.Any])
      
      inline def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: String): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    }
  }
}
