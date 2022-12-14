package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[SubheaderTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[SubheaderTypographyComponent] = js.undefined
}
object Component {
  
  inline def apply[SubheaderTypographyComponent /* <: ElementType */](): Component[SubheaderTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component[SubheaderTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Component[?], SubheaderTypographyComponent /* <: ElementType */] (val x: Self & Component[SubheaderTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: SubheaderTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
