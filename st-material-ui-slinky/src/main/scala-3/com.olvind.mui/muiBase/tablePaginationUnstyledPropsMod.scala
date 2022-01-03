package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablePaginationUnstyledPropsMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.first
    - `com.olvind.mui`.muiBase.muiBaseStrings.last
    - `com.olvind.mui`.muiBase.muiBaseStrings.next
    - `com.olvind.mui`.muiBase.muiBaseStrings.previous
  */
  trait ItemAriaLabelType extends StObject
  object ItemAriaLabelType {
    
    inline def first: com.olvind.mui.muiBase.muiBaseStrings.first = "first".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.first]
    
    inline def last: com.olvind.mui.muiBase.muiBaseStrings.last = "last".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.last]
    
    inline def next: com.olvind.mui.muiBase.muiBaseStrings.next = "next".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.next]
    
    inline def previous: com.olvind.mui.muiBase.muiBaseStrings.previous = "previous".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.previous]
  }
  
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
    
    extension [Self <: LabelDisplayedRowsArgs](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait TablePaginationUnstyledComponentsPropsOverrides extends StObject
}
