package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[SubheaderTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[SubheaderTypographyComponent] = js.undefined
}
object `6` {
  
  inline def apply[SubheaderTypographyComponent /* <: ElementType */](): `6`[SubheaderTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[SubheaderTypographyComponent]]
  }
  
  extension [Self <: `6`[?], SubheaderTypographyComponent /* <: ElementType */](x: Self & `6`[SubheaderTypographyComponent]) {
    
    inline def setComponent(value: SubheaderTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
