package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set[T] extends StObject {
  
  /* standard es2015.collection */
  def add(value: T): this.type = js.native
  
  /* standard es2015.collection */
  def clear(): Unit = js.native
  
  /* standard es2015.collection */
  def delete(value: T): Boolean = js.native
  
  /**
    * Returns an iterable of [v,v] pairs for every value `v` in the set.
    */
  /* standard es2015.iterable */
  def entries(): IterableIterator[js.Tuple2[T, T]] = js.native
  
  /* standard es2015.collection */
  def forEach(callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit], thisArg: Any): Unit = js.native
  
  /* standard es2015.collection */
  def has(value: T): Boolean = js.native
  
  /** Iterates over values in the set. */
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  
  /**
    * Despite its name, returns an iterable of the values in the set.
    */
  /* standard es2015.iterable */
  def keys(): IterableIterator[T] = js.native
  
  /* standard es2015.collection */
  val size: Double = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  
  /**
    * Returns an iterable of values in the set.
    */
  /* standard es2015.iterable */
  def values(): IterableIterator[T] = js.native
}
