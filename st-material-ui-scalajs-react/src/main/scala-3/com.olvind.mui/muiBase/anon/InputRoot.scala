package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputRoot extends StObject {
  
  var input: js.UndefOr[ComponentPropsWithRefinput] = js.undefined
  
  var root: js.UndefOr[ComponentPropsWithRefdiv] = js.undefined
}
object InputRoot {
  
  inline def apply(): InputRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputRoot]
  }
  
  extension [Self <: InputRoot](x: Self) {
    
    inline def setInput(value: ComponentPropsWithRefinput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: ComponentPropsWithRefdiv): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
