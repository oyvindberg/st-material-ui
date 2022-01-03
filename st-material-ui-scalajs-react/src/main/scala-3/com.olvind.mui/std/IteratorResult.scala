package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `com.olvind.mui`.std.IteratorYieldResult[T]
  - `com.olvind.mui`.std.IteratorReturnResult[TReturn]
*/
trait IteratorResult[T, TReturn] extends StObject
object IteratorResult {
  
  inline def IteratorReturnResult[TReturn](value: TReturn): com.olvind.mui.std.IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[com.olvind.mui.std.IteratorReturnResult[TReturn]]
  }
  
  inline def IteratorYieldResult[T](value: T): com.olvind.mui.std.IteratorYieldResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[com.olvind.mui.std.IteratorYieldResult[T]]
  }
}
