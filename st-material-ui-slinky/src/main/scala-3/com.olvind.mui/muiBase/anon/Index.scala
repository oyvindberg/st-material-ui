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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index[?], T] (val x: Self & Index[T]) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
