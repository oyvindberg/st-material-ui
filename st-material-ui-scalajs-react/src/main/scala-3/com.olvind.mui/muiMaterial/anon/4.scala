package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var defaultComponent: button
  
  var props: js.Object & DisableElevation
}
object `4` {
  
  inline def apply(props: js.Object & DisableElevation): `4` = {
    val __obj = js.Dynamic.literal(defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setDefaultComponent(value: button): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & DisableElevation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
