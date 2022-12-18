package com.olvind.mui.muiSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @mui/system.@mui/system/createTheme/createBreakpoints.Breakpoint ]: number} */
trait Lg extends StObject {
  
  var lg: Double
  
  var md: Double
  
  var sm: Double
  
  var xl: Double
  
  var xs: Double
}
object Lg {
  
  inline def apply(lg: Double, md: Double, sm: Double, xl: Double, xs: Double): Lg = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lg] (val x: Self) extends AnyVal {
    
    inline def setLg(value: Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setSm(value: Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setXl(value: Double): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
    
    inline def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
  }
}
