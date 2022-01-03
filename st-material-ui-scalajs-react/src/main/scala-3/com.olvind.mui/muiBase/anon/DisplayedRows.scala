package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.div
import com.olvind.mui.muiBase.muiBaseStrings.option
import com.olvind.mui.muiBase.muiBaseStrings.p
import com.olvind.mui.muiBase.muiBaseStrings.select
import com.olvind.mui.muiBase.tablePaginationUnstyledPropsMod.TablePaginationUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayedRows extends StObject {
  
  var actions: js.UndefOr[ComponentPropsWithRef[div] & TablePaginationUnstyledComponentsPropsOverrides] = js.undefined
  
  var displayedRows: js.UndefOr[ComponentPropsWithRef[p] & TablePaginationUnstyledComponentsPropsOverrides] = js.undefined
  
  var menuItem: js.UndefOr[ComponentPropsWithRef[option] & TablePaginationUnstyledComponentsPropsOverrides] = js.undefined
  
  var root: js.UndefOr[ComponentPropsWithRef[div] & TablePaginationUnstyledComponentsPropsOverrides] = js.undefined
  
  var select: js.UndefOr[
    ComponentPropsWithRef[com.olvind.mui.muiBase.muiBaseStrings.select] & TablePaginationUnstyledComponentsPropsOverrides
  ] = js.undefined
  
  var selectLabel: js.UndefOr[ComponentPropsWithRef[p] & TablePaginationUnstyledComponentsPropsOverrides] = js.undefined
  
  var spacer: js.UndefOr[ComponentPropsWithRef[div] & TablePaginationUnstyledComponentsPropsOverrides] = js.undefined
  
  var toolbar: js.UndefOr[ComponentPropsWithRef[div] & TablePaginationUnstyledComponentsPropsOverrides] = js.undefined
}
object DisplayedRows {
  
  inline def apply(): DisplayedRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayedRows]
  }
  
  extension [Self <: DisplayedRows](x: Self) {
    
    inline def setActions(value: ComponentPropsWithRef[div] & TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setDisplayedRows(value: ComponentPropsWithRef[p] & TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "displayedRows", value.asInstanceOf[js.Any])
    
    inline def setDisplayedRowsUndefined: Self = StObject.set(x, "displayedRows", js.undefined)
    
    inline def setMenuItem(value: ComponentPropsWithRef[option] & TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
    
    inline def setMenuItemUndefined: Self = StObject.set(x, "menuItem", js.undefined)
    
    inline def setRoot(value: ComponentPropsWithRef[div] & TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSelect(value: ComponentPropsWithRef[select] & TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectLabel(value: ComponentPropsWithRef[p] & TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "selectLabel", value.asInstanceOf[js.Any])
    
    inline def setSelectLabelUndefined: Self = StObject.set(x, "selectLabel", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSpacer(value: ComponentPropsWithRef[div] & TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
    
    inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    
    inline def setToolbar(value: ComponentPropsWithRef[div] & TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
