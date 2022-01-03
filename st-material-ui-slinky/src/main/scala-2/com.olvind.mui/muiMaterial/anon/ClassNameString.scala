package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNameString extends StObject {
  
  var className: String = js.native
}
object ClassNameString {
  
  @scala.inline
  def apply(className: String): ClassNameString = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameString]
  }
  
  @scala.inline
  implicit class ClassNameStringMutableBuilder[Self <: ClassNameString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
  }
}
