package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.disabled
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoredProps[P, D /* <: ReactElement */] extends StObject {
  
  var defaultComponent: D
  
  var ignoredProps: disabled
  
  var props: P & Optional
}
object IgnoredProps {
  
  inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Optional): IgnoredProps[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], ignoredProps = "disabled", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoredProps[P, D]]
  }
  
  extension [Self <: IgnoredProps[?, ?], P, D /* <: ReactElement */](x: Self & (IgnoredProps[P, D])) {
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setIgnoredProps(value: disabled): Self = StObject.set(x, "ignoredProps", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Optional): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
