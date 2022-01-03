package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var defaultComponent: button
  
  var props: js.Object & Edge
}
object `12` {
  
  inline def apply(props: js.Object & Edge): `12` = {
    val __obj = js.Dynamic.literal(defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setDefaultComponent(value: button): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & Edge): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
