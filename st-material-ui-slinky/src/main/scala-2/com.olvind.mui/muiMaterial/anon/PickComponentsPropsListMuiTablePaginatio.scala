package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.first
import com.olvind.mui.muiMaterial.muiMaterialStrings.last
import com.olvind.mui.muiMaterial.muiMaterialStrings.next
import com.olvind.mui.muiMaterial.muiMaterialStrings.previous
import com.olvind.mui.muiMaterial.tablePaginationTablePaginationMod.LabelDisplayedRowsArgs
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ComponentsPropsList['MuiTablePagination'], 'labelRowsPerPage' | 'labelDisplayedRows' | 'getItemAriaLabel'> */
@js.native
trait PickComponentsPropsListMuiTablePaginatio extends StObject {
  
  var getItemAriaLabel: js.UndefOr[js.Function1[/* type */ first | last | next | previous, String]] = js.native
  
  var labelDisplayedRows: js.UndefOr[js.Function1[/* paginationInfo */ LabelDisplayedRowsArgs, ReactElement]] = js.native
  
  var labelRowsPerPage: js.UndefOr[ReactElement] = js.native
}
object PickComponentsPropsListMuiTablePaginatio {
  
  @scala.inline
  def apply(): PickComponentsPropsListMuiTablePaginatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMuiTablePaginatio]
  }
  
  @scala.inline
  implicit class PickComponentsPropsListMuiTablePaginatioMutableBuilder[Self <: PickComponentsPropsListMuiTablePaginatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetItemAriaLabel(value: /* type */ first | last | next | previous => String): Self = StObject.set(x, "getItemAriaLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemAriaLabelUndefined: Self = StObject.set(x, "getItemAriaLabel", js.undefined)
    
    @scala.inline
    def setLabelDisplayedRows(value: /* paginationInfo */ LabelDisplayedRowsArgs => ReactElement): Self = StObject.set(x, "labelDisplayedRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelDisplayedRowsUndefined: Self = StObject.set(x, "labelDisplayedRows", js.undefined)
    
    @scala.inline
    def setLabelRowsPerPage(value: ReactElement): Self = StObject.set(x, "labelRowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelRowsPerPageUndefined: Self = StObject.set(x, "labelRowsPerPage", js.undefined)
  }
}
