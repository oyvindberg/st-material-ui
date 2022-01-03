package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var backgroundColor: String
  
  var border: String
  
  var borderRadius: Double
  
  var minHeight: Double
}
object Border {
  
  inline def apply(backgroundColor: String, border: String, borderRadius: Double, minHeight: Double): Border = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
  }
}
