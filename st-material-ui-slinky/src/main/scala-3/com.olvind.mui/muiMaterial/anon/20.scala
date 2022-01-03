package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20`[P, D /* <: ReactElement */] extends StObject {
  
  var defaultComponent: D
  
  var props: P & AutoFocus
}
object `20` {
  
  inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & AutoFocus): `20`[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`[P, D]]
  }
  
  extension [Self <: `20`[?, ?], P, D /* <: ReactElement */](x: Self & (`20`[P, D])) {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & AutoFocus): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
