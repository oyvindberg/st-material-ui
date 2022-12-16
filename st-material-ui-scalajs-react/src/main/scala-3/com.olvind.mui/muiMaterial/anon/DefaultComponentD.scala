package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponentD[P, D /* <: ElementType */] extends StObject {
  
  var defaultComponent: D
  
  var props: P & Icon
}
object DefaultComponentD {
  
  inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Icon): DefaultComponentD[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponentD[P, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultComponentD[?, ?], P, D /* <: ElementType */] (val x: Self & (DefaultComponentD[P, D])) extends AnyVal {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Icon): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
