package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24`[P, D /* <: ElementType */] extends StObject {
  
  var defaultComponent: D
  
  var props: P & BackdropComponent
}
object `24` {
  
  inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & BackdropComponent): `24`[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`[P, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `24`[?, ?], P, D /* <: ElementType */] (val x: Self & (`24`[P, D])) extends AnyVal {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & BackdropComponent): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
