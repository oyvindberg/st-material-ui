package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[TitleTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[TitleTypographyComponent] = js.undefined
}
object `6` {
  
  inline def apply[TitleTypographyComponent /* <: ElementType */](): `6`[TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[TitleTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`[?], TitleTypographyComponent /* <: ElementType */] (val x: Self & `6`[TitleTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: TitleTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
