package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  var defaultComponent: span
  
  var props: js.Object & Active
}
object `35` {
  
  inline def apply(props: js.Object & Active): `35` = {
    val __obj = js.Dynamic.literal(defaultComponent = "span", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`35`]
  }
  
  extension [Self <: `35`](x: Self) {
    
    inline def setDefaultComponent(value: span): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & Active): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
