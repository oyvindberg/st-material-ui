package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndAdornment extends StObject {
  
  var className: String
  
  var endAdornment: ReactElement
  
  var ref: com.olvind.mui.react.mod.Ref[Any]
  
  var startAdornment: ReactElement
}
object EndAdornment {
  
  inline def apply(className: String, endAdornment: ReactElement, startAdornment: ReactElement): EndAdornment = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], endAdornment = endAdornment.asInstanceOf[js.Any], startAdornment = startAdornment.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[EndAdornment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndAdornment] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setEndAdornment(value: ReactElement): Self = StObject.set(x, "endAdornment", value.asInstanceOf[js.Any])
    
    inline def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setStartAdornment(value: ReactElement): Self = StObject.set(x, "startAdornment", value.asInstanceOf[js.Any])
  }
}
