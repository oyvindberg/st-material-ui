package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name[T] extends StObject {
  
  var name: String = js.native
  
  var value: T = js.native
}
object Name {
  
  @scala.inline
  def apply[T](name: String, value: T): Name[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[T]]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name[_], T] (val x: Self with Name[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
