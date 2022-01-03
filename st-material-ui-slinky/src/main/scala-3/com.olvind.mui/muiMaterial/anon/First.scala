package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait First extends StObject {
  
  var first: js.UndefOr[ReactElement] = js.undefined
  
  var last: js.UndefOr[ReactElement] = js.undefined
  
  var next: js.UndefOr[ReactElement] = js.undefined
  
  var previous: js.UndefOr[ReactElement] = js.undefined
}
object First {
  
  inline def apply(): First = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[First]
  }
  
  extension [Self <: First](x: Self) {
    
    inline def setFirst(value: ReactElement): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setLast(value: ReactElement): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setNext(value: ReactElement): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: ReactElement): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
