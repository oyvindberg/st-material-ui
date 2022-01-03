package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Border extends StObject {
  
  var backgroundColor: String = js.native
  
  var border: String = js.native
  
  var borderRadius: Double = js.native
  
  var minHeight: Double = js.native
}
object Border {
  
  @scala.inline
  def apply(backgroundColor: String, border: String, borderRadius: Double, minHeight: Double): Border = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
  }
}
