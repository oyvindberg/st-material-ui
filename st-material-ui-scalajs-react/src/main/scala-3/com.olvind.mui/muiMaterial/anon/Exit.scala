package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exit extends StObject {
  
  var enter: js.UndefOr[Double] = js.undefined
  
  var exit: js.UndefOr[Double] = js.undefined
}
object Exit {
  
  inline def apply(): Exit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exit] (val x: Self) extends AnyVal {
    
    inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
