package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index[T] extends StObject {
  
  var index: Double = js.native
  
  var option: T = js.native
}
object Index {
  
  @scala.inline
  def apply[T](index: Double, option: T): Index[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  
  @scala.inline
  implicit class IndexMutableBuilder[Self <: Index[_], T] (val x: Self with Index[T]) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
