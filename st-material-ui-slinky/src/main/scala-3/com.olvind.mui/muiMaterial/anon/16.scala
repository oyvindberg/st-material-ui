package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var defaultComponent: "label"
  
  var props: Focused
}
object `16` {
  
  inline def apply(props: Focused): `16` = {
    val __obj = js.Dynamic.literal(defaultComponent = "label", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `16`] (val x: Self) extends AnyVal {
    
    inline def setDefaultComponent(value: "label"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Focused): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
