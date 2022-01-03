package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRootProps extends StObject {
  
  def getRootProps(): Arialabelledby = js.native
  
  var hidden: Boolean = js.native
}
object GetRootProps {
  
  @scala.inline
  def apply(getRootProps: CallbackTo[Arialabelledby], hidden: Boolean): GetRootProps = {
    val __obj = js.Dynamic.literal(getRootProps = getRootProps.toJsFn, hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRootProps]
  }
  
  @scala.inline
  implicit class GetRootPropsMutableBuilder[Self <: GetRootProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRootProps(value: CallbackTo[Arialabelledby]): Self = StObject.set(x, "getRootProps", value.toJsFn)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
