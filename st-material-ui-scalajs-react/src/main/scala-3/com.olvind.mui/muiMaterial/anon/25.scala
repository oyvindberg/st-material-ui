package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var defaultComponent: "div"
  
  var props: BackdropProps
}
object `25` {
  
  inline def apply(props: BackdropProps): `25` = {
    val __obj = js.Dynamic.literal(defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `25`] (val x: Self) extends AnyVal {
    
    inline def setDefaultComponent(value: "div"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: BackdropProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
