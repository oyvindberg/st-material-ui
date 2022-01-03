package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var defaultComponent: span
  
  var props: js.Object & PartialOmitFadePropschildren & Sx
}
object `0` {
  
  inline def apply(props: js.Object & PartialOmitFadePropschildren & Sx): `0` = {
    val __obj = js.Dynamic.literal(defaultComponent = "span", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setDefaultComponent(value: span): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & PartialOmitFadePropschildren & Sx): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
