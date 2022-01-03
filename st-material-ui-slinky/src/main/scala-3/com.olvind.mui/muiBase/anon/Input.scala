package com.olvind.mui.muiBase.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var Input: js.UndefOr[ReactElement] = js.undefined
  
  var Root: js.UndefOr[ReactElement] = js.undefined
  
  var Textarea: js.UndefOr[ReactElement] = js.undefined
}
object Input {
  
  inline def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setInput(value: ReactElement): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    
    inline def setTextarea(value: ReactElement): Self = StObject.set(x, "Textarea", value.asInstanceOf[js.Any])
    
    inline def setTextareaUndefined: Self = StObject.set(x, "Textarea", js.undefined)
  }
}
