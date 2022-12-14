package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlinedHoverColor extends StObject {
  
  var outlinedHoverColor: String
  
  var plainHoverColor: String
  
  var softHoverColor: String
}
object OutlinedHoverColor {
  
  inline def apply(outlinedHoverColor: String, plainHoverColor: String, softHoverColor: String): OutlinedHoverColor = {
    val __obj = js.Dynamic.literal(outlinedHoverColor = outlinedHoverColor.asInstanceOf[js.Any], plainHoverColor = plainHoverColor.asInstanceOf[js.Any], softHoverColor = softHoverColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlinedHoverColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutlinedHoverColor] (val x: Self) extends AnyVal {
    
    inline def setOutlinedHoverColor(value: String): Self = StObject.set(x, "outlinedHoverColor", value.asInstanceOf[js.Any])
    
    inline def setPlainHoverColor(value: String): Self = StObject.set(x, "plainHoverColor", value.asInstanceOf[js.Any])
    
    inline def setSoftHoverColor(value: String): Self = StObject.set(x, "softHoverColor", value.asInstanceOf[js.Any])
  }
}
