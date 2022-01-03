package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.li
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var defaultComponent: li
  
  var props: js.Object & AutoFocus
}
object `21` {
  
  inline def apply(props: js.Object & AutoFocus): `21` = {
    val __obj = js.Dynamic.literal(defaultComponent = "li", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setDefaultComponent(value: li): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & AutoFocus): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
