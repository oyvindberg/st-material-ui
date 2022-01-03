package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRootProps extends StObject {
  
  def getRootProps(): Arialabelledby
  
  var hidden: Boolean
}
object GetRootProps {
  
  inline def apply(getRootProps: CallbackTo[Arialabelledby], hidden: Boolean): GetRootProps = {
    val __obj = js.Dynamic.literal(getRootProps = getRootProps.toJsFn, hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRootProps]
  }
  
  extension [Self <: GetRootProps](x: Self) {
    
    inline def setGetRootProps(value: CallbackTo[Arialabelledby]): Self = StObject.set(x, "getRootProps", value.toJsFn)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
