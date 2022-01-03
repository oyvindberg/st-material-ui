package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[TitleTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[TitleTypographyComponent] = js.undefined
}
object `7` {
  
  inline def apply[TitleTypographyComponent /* <: ElementType */](): `7`[TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[TitleTypographyComponent]]
  }
  
  extension [Self <: `7`[?], TitleTypographyComponent /* <: ElementType */](x: Self & `7`[TitleTypographyComponent]) {
    
    inline def setComponent(value: TitleTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
