package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabelledby extends StObject {
  
  var `aria-labelledby`: String | Null
  
  var hidden: Boolean
  
  var id: String | Null
}
object Arialabelledby {
  
  inline def apply(hidden: Boolean): Arialabelledby = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("aria-labelledby")(null)
    __obj.asInstanceOf[Arialabelledby]
  }
  
  extension [Self <: Arialabelledby](x: Self) {
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyNull`: Self = StObject.set(x, "aria-labelledby", null)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
  }
}
