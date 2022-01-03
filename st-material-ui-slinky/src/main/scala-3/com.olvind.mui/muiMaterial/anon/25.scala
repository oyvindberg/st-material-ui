package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var defaultComponent: div
  
  var props: js.Object & BackdropProps
}
object `25` {
  
  inline def apply(props: js.Object & BackdropProps): `25` = {
    val __obj = js.Dynamic.literal(defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & BackdropProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
