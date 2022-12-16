package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var defaultComponent: "li"
  
  var props: AutoFocus
}
object `21` {
  
  inline def apply(props: AutoFocus): `21` = {
    val __obj = js.Dynamic.literal(defaultComponent = "li", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setDefaultComponent(value: "li"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: AutoFocus): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
