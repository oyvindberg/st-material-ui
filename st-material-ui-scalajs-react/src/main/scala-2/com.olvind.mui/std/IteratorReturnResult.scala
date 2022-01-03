package com.olvind.mui.std

import com.olvind.mui.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IteratorReturnResult[TReturn]
  extends StObject
     with IteratorResult[Any, TReturn] {
  
  /* standard es2015.iterable */
  var done: `true` = js.native
  
  /* standard es2015.iterable */
  var value: TReturn = js.native
}
object IteratorReturnResult {
  
  @scala.inline
  def apply[TReturn](value: TReturn): IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorReturnResult[TReturn]]
  }
  
  @scala.inline
  implicit class IteratorReturnResultMutableBuilder[Self <: IteratorReturnResult[_], TReturn] (val x: Self with IteratorReturnResult[TReturn]) extends AnyVal {
    
    @scala.inline
    def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TReturn): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
