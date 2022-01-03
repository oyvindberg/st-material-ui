package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameProps[Props, Name /* <: /* keyof any */ String */] extends StObject {
  
  var name: Name
  
  var props: Props
}
object NameProps {
  
  inline def apply[Props, Name /* <: /* keyof any */ String */](name: Name, props: Props): NameProps[Props, Name] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameProps[Props, Name]]
  }
  
  extension [Self <: NameProps[?, ?], Props, Name /* <: /* keyof any */ String */](x: Self & (NameProps[Props, Name])) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
