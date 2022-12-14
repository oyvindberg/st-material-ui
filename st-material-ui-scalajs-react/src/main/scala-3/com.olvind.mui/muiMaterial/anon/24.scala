package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var defaultComponent: "li"
  
  var props: AutoFocus
}
object `24` {
  
  inline def apply(props: AutoFocus): `24` = {
    val __obj = js.Dynamic.literal(defaultComponent = "li", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `24`] (val x: Self) extends AnyVal {
    
    inline def setDefaultComponent(value: "li"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: AutoFocus): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
