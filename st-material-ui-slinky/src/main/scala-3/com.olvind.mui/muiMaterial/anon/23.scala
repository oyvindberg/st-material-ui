package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var defaultComponent: "ul"
  
  var props: AutoFocusItem
}
object `23` {
  
  inline def apply(props: AutoFocusItem): `23` = {
    val __obj = js.Dynamic.literal(defaultComponent = "ul", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `23`] (val x: Self) extends AnyVal {
    
    inline def setDefaultComponent(value: "ul"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: AutoFocusItem): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
