package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def first: com.olvind.mui.muiBase.muiBaseStrings.first = "first".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.first]
    
    @scala.inline
    def last: com.olvind.mui.muiBase.muiBaseStrings.last = "last".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.last]
    
    @scala.inline
    def next: com.olvind.mui.muiBase.muiBaseStrings.next = "next".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.next]
    
    @scala.inline
    def previous: com.olvind.mui.muiBase.muiBaseStrings.previous = "previous".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.previous]
  }
  
  @js.native
  trait LabelDisplayedRowsArgs extends StObject {
    
    var count: Double = js.native
    
    var from: Double = js.native
    
    var page: Double = js.native
    
    var to: Double = js.native
  }
  object LabelDisplayedRowsArgs {
    
    @scala.inline
    def apply(count: Double, from: Double, page: Double, to: Double): LabelDisplayedRowsArgs = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelDisplayedRowsArgs]
    }
    
    @scala.inline
    implicit class LabelDisplayedRowsArgsMutableBuilder[Self <: LabelDisplayedRowsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TablePaginationUnstyledComponentsPropsOverrides extends StObject
}
