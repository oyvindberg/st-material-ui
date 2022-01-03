package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndAdornment extends StObject {
  
  var className: String = js.native
  
  var endAdornment: ReactElement = js.native
  
  var ref: com.olvind.mui.react.mod.Ref[Any] = js.native
  
  var startAdornment: ReactElement = js.native
}
object EndAdornment {
  
  @scala.inline
  def apply(className: String, endAdornment: ReactElement, startAdornment: ReactElement): EndAdornment = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], endAdornment = endAdornment.asInstanceOf[js.Any], startAdornment = startAdornment.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[EndAdornment]
  }
  
  @scala.inline
  implicit class EndAdornmentMutableBuilder[Self <: EndAdornment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAdornment(value: ReactElement): Self = StObject.set(x, "endAdornment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAdornment(value: ReactElement): Self = StObject.set(x, "startAdornment", value.asInstanceOf[js.Any])
  }
}
