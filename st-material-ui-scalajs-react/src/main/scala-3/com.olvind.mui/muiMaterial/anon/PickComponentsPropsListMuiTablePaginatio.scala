package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.first
import com.olvind.mui.muiMaterial.muiMaterialStrings.last
import com.olvind.mui.muiMaterial.muiMaterialStrings.next
import com.olvind.mui.muiMaterial.muiMaterialStrings.previous
import com.olvind.mui.muiMaterial.tablePaginationTablePaginationMod.LabelDisplayedRowsArgs
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ComponentsPropsList['MuiTablePagination'], 'labelRowsPerPage' | 'labelDisplayedRows' | 'getItemAriaLabel'> */
trait PickComponentsPropsListMuiTablePaginatio extends StObject {
  
  var getItemAriaLabel: js.UndefOr[js.Function1[/* type */ first | last | next | previous, String]] = js.undefined
  
  var labelDisplayedRows: js.UndefOr[
    js.Function1[
      /* paginationInfo */ LabelDisplayedRowsArgs, 
      japgolly.scalajs.react.facade.React.Node
    ]
  ] = js.undefined
  
  var labelRowsPerPage: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
}
object PickComponentsPropsListMuiTablePaginatio {
  
  inline def apply(): PickComponentsPropsListMuiTablePaginatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMuiTablePaginatio]
  }
  
  extension [Self <: PickComponentsPropsListMuiTablePaginatio](x: Self) {
    
    inline def setGetItemAriaLabel(value: /* type */ first | last | next | previous => String): Self = StObject.set(x, "getItemAriaLabel", js.Any.fromFunction1(value))
    
    inline def setGetItemAriaLabelUndefined: Self = StObject.set(x, "getItemAriaLabel", js.undefined)
    
    inline def setLabelDisplayedRows(value: /* paginationInfo */ LabelDisplayedRowsArgs => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "labelDisplayedRows", js.Any.fromFunction1(value))
    
    inline def setLabelDisplayedRowsUndefined: Self = StObject.set(x, "labelDisplayedRows", js.undefined)
    
    inline def setLabelRowsPerPage(value: VdomNode): Self = StObject.set(x, "labelRowsPerPage", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelRowsPerPageNull: Self = StObject.set(x, "labelRowsPerPage", null)
    
    inline def setLabelRowsPerPageUndefined: Self = StObject.set(x, "labelRowsPerPage", js.undefined)
    
    inline def setLabelRowsPerPageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "labelRowsPerPage", js.Array(value*))
    
    inline def setLabelRowsPerPageVdomElement(value: VdomElement): Self = StObject.set(x, "labelRowsPerPage", value.rawElement.asInstanceOf[js.Any])
  }
}
