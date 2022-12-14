package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  var defaultComponent: "span"
  
  var props: js.Object & ClassesColor
}
object `28` {
  
  inline def apply(props: js.Object & ClassesColor): `28` = {
    val __obj = js.Dynamic.literal(defaultComponent = "span", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`28`]
  }
  
  extension [Self <: `28`](x: Self) {
    
    inline def setDefaultComponent(value: "span"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & ClassesColor): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
