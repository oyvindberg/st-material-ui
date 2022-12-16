package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[P, D /* <: ReactElement */] extends StObject {
  
  var defaultComponent: D
  
  var props: P & FocusVisibleClassName
}
object `4` {
  
  inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & FocusVisibleClassName): `4`[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`[P, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`[?, ?], P, D /* <: ReactElement */] (val x: Self & (`4`[P, D])) extends AnyVal {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & FocusVisibleClassName): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
