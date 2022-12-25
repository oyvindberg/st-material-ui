package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesShadowMod {
  
  trait Shadow extends StObject {
    
    var lg: String
    
    var md: String
    
    var sm: String
    
    var xl: String
    
    var xs: String
  }
  object Shadow {
    
    inline def apply(lg: String, md: String, sm: String, xl: String, xs: String): Shadow = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shadow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shadow] (val x: Self) extends AnyVal {
      
      inline def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXs(value: String): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    }
  }
}
