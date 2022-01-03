package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  var defaultComponent: div
  
  var props: js.Object & Children
}
object Props {
  
  inline def apply(props: js.Object & Children): Props = {
    val __obj = js.Dynamic.literal(defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  extension [Self <: Props](x: Self) {
    
    inline def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
