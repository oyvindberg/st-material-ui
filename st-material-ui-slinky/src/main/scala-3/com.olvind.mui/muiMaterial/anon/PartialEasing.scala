package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/createTransitions.Easing> */
trait PartialEasing extends StObject {
  
  var easeIn: js.UndefOr[String] = js.undefined
  
  var easeInOut: js.UndefOr[String] = js.undefined
  
  var easeOut: js.UndefOr[String] = js.undefined
  
  var sharp: js.UndefOr[String] = js.undefined
}
object PartialEasing {
  
  inline def apply(): PartialEasing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEasing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialEasing] (val x: Self) extends AnyVal {
    
    inline def setEaseIn(value: String): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
    
    inline def setEaseInOut(value: String): Self = StObject.set(x, "easeInOut", value.asInstanceOf[js.Any])
    
    inline def setEaseInOutUndefined: Self = StObject.set(x, "easeInOut", js.undefined)
    
    inline def setEaseInUndefined: Self = StObject.set(x, "easeIn", js.undefined)
    
    inline def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
    
    inline def setEaseOutUndefined: Self = StObject.set(x, "easeOut", js.undefined)
    
    inline def setSharp(value: String): Self = StObject.set(x, "sharp", value.asInstanceOf[js.Any])
    
    inline def setSharpUndefined: Self = StObject.set(x, "sharp", js.undefined)
  }
}
