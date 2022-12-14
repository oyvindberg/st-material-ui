package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponentProps[P, D /* <: ReactElement */] extends StObject {
  
  var defaultComponent: D
  
  var props: P & AnchorOrigin
}
object DefaultComponentProps {
  
  inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & AnchorOrigin): DefaultComponentProps[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponentProps[P, D]]
  }
  
  extension [Self <: DefaultComponentProps[?, ?], P, D /* <: ReactElement */](x: Self & (DefaultComponentProps[P, D])) {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & AnchorOrigin): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
