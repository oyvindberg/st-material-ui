package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name[T /* <: js.Object */] extends StObject {
  
  var name: String
  
  var props: T
}
object Name {
  
  inline def apply[T /* <: js.Object */](name: String, props: T): Name[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name[?], T /* <: js.Object */] (val x: Self & Name[T]) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProps(value: T): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
