package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.propTypes.mod.ReactElementLike
import com.olvind.mui.propTypes.mod.ReactNodeLike
import com.olvind.mui.propTypes.mod.Requireable
import com.olvind.mui.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var children: Validator[ReactElementLike]
  
  var className: Requireable[String]
  
  var value: Requireable[ReactNodeLike]
}
object Value {
  
  inline def apply(
    children: Validator[ReactElementLike],
    className: Requireable[String],
    value: Requireable[ReactNodeLike]
  ): Value = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Validator[ReactElementLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
