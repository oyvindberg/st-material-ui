package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.tablePaginationTablePaginationMod.LabelDisplayedRowsArgs
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ComponentsPropsList['MuiTablePagination'], 'labelRowsPerPage' | 'labelDisplayedRows' | 'getItemAriaLabel'> */
trait PickComponentsPropsListMuiTablePaginatio extends StObject {
  
  var getItemAriaLabel: js.UndefOr[js.Function1[/* type */ "first" | "last" | "next" | "previous", String]] = js.undefined
  
  var labelDisplayedRows: js.UndefOr[js.Function1[/* paginationInfo */ LabelDisplayedRowsArgs, ReactElement]] = js.undefined
  
  var labelRowsPerPage: js.UndefOr[ReactElement] = js.undefined
}
object PickComponentsPropsListMuiTablePaginatio {
  
  inline def apply(): PickComponentsPropsListMuiTablePaginatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMuiTablePaginatio]
  }
  
  extension [Self <: PickComponentsPropsListMuiTablePaginatio](x: Self) {
    
    inline def setGetItemAriaLabel(value: /* type */ "first" | "last" | "next" | "previous" => String): Self = StObject.set(x, "getItemAriaLabel", js.Any.fromFunction1(value))
    
    inline def setGetItemAriaLabelUndefined: Self = StObject.set(x, "getItemAriaLabel", js.undefined)
    
    inline def setLabelDisplayedRows(value: /* paginationInfo */ LabelDisplayedRowsArgs => ReactElement): Self = StObject.set(x, "labelDisplayedRows", js.Any.fromFunction1(value))
    
    inline def setLabelDisplayedRowsUndefined: Self = StObject.set(x, "labelDisplayedRows", js.undefined)
    
    inline def setLabelRowsPerPage(value: ReactElement): Self = StObject.set(x, "labelRowsPerPage", value.asInstanceOf[js.Any])
    
    inline def setLabelRowsPerPageUndefined: Self = StObject.set(x, "labelRowsPerPage", js.undefined)
  }
}
