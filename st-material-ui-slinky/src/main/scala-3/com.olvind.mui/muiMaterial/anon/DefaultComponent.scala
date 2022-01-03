package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponent[P, D /* <: ReactElement */] extends StObject {
  
  var defaultComponent: D
  
  var props: P & Children
}
object DefaultComponent {
  
  inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Children): DefaultComponent[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponent[P, D]]
  }
  
  extension [Self <: DefaultComponent[?, ?], P, D /* <: ReactElement */](x: Self & (DefaultComponent[P, D])) {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
