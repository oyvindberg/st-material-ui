package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var defaultComponent: div
  
  var props: js.Object & IconPosition
}
object `30` {
  
  inline def apply(props: js.Object & IconPosition): `30` = {
    val __obj = js.Dynamic.literal(defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & IconPosition): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
