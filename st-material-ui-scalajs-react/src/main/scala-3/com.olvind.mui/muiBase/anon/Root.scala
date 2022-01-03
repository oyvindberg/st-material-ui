package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var Root: js.UndefOr[ElementType] = js.undefined
}
object Root {
  
  inline def apply(): Root = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Root]
  }
  
  extension [Self <: Root](x: Self) {
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}
