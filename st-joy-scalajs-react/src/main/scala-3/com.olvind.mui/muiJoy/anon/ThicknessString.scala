package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThicknessString extends StObject {
  
  var thickness: String
}
object ThicknessString {
  
  inline def apply(thickness: String): ThicknessString = {
    val __obj = js.Dynamic.literal(thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThicknessString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThicknessString] (val x: Self) extends AnyVal {
    
    inline def setThickness(value: String): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
