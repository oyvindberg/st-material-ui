package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.stylesTypesUtilsMod.OverridableRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesRadiusMod {
  
  trait DefaultRadius extends StObject {
    
    var lg: String
    
    var md: String
    
    var sm: String
    
    var xl: String
    
    var xs: String
  }
  object DefaultRadius {
    
    inline def apply(lg: String, md: String, sm: String, xl: String, xs: String): DefaultRadius = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultRadius]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultRadius] (val x: Self) extends AnyVal {
      
      inline def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXs(value: String): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    }
  }
  
  type Radius = OverridableRecord[DefaultRadius, RadiusOverrides, String]
  
  trait RadiusOverrides extends StObject
}
