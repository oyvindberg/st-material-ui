package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemButtonListItemButtonMod.ListItemButtonBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var defaultComponent: "div"
  
  var props: ListItemButtonBaseProps
}
object `20` {
  
  inline def apply(props: ListItemButtonBaseProps): `20` = {
    val __obj = js.Dynamic.literal(defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `20`] (val x: Self) extends AnyVal {
    
    inline def setDefaultComponent(value: "div"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: ListItemButtonBaseProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
