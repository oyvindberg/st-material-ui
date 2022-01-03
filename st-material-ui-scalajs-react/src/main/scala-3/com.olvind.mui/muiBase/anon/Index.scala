package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index[T] extends StObject {
  
  var index: Double
  
  var option: T
}
object Index {
  
  inline def apply[T](index: Double, option: T): Index[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  
  extension [Self <: Index[?], T](x: Self & Index[T]) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
