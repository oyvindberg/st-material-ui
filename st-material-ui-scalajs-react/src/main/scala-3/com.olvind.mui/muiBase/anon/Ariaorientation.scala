package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ariaorientation extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var `aria-orientation`: String | Null
  
  var ref: com.olvind.mui.react.mod.Ref[Any]
  
  var role: String
}
object Ariaorientation {
  
  inline def apply(role: String): Ariaorientation = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], ref = null)
    __obj.updateDynamic("aria-orientation")(null)
    __obj.asInstanceOf[Ariaorientation]
  }
  
  extension [Self <: Ariaorientation](x: Self) {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-orientation`(value: String): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `setAria-orientationNull`: Self = StObject.set(x, "aria-orientation", null)
    
    inline def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
