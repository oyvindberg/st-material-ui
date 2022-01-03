package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name[T] extends StObject {
  
  var name: String
  
  var value: T
}
object Name {
  
  inline def apply[T](name: String, value: T): Name[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[T]]
  }
  
  extension [Self <: Name[?], T](x: Self & Name[T]) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
