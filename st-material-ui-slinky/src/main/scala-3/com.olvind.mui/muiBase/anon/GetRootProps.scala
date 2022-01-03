package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRootProps extends StObject {
  
  def getRootProps(): Arialabelledby
  
  var hidden: Boolean
}
object GetRootProps {
  
  inline def apply(getRootProps: () => Arialabelledby, hidden: Boolean): GetRootProps = {
    val __obj = js.Dynamic.literal(getRootProps = js.Any.fromFunction0(getRootProps), hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRootProps]
  }
  
  extension [Self <: GetRootProps](x: Self) {
    
    inline def setGetRootProps(value: () => Arialabelledby): Self = StObject.set(x, "getRootProps", js.Any.fromFunction0(value))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
