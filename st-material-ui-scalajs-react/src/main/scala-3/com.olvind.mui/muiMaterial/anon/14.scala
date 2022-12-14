package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var defaultComponent: "button"
  
  var props: Edge
}
object `14` {
  
  inline def apply(props: Edge): `14` = {
    val __obj = js.Dynamic.literal(defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`] (val x: Self) extends AnyVal {
    
    inline def setDefaultComponent(value: "button"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Edge): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
