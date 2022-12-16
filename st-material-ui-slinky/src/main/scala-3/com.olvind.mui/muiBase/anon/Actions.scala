package com.olvind.mui.muiBase.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.UndefOr[ReactElement] = js.undefined
  
  var displayedRows: js.UndefOr[ReactElement] = js.undefined
  
  var menuItem: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
  
  var select: js.UndefOr[ReactElement] = js.undefined
  
  var selectLabel: js.UndefOr[ReactElement] = js.undefined
  
  var spacer: js.UndefOr[ReactElement] = js.undefined
  
  var toolbar: js.UndefOr[ReactElement] = js.undefined
}
object Actions {
  
  inline def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
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
