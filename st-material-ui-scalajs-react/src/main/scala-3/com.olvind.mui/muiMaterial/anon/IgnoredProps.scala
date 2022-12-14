package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoredProps[P, D /* <: ElementType */] extends StObject {
  
  var defaultComponent: D
  
  var ignoredProps: "disabled"
  
  var props: P & Optional
}
object IgnoredProps {
  
  inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Optional): IgnoredProps[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], ignoredProps = "disabled", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoredProps[P, D]]
  }
  
  extension [Self <: IgnoredProps[?, ?], P, D /* <: ElementType */](x: Self & (IgnoredProps[P, D])) {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setIgnoredProps(value: "disabled"): Self = StObject.set(x, "ignoredProps", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Optional): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
