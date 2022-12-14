package com.olvind.mui.muiBase.tablePaginationUnstyledTablePaginationUnstyledDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelDisplayedRowsArgs extends StObject {
  
  var count: Double
  
  var from: Double
  
  var page: Double
  
  var to: Double
}
object LabelDisplayedRowsArgs {
  
  inline def apply(count: Double, from: Double, page: Double, to: Double): LabelDisplayedRowsArgs = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDisplayedRowsArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelDisplayedRowsArgs] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
