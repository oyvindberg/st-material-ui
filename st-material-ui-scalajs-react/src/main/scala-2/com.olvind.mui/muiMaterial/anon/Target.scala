package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target[T] extends StObject {
  
  var target: Name[T] = js.native
}
object Target {
  
  @scala.inline
  def apply[T](target: Name[T]): Target[T] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target[T]]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target[_], T] (val x: Self with Target[T]) extends AnyVal {
    
    @scala.inline
    def setTarget(value: Name[T]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
