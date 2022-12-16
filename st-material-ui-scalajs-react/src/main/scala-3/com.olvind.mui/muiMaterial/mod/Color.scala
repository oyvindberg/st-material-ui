package com.olvind.mui.muiMaterial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var `100`: String
  
  var `200`: String
  
  var `300`: String
  
  var `400`: String
  
  var `50`: String
  
  var `500`: String
  
  var `600`: String
  
  var `700`: String
  
  var `800`: String
  
  var `900`: String
  
  var A100: String
  
  var A200: String
  
  var A400: String
  
  var A700: String
}
object Color {
  
  inline def apply(
    `100`: String,
    `200`: String,
    `300`: String,
    `400`: String,
    `50`: String,
    `500`: String,
    `600`: String,
    `700`: String,
    `800`: String,
    `900`: String,
    A100: String,
    A200: String,
    A400: String,
    A700: String
  ): Color = {
    val __obj = js.Dynamic.literal(A100 = A100.asInstanceOf[js.Any], A200 = A200.asInstanceOf[js.Any], A400 = A400.asInstanceOf[js.Any], A700 = A700.asInstanceOf[js.Any])
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("50")(`50`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("600")(`600`.asInstanceOf[js.Any])
    __obj.updateDynamic("700")(`700`.asInstanceOf[js.Any])
    __obj.updateDynamic("800")(`800`.asInstanceOf[js.Any])
    __obj.updateDynamic("900")(`900`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def set100(value: String): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
    
    inline def set200(value: String): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set300(value: String): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
    
    inline def set400(value: String): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set50(value: String): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
    
    inline def set500(value: String): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
    
    inline def set600(value: String): Self = StObject.set(x, "600", value.asInstanceOf[js.Any])
    
    inline def set700(value: String): Self = StObject.set(x, "700", value.asInstanceOf[js.Any])
    
    inline def set800(value: String): Self = StObject.set(x, "800", value.asInstanceOf[js.Any])
    
    inline def set900(value: String): Self = StObject.set(x, "900", value.asInstanceOf[js.Any])
    
    inline def setA100(value: String): Self = StObject.set(x, "A100", value.asInstanceOf[js.Any])
    
    inline def setA200(value: String): Self = StObject.set(x, "A200", value.asInstanceOf[js.Any])
    
    inline def setA400(value: String): Self = StObject.set(x, "A400", value.asInstanceOf[js.Any])
    
    inline def setA700(value: String): Self = StObject.set(x, "A700", value.asInstanceOf[js.Any])
  }
}
