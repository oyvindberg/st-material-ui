package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponentDProps[P, D /* <: ReactElement */] extends StObject {
  
  var defaultComponent: D
  
  var props: P & DisableElevation
}
object DefaultComponentDProps {
  
  inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & DisableElevation): DefaultComponentDProps[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponentDProps[P, D]]
  }
  
  extension [Self <: DefaultComponentDProps[?, ?], P, D /* <: ReactElement */](x: Self & (DefaultComponentDProps[P, D])) {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & DisableElevation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
