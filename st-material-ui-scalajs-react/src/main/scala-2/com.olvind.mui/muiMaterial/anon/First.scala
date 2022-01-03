package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait First extends StObject {
  
  var first: js.UndefOr[ElementType] = js.native
  
  var last: js.UndefOr[ElementType] = js.native
  
  var next: js.UndefOr[ElementType] = js.native
  
  var previous: js.UndefOr[ElementType] = js.native
}
object First {
  
  @scala.inline
  def apply(): First = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[First]
  }
  
  @scala.inline
  implicit class FirstMutableBuilder[Self <: First] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: ElementType): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setLast(value: ElementType): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setNext(value: ElementType): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setPrevious(value: ElementType): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
