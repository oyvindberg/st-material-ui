package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29`[P, D /* <: ElementType */] extends StObject {
  
  var defaultComponent: D
  
  var props: P & IconPosition
}
object `29` {
  
  inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & IconPosition): `29`[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`[P, D]]
  }
  
  extension [Self <: `29`[?, ?], P, D /* <: ElementType */](x: Self & (`29`[P, D])) {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & IconPosition): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
