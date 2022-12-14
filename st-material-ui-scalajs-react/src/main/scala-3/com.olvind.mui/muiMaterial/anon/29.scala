package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var defaultComponent: "div"
  
  var props: IconPosition
}
object `29` {
  
  inline def apply(props: IconPosition): `29` = {
    val __obj = js.Dynamic.literal(defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `29`] (val x: Self) extends AnyVal {
    
    inline def setDefaultComponent(value: "div"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: IconPosition): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
