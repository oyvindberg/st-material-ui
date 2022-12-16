package com.olvind.mui.std

import org.scalajs.dom.SVGAnimatedLength
import org.scalajs.dom.SVGAnimatedString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGFilterPrimitiveStandardAttributes extends StObject {
  
  /* standard dom */
  val height: SVGAnimatedLength
  
  /* standard dom */
  val result: SVGAnimatedString
  
  /* standard dom */
  val width: SVGAnimatedLength
  
  /* standard dom */
  val x: SVGAnimatedLength
  
  /* standard dom */
  val y: SVGAnimatedLength
}
object SVGFilterPrimitiveStandardAttributes {
  
  inline def apply(
    height: SVGAnimatedLength,
    result: SVGAnimatedString,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    y: SVGAnimatedLength
  ): SVGFilterPrimitiveStandardAttributes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFilterPrimitiveStandardAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGFilterPrimitiveStandardAttributes] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setResult(value: SVGAnimatedString): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
