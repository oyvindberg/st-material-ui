package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemButtonListItemButtonMod.ListItemButtonBaseProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19`[P, D /* <: ReactElement */] extends StObject {
  
  var defaultComponent: D
  
  var props: P & ListItemButtonBaseProps
}
object `19` {
  
  inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & ListItemButtonBaseProps): `19`[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`[P, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`[?, ?], P, D /* <: ReactElement */] (val x: Self & (`19`[P, D])) extends AnyVal {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & ListItemButtonBaseProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
