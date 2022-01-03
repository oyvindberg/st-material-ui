package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var Input: js.UndefOr[ReactElement] = js.undefined
  
  var Root: js.UndefOr[ReactElement] = js.undefined
}
object Root {
  
  inline def apply(): Root = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Root]
  }
  
  extension [Self <: Root](x: Self) {
    
    inline def setInput(value: ReactElement): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}
