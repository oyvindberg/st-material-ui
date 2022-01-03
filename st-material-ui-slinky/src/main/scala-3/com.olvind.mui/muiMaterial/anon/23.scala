package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var defaultComponent: ul
  
  var props: js.Object & AutoFocusItem
}
object `23` {
  
  inline def apply(props: js.Object & AutoFocusItem): `23` = {
    val __obj = js.Dynamic.literal(defaultComponent = "ul", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setDefaultComponent(value: ul): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & AutoFocusItem): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
