package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arialabelledby extends StObject {
  
  var `aria-labelledby`: String | Null = js.native
  
  var hidden: Boolean = js.native
  
  var id: String | Null = js.native
}
object Arialabelledby {
  
  @scala.inline
  def apply(hidden: Boolean): Arialabelledby = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("aria-labelledby")(null)
    __obj.asInstanceOf[Arialabelledby]
  }
  
  @scala.inline
  implicit class ArialabelledbyMutableBuilder[Self <: Arialabelledby] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyNull`: Self = StObject.set(x, "aria-labelledby", null)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
  }
}
