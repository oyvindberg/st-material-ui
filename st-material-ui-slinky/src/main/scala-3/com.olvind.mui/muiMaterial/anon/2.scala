package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var defaultComponent: "span"
  
  var props: Color
}
object `2` {
  
  inline def apply(props: Color): `2` = {
    val __obj = js.Dynamic.literal(defaultComponent = "span", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setDefaultComponent(value: "span"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Color): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
