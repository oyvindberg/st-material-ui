package com.olvind.mui.react.mod

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardRefRenderFunction[T, P] extends StObject {
  
  def apply(props: P, ref: ForwardedRef[T]): Element | Null = js.native
  
  // explicit rejected with `never` required due to
  // https://github.com/microsoft/TypeScript/issues/36826
  /**
    * defaultProps are not supported on render functions
    */
  var defaultProps: js.UndefOr[scala.Nothing] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * propTypes are not supported on render functions
    */
  var propTypes: js.UndefOr[scala.Nothing] = js.native
}
